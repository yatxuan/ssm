package com.xuan.person.entity;

/**
 * 信息返回类
 */
public class JsonResult {
    private boolean bool;//请求是否成功
    private int code; //状态码
    private String describe;//错误描述
    private Object object;//返回数据

    public JsonResult() {
    }

    public JsonResult(ResultCode resultCode) {
        this.bool = resultCode.isBool();
        this.code = resultCode.getCode();
        this.describe = resultCode.getDescribe();
    }

    public JsonResult(ResultCode resultCode, Object object) {
        this(resultCode);
        this.object = object;
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

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Result{" + "bool=" + bool + ", code=" + code + ", describe='" + describe + '\'' + ", object=" + object + '}';
    }
}
