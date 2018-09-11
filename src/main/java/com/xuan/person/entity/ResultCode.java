package com.xuan.person.entity;

public enum ResultCode {

    SCUUESS(true, 0, "请求成功"), ERROR(false, -1, "请求失败");

    private boolean bool;//请求是否成功
    private int code; //状态码
    private String describe;//错误描述

    ResultCode() {
    }

    ResultCode(boolean bool, int code, String describe) {
        this.bool = bool;
        this.code = code;
        this.describe = describe;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
