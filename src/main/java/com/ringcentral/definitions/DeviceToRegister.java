package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceToRegister
{
    //
    public String id;
    public DeviceToRegister id(String id) {
        this.id = id;
        return this;
    }
    //
    public String computerName;
    public DeviceToRegister computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }
    //
    public String appExternalId;
    public DeviceToRegister appExternalId(String appExternalId) {
        this.appExternalId = appExternalId;
        return this;
    }
}
