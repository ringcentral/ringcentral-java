package com.ringcentral.definitions;


public class ShippingMethodInfo {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;

    public ShippingMethodInfo id(String id) {
        this.id = id;
        return this;
    }

    public ShippingMethodInfo name(String name) {
        this.name = name;
        return this;
    }
}
