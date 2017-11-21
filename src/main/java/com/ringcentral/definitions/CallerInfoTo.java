package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallerInfoTo
{
    //
    public String phoneNumber;
    public CallerInfoTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public String name;
    public CallerInfoTo name(String name) {
        this.name = name;
        return this;
    }
    //
    public String location;
    public CallerInfoTo location(String location) {
        this.location = location;
        return this;
    }
    //
    public String messageStatus;
    public CallerInfoTo messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }
    //
    public String faxErrorCode;
    public CallerInfoTo faxErrorCode(String faxErrorCode) {
        this.faxErrorCode = faxErrorCode;
        return this;
    }
}
