package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ErrorEntity
{
    //
    public String errorCode;
    public ErrorEntity errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    //
    public String message;
    public ErrorEntity message(String message) {
        this.message = message;
        return this;
    }
}
