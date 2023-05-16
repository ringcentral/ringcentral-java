package com.ringcentral.definitions;


/**
 * Particular license or device sku to be ordered (base)
 */
public class OrderLine {
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
    /**
     * The cost center ID if necessary
     * Example: 224149
     */
    public String costCenterId;

    public OrderLine quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderLine skuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    public OrderLine costCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
}
