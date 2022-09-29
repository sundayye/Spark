
package com.ssc.ssgm.fx.ifx.integration.ui.controller;

import com.ssc.ssgm.fx.ifx.integration.api.HackthonContext;
import com.ssc.ssgm.fx.ifx.integration.common.Response;
import com.ssc.ssgm.fx.ifx.integration.curd.service.FlowConfigService;
import com.ssc.ssgm.fx.ifx.integration.curd.service.InboundConfigService;
import com.ssc.ssgm.fx.ifx.integration.curd.service.KeyMapperConfigService;
import com.ssc.ssgm.fx.ifx.integration.curd.service.OutboundConfigService;
import com.ssc.ssgm.fx.ifx.integration.ui.dto.FlowDTO;
import io.swagger.annotations.ApiOperation;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ssc.ssgm.fx.ifx.integration.core.config.KeyMapperConfig;
import com.ssc.ssgm.fx.ifx.integration.core.flow.FlowTransActionType;
import com.ssc.ssgm.fx.ifx.integration.core.parser.ParserEnum;

@RestController
@RequestMapping(value = "/api/flow")
@ApiOperation("flow api")
@Slf4j
public class FlowController {

    @Autowired
    FlowConfigService flowConfigService;


    @ApiOperation("get_flow_types")
    @GetMapping("/get_flow_types")
    public Response<List<String>> getFlowTypes() {
        List<FlowTransActionType> typeEunmList = Arrays.asList(FlowTransActionType.values());
        List<String> typeList = typeEunmList.stream().map(e ->{
            return e.toString();
        } ).collect(Collectors.toList());
        return Response.success(typeList);
    }

    @ApiOperation("get_inbounds")
    @GetMapping("/get_inbounds")
    public Response<?> getInbounds() {
        Set<String>  inboundSet= HackthonContext.inboundMap.keySet();
        List<KeyValue> inbounds = inboundSet.stream().map(e ->{
            KeyValue tKeyValue = new KeyValue();
            tKeyValue.setLabel(e);
            tKeyValue.setName(e);
            return tKeyValue;
        }).collect(Collectors.toList());
        return Response.success(inbounds);
    }

    @ApiOperation("get_parsers")
    @GetMapping("/get_parsers")
    public Response<?> getParsers() {
        List<ParserEnum> typeEunmList = Arrays.asList(ParserEnum.values());
        List<String> typeList = typeEunmList.stream().map(e ->{
            return e.toString();
        } ).collect(Collectors.toList());
        return Response.success(typeList);
    }

    @ApiOperation("get_key_mappers")
    @GetMapping("/get_key_mappers")
    public Response<?> get_key_mappers() {

        return Response.success();
    }

    @ApiOperation("get_formatters")
    @GetMapping("/get_formatters")
    public Response<?> get_formatters() {
        return Response.success();
    }


    @ApiOperation("get_outbounds")
    @GetMapping("/get_outbounds")
    public Response<?> getOutbounds() {
        return Response.success();
    }

    @ApiOperation("list")
    @GetMapping("/list")
    public Response<?> list() {
        return Response.success();
    }

    @ApiOperation("start")
    @PostMapping("/start")
    public Response<?> start(@RequestBody FlowDTO flowDTO) {
        return Response.success();
    }

    @ApiOperation("pause")
    @PostMapping("/pause")
    public Response<?> pause(@RequestBody FlowDTO flowDTO) {
        return Response.success();
    }

    @ApiOperation("stop")
    @PostMapping("/stop")
    public Response<?> stop(@RequestBody FlowDTO flowDTO) {
        return Response.success();
    }

}
