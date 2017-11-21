package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallerIdDeviceInfo
{
    // Internal identifier of a device
    public String id;
    public CallerIdDeviceInfo id(String id) {
        this.id = id;
        return this;
    }
    // Link to a device resource
    public String uri;
    public CallerIdDeviceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Name of a device
    public String phoneNumber;
    public CallerIdDeviceInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
