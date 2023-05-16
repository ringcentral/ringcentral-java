package com.ringcentral.definitions;


/**
 * Devices shipping method. It is required if devices are ordered.
 * Availability of different shipping methods depends on package
 * definition.
 */
public class ShippingMethodIdModel {
    /**
     * Shipping method ID:
     * - &quot;1&quot; - Ground Shipping (5-7 business days)
     * - &quot;2&quot; - Expedited Shipping (2-days)
     * - &quot;3&quot; - Overnight Shipping
     * Required
     * Default: 1
     * Enum: 1, 2, 3
     */
    public String id;

    public ShippingMethodIdModel id(String id) {
        this.id = id;
        return this;
    }
}
