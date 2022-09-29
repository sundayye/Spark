package com.ssc.ssgm.fx.ifx.integration.curd.service;

import com.ssc.ssgm.fx.ifx.integration.core.config.OutboundConfig;
import com.ssc.ssgm.fx.ifx.integration.core.outbound.SourceOutTypeEnum;
import com.ssc.ssgm.fx.ifx.integration.curd.mapper.OutboundConfigMapper;
import com.ssc.ssgm.fx.ifx.integration.curd.model.OutboundConfigEntity;
import com.ssc.ssgm.fx.ifx.integration.curd.model.OutboundConfigExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OutboundConfigService {

    @Autowired
    OutboundConfigMapper outboundConfigMapper;

    public List<OutboundConfig> loadAll() {
        OutboundConfigExample inboundConfigExample = new OutboundConfigExample();
        final List<OutboundConfigEntity> flowConfigs = outboundConfigMapper.selectByExampleWithBLOBs(inboundConfigExample);
        final List<OutboundConfig> collect = flowConfigs.stream().map(e -> {
            OutboundConfig config = new OutboundConfig();
            BeanUtils.copyProperties(e, config);
            config.setOutboundType(SourceOutTypeEnum.valueOf(e.getOutboundType()));
            return config;
        }).collect(Collectors.toList());
        return collect;
    }

    public int addConfig(OutboundConfig config) {
        OutboundConfigEntity entity = new OutboundConfigEntity();
        BeanUtils.copyProperties(config, entity);
        entity.setOutboundType(config.getOutboundType().name());
        return outboundConfigMapper.insert(entity);

    }

    public int disableConfig(Long id) {
        return outboundConfigMapper.deleteById(Long.toString(id));
    }
}
