package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceInfoRequest
{
    // Device unique identifier, retrieved on previous session (if any)
    public String id;
    public DeviceInfoRequest id(String id) {
        this.id = id;
        return this;
    }
    // For iOS devices only Certificate name (used by iOS applications for APNS subscription)
    public String appExternalId;
    public DeviceInfoRequest appExternalId(String appExternalId) {
        this.appExternalId = appExternalId;
        return this;
    }
    // For SoftPhone only Computer name
    public String computerName;
    public DeviceInfoRequest computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }
}
