package com.ringcentral.definitions;


public class CostCenterItem {
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
    /**
     * Required
     */
    public TaxLocation taxLocation;
    /**
     * Internal identifier of a parent cost center
     * Format: int64
     * Example: 45878
     */
    public Long parentId;

    public CostCenterItem id(Long id) {
        this.id = id;
        return this;
    }

    public CostCenterItem name(String name) {
        this.name = name;
        return this;
    }

    public CostCenterItem billingCode(String billingCode) {
        this.billingCode = billingCode;
        return this;
    }

    public CostCenterItem taxLocation(TaxLocation taxLocation) {
        this.taxLocation = taxLocation;
        return this;
    }

    public CostCenterItem parentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
}
