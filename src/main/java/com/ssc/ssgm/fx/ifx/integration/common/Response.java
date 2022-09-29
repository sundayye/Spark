
package com.ssc.ssgm.fx.ifx.integration.common;

public class Response<T> {

    private Integer code;

    private T data;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Response(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Response<Boolean> success() {
        return new Response<>(RespCode.SUCCESS.getCode(), null, null);
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(RespCode.SUCCESS.getCode(), RespCode.SUCCESS.getDesc(), data);
    }

    public static Response<Boolean> fail(String msg) {
        return new Response<>(RespCode.FAIL.getCode(), msg, null);
    }

    public static Response<Boolean> fail() {
        return new Response<>(RespCode.FAIL.getCode(), RespCode.FAIL.getDesc(), null);
    }

    public static Response<Boolean> unlogin() {
        return new Response<>(RespCode.UN_LOGIN.getCode(), RespCode.UN_LOGIN.getDesc(), null);
    }

}
