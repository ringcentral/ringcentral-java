package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceModelExtResource
{
    // Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example 'HP-56-2-2'
    public String sku;
    public DeviceModelExtResource sku(String sku) {
        this.sku = sku;
        return this;
    }
    // Device type. The default value is 'HardPhone'
    public String type;
    public DeviceModelExtResource type(String type) {
        this.type = type;
        return this;
    }
    // HardPhone model information
    public DeviceModelResource model;
    public DeviceModelExtResource model(DeviceModelResource model) {
        this.model = model;
        return this;
    }
}
