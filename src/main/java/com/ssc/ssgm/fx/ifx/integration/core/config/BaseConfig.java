package com.ssc.ssgm.fx.ifx.integration.core.config;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseConfig {

    /**
     * to be optimized , use long ?
     */
    String id;
    String name;
    Date createdTime;

}
