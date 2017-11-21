package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ShippingInfo
{
    // Shipping status of the order item. It is set to 'Initial' when the order is submitted. Then it is changed to 'Accepted' when a distributor starts processing the order. Finally it is changed to Shipped which means that distributor has shipped the device.
    public String status;
    public ShippingInfo status(String status) {
        this.status = status;
        return this;
    }
    // Shipping carrier name. Appears only if the device status is  Shipped
    public String carrier;
    public ShippingInfo carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    // Carrier-specific tracking number. Appears only if the device status is  Shipped
    public String trackingNumber;
    public ShippingInfo trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }
    // Shipping method information
    public MethodInfo method;
    public ShippingInfo method(MethodInfo method) {
        this.method = method;
        return this;
    }
    // Shipping address for the order. If it coincides with the Emergency Service Address, then can be omitted. By default the same value as the emergencyServiceAddress. Multiple addresses can be specified; in case an order contains several devices, they can be delivered to different addresses
    public ShippingAddressInfo address;
    public ShippingInfo address(ShippingAddressInfo address) {
        this.address = address;
        return this;
    }
}
