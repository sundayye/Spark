package com.ssc.ssgm.fx.ifx.integration.api;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.ssc.ssgm.fx.ifx.integration.core.config.FlowConfig;
import com.ssc.ssgm.fx.ifx.integration.core.config.InboundConfig;
import com.ssc.ssgm.fx.ifx.integration.core.config.OutboundConfig;


public class HackthonContext {

    public static Map<String, FlowConfig> flowMap = new ConcurrentHashMap();

    public static Map<String, InboundConfig> inboundMap = new ConcurrentHashMap();

    public static Map<String, OutboundConfig> outboundMap = new ConcurrentHashMap();

}
