package com.ringcentral.definitions;

public class ShippingMethod {
    // Method identifier. The default value is "1" (Ground)
    public String id;
    // Method name, corresponding to the identifier
    public String name;

    public ShippingMethod id(String id) {
        this.id = id;
        return this;
    }

    public ShippingMethod name(String name) {
        this.name = name;
        return this;
    }
}
