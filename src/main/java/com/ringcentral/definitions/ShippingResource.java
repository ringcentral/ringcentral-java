package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ShippingResource
{
    //
    public EmergencyServiceAddressResource address;
    public ShippingResource address(EmergencyServiceAddressResource address) {
        this.address = address;
        return this;
    }
    //
    public MethodResource method;
    public ShippingResource method(MethodResource method) {
        this.method = method;
        return this;
    }
    //
    public String status;
    public ShippingResource status(String status) {
        this.status = status;
        return this;
    }
    //
    public String carrier;
    public ShippingResource carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    //
    public String trackingNumber;
    public ShippingResource trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }
}
