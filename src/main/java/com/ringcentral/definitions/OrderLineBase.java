package com.ringcentral.definitions;


/**
 * Particular license or device sku to be ordered (base)
 */
public class OrderLineBase {
    /**
     * The number of items of this kind
     * Required
     * Minimum: 1
     * Format: int32
     * Example: 15
     */
    public Long quantity;
    /**
     * Required
     * Example: LC_HD_529
     */
    public String skuId;

    public OrderLineBase quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderLineBase skuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
}
