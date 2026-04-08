package com.ringcentral.definitions;


public class CostCenterItem
{
    /**
     * Internal identifier of a cost center
     * Format: int64
     * Example: 981086004
     */
    public Long id;
    public CostCenterItem id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Cost Center name
     * Example: My Cost Center
     */
    public String name;
    public CostCenterItem name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Billing code associated with a cost center
     * Example: BC 101
     */
    public String billingCode;
    public CostCenterItem billingCode(String billingCode)
    {
        this.billingCode = billingCode;
        return this;
    }

    /**
     * Required
     */
    public TaxLocation taxLocation;
    public CostCenterItem taxLocation(TaxLocation taxLocation)
    {
        this.taxLocation = taxLocation;
        return this;
    }

    /**
     * Internal identifier of a parent cost center
     * Format: int64
     * Example: 45878
     */
    public Long parentId;
    public CostCenterItem parentId(Long parentId)
    {
        this.parentId = parentId;
        return this;
    }
}