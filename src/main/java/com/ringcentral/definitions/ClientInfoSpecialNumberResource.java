package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientInfoSpecialNumberResource
{
    //
    public String uri;
    public ClientInfoSpecialNumberResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String phoneNumber;
    public ClientInfoSpecialNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public String description;
    public ClientInfoSpecialNumberResource description(String description) {
        this.description = description;
        return this;
    }
    //
    public Features features;
    public ClientInfoSpecialNumberResource features(Features features) {
        this.features = features;
        return this;
    }
}
