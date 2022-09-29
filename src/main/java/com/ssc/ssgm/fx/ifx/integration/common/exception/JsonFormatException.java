package com.ssc.ssgm.fx.ifx.integration.common.exception;



public class JsonFormatException extends RuntimeException {

    private static final long serialVersionUID = -4981719527710542984L;

    public JsonFormatException() {
        super();
    }

    public JsonFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public JsonFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonFormatException(String message) {
        super(message);
    }

    public JsonFormatException(Throwable cause) {
        super(cause);
    }

}
