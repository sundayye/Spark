package com.ssc.ssgm.fx.ifx.integration.curd.service;

import com.ssc.ssgm.fx.ifx.integration.core.config.InboundConfig;
import com.ssc.ssgm.fx.ifx.integration.core.inbound.SourceInTypeEnum;
import com.ssc.ssgm.fx.ifx.integration.curd.mapper.InboundConfigMapper;
import com.ssc.ssgm.fx.ifx.integration.curd.model.InboundConfigEntity;
import com.ssc.ssgm.fx.ifx.integration.curd.model.InboundConfigExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InboundConfigService {

    @Autowired
    InboundConfigMapper inboundConfigMapper;

    public List<InboundConfig> loadAll() {
        InboundConfigExample inboundConfigExample = new InboundConfigExample();
        final List<InboundConfigEntity> flowConfigs = inboundConfigMapper.selectByExampleWithBLOBs(inboundConfigExample);
        final List<InboundConfig> collect = flowConfigs.stream().map(e -> {
            InboundConfig config = new InboundConfig();
            BeanUtils.copyProperties(e, config);
            config.setInboundType(SourceInTypeEnum.valueOf(e.getInboundType()));
            return config;
        }).collect(Collectors.toList());
        return collect;
    }

    public int addConfig(InboundConfig config) {
        InboundConfigEntity entity = new InboundConfigEntity();
        BeanUtils.copyProperties(config, entity);
        entity.setInboundType(config.getInboundType().name());
        return inboundConfigMapper.insert(entity);
    }

    public int disableConfig(String  name){
        return inboundConfigMapper.deleteByName(name);
    }

}
