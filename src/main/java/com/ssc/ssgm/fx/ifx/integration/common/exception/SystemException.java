/**
 * Project Name cdt4-project-spring-boot Package Name com.ssc.rest.framework
 * Date Apr 29, 20225:03:07 PM
 * <p>
 * Copyright(c) 2022, StateStreet.com All Rights Reserved
 */

package com.ssc.ssgm.fx.ifx.integration.common.exception;

import lombok.Data;

/**
 * @author e691008
 * @description TODO add description <br/>
 */
@Data
public class SystemException extends RuntimeException {

    private String bizErrorMsg;

    /**
     * serialVersionUID TODO
     */
    private static final long serialVersionUID = 1L;

    public SystemException(String errorMsg) {
        super(errorMsg);
        this.setBizErrorMsg(errorMsg);
    }

    public SystemException(Throwable e) {
        super(e);
    }

    public String getBizErrorMsg() {
        return bizErrorMsg;
    }

    public void setBizErrorMsg(String bizErrorMsg) {
        this.bizErrorMsg = bizErrorMsg;
    }

}
