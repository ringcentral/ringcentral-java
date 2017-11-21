package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceInstance
{
    //
    public String id;
    public DeviceInstance id(String id) {
        this.id = id;
        return this;
    }
    //
    public String serial;
    public DeviceInstance serial(String serial) {
        this.serial = serial;
        return this;
    }
    //
    public String trackingNumber;
    public DeviceInstance trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }
    //
    public String shippingCarrier;
    public DeviceInstance shippingCarrier(String shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
        return this;
    }
    //
    public String rmaNumber;
    public DeviceInstance rmaNumber(String rmaNumber) {
        this.rmaNumber = rmaNumber;
        return this;
    }
}
