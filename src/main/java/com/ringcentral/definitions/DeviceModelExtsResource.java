package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceModelExtsResource
{
    // Canonical URI of a device
    public String uri;
    public DeviceModelExtsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Devices data
    public DeviceModelExtResource[] records;
    public DeviceModelExtsResource records(DeviceModelExtResource[] records) {
        this.records = records;
        return this;
    }
}
