package com.ssc.ssgm.fx.ifx.integration.core.parser;

import java.util.List;

public interface Parser<T> {

    List<T> parse(byte[] input);

}
