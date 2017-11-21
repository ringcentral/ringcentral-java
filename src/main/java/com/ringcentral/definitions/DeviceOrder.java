package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceOrder
{
    // Identifier of a device
    public String id;
    public DeviceOrder id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of an order resource
    public String uri;
    public DeviceOrder uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of devices ordered
    public DeviceResource[] devices;
    public DeviceOrder devices(DeviceResource[] devices) {
        this.devices = devices;
        return this;
    }
}
