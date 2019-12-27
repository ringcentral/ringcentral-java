package com.ringcentral.definitions;


public class Shipping {
    /**
     *
     */
    public DeviceEmergencyServiceAddressResource address;
    /**
     *
     */
    public MethodResource method;
    /**
     *
     */
    public String status;
    /**
     *
     */
    public String carrier;
    /**
     *
     */
    public String trackingNumber;

    public Shipping address(DeviceEmergencyServiceAddressResource address) {
        this.address = address;
        return this;
    }

    public Shipping method(MethodResource method) {
        this.method = method;
        return this;
    }

    public Shipping status(String status) {
        this.status = status;
        return this;
    }

    public Shipping carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public Shipping trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

}
