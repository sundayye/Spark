
package com.ssc.ssgm.fx.ifx.integration.ui.controller;

import com.ssc.ssgm.fx.ifx.integration.api.HackthonContext;
import com.ssc.ssgm.fx.ifx.integration.common.Response;
import com.ssc.ssgm.fx.ifx.integration.core.config.InboundConfig;
import com.ssc.ssgm.fx.ifx.integration.core.config.OutboundConfig;
import com.ssc.ssgm.fx.ifx.integration.core.outbound.SourceOutTypeEnum;
import com.ssc.ssgm.fx.ifx.integration.curd.service.OutboundConfigService;
import com.ssc.ssgm.fx.ifx.integration.util.JsonUtil;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/api/outbound")
@ApiOperation("outbound api")
@Slf4j
public class OutboundController {

    @Autowired
    OutboundConfigService outboundConfigService;

    @ApiOperation("get_type")
    @GetMapping("/get_types")
    public Response<List<String>> getTypes() {
        List<SourceOutTypeEnum> typeEunmList = Arrays.asList(SourceOutTypeEnum.values());
        List<String> typeList = typeEunmList.stream().map(e ->{
            return e.toString();
        } ).collect(Collectors.toList());
        return Response.success(typeList);
    }

    @ApiOperation("list")
    @GetMapping("/list")
    public Response<List<OutboundConfig>> list() {
        List<OutboundConfig> outboundConfigs = outboundConfigService.loadAll();
        outboundConfigs.stream().forEach(e -> {
            HackthonContext.outboundMap.put(e.getName(), e);
        });
        return Response.success(outboundConfigs);
    }

    @ApiOperation("disable")
    @PostMapping("/disable")
    public Response<?> disable(@RequestParam("name") String name) {
        if (outboundConfigService.disableConfig(name) != 1) {
            log.error("Disable config failed. No Inbound config found with Name： {} ." ,name);
            return Response.fail();
        }
        Map<String, OutboundConfig> tmpMap = new HashedMap(HackthonContext.outboundMap);
        tmpMap.forEach((key,value)->{
            OutboundConfig outboundConfig = value;
            if (outboundConfig.getName().equals(name)) {
                HackthonContext.outboundMap.remove(key);
            }

        });
        return Response.success();
    }

    @ApiOperation("create")
    @PostMapping("/create")
    public Response<?> create(@RequestParam("file") MultipartFile file,
                              @RequestParam("outboundType") String outboundType,
                              HttpServletRequest request) {
        OutboundConfig config = new OutboundConfig();
        config.setName(file.getName());
        config.setOutboundType(SourceOutTypeEnum.valueOf(outboundType));
        try {
            config.setProperties(JsonUtil.byteToJson(file.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(outboundConfigService.addConfig(config) !=1){
            log.error("Outbound config creation failed.");
            return Response.fail();
        }
        HackthonContext.outboundMap.put(config.getName(), config);
        return Response.success();
    }

}
