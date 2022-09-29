package com.ssc.ssgm.fx.ifx.integration.core.config;

import com.ssc.ssgm.fx.ifx.integration.core.inbound.SourceInTypeEnum;
import lombok.Data;

import java.util.Date;

@Data
public class InboundConfig extends BaseConfig {

    SourceInTypeEnum inboundType;

    String properties;

//    String driver;
//    String url;
//    String user;
//    String password;


}

