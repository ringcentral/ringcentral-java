package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceModelResource
{
    //
    public String id;
    public DeviceModelResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public DeviceModelResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public Addon[] addons;
    public DeviceModelResource addons(Addon[] addons) {
        this.addons = addons;
        return this;
    }
}
