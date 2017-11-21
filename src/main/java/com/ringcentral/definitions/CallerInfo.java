package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallerInfo
{
    //
    public String phoneNumber;
    public CallerInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public String extensionNumber;
    public CallerInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public String name;
    public CallerInfo name(String name) {
        this.name = name;
        return this;
    }
    //
    public String location;
    public CallerInfo location(String location) {
        this.location = location;
        return this;
    }
    //
    public PersonalContactResource contact;
    public CallerInfo contact(PersonalContactResource contact) {
        this.contact = contact;
        return this;
    }
    //
    public String messageStatus;
    public CallerInfo messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }
    //
    public String faxErrorCode;
    public CallerInfo faxErrorCode(String faxErrorCode) {
        this.faxErrorCode = faxErrorCode;
        return this;
    }
}
