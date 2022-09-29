package com.ssc.ssgm.fx.ifx.integration.core.channel;

import lombok.Data;

import java.util.Map;

@Data
public class Message<T> {

    Map<String,Object> Header;

    T playLoad;

}
