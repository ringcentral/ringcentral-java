package com.ringcentral.definitions;


public class TaxLocation
{
    /**
     * Internal identifier of a tax location
     * Required
     * Format: int64
     * Example: 981086004
     */
    public Long id;
    public TaxLocation id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Tax location name
     * Required
     * Example: Tax_Location
     */
    public String name;
    public TaxLocation name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Type of the location object. Only &#039;TaxLocation&#039; is currently supported for POST method
     * Required
     * Example: TaxLocation
     * Enum: BillingAddress, TaxLocation, Site
     */
    public String type;
    public TaxLocation type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier of a tax location in the partner&#039;s system
     * Example: 4587834894962936
     */
    public String externalLocationId;
    public TaxLocation externalLocationId(String externalLocationId)
    {
        this.externalLocationId = externalLocationId;
        return this;
    }

    /**
     * Effective date in the ISO 8601 (`YYYY-MM-DDThh:mm:ssTZD`) format, including date, time, and timezone
     * Format: date-time
     * Example: Sun Jun 05 2022 03:11:12 GMT-0700 (Pacific Daylight Time)
     */
    public String effectiveDate;
    public TaxLocation effectiveDate(String effectiveDate)
    {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Required
     */
    public PostalAddress address;
    public TaxLocation address(PostalAddress address)
    {
        this.address = address;
        return this;
    }
}