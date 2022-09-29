/**
 *
 * Project Name cdt4-project-spring-boot Package Name com.ssc.rest.framework
 * Date May 3, 202212:34:43 PM
 *
 * Copyright(c) 2022, StateStreet.com All Rights Reserved
 *
 */

package com.ssc.ssgm.fx.ifx.integration.common;

/**
 *
 * @description TODO add description <br/>
 * @author e691008
 * @version
 *
 */
public enum RespCode {

    SUCCESS(1, "Request success"), FAIL(-9999, "System error"), UN_LOGIN(-1, "Not logged in");

    private Integer code;
    private String desc;

    RespCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
