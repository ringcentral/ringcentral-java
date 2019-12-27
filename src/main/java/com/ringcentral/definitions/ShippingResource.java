package com.ringcentral.definitions;


public class ShippingResource {
    /**
     *
     */
    public ShippingAddressInfo address;
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

    public ShippingResource address(ShippingAddressInfo address) {
        this.address = address;
        return this;
    }

    public ShippingResource method(MethodResource method) {
        this.method = method;
        return this;
    }

    public ShippingResource status(String status) {
        this.status = status;
        return this;
    }

    public ShippingResource carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public ShippingResource trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

}
