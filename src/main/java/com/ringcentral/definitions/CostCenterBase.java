package com.ringcentral.definitions;


public class CostCenterBase {
    /**
     * Internal identifier of a cost center
     * Format: int64
     * Example: 981086004
     */
    public Long id;
    /**
     * Cost Center name
     * Example: My Cost Center
     */
    public String name;
    /**
     * Billing code associated with a cost center
     * Example: BC 101
     */
    public String billingCode;

    public CostCenterBase id(Long id) {
        this.id = id;
        return this;
    }

    public CostCenterBase name(String name) {
        this.name = name;
        return this;
    }

    public CostCenterBase billingCode(String billingCode) {
        this.billingCode = billingCode;
        return this;
    }
}
