package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeviceOrderResource
{
    //
    public String accountId;
    public DeviceOrderResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    //
    public String requestNumber;
    public DeviceOrderResource requestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
        return this;
    }
    //
    public String distributorName;
    public DeviceOrderResource distributorName(String distributorName) {
        this.distributorName = distributorName;
        return this;
    }
    //
    public String trackingNumber;
    public DeviceOrderResource trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }
    //
    public String shippingCarrier;
    public DeviceOrderResource shippingCarrier(String shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
        return this;
    }
    //
    public DeviceInstance[] devices;
    public DeviceOrderResource devices(DeviceInstance[] devices) {
        this.devices = devices;
        return this;
    }
}
