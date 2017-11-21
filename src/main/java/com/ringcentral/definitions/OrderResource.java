package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class OrderResource
{
    //
    public String id;
    public OrderResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String uri;
    public OrderResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public DeviceResource[] devices;
    public OrderResource devices(DeviceResource[] devices) {
        this.devices = devices;
        return this;
    }
}
