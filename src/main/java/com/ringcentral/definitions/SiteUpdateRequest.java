package com.ringcentral.definitions;


public class SiteUpdateRequest
{
    /**
     * Extension user first name
     */
    public String name;
    public SiteUpdateRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Extension number
     */
    public String extensionNumber;
    public SiteUpdateRequest extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Custom name of a caller. Max number of characters is 15 (only
    * alphabetical symbols, numbers and commas are supported)
     */
    public String callerIdName;
    public SiteUpdateRequest callerIdName(String callerIdName)
    {
        this.callerIdName = callerIdName;
        return this;
    }

    /**
     * Site extension contact email
     * Format: email
     */
    public String email;
    public SiteUpdateRequest email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     */
    public ContactBusinessAddressInfo businessAddress;
    public SiteUpdateRequest businessAddress(ContactBusinessAddressInfo businessAddress)
    {
        this.businessAddress = businessAddress;
        return this;
    }

    /**
     */
    public RegionalSettings regionalSettings;
    public SiteUpdateRequest regionalSettings(RegionalSettings regionalSettings)
    {
        this.regionalSettings = regionalSettings;
        return this;
    }

    /**
     */
    public OperatorInfo operator;
    public SiteUpdateRequest operator(OperatorInfo operator)
    {
        this.operator = operator;
        return this;
    }

    /**
     * Site access status for cross-site limitation
     * Enum: Limited, Unlimited
     */
    public String siteAccess;
    public SiteUpdateRequest siteAccess(String siteAccess)
    {
        this.siteAccess = siteAccess;
        return this;
    }

    /**
     */
    public String[] accessibleSiteIds;
    public SiteUpdateRequest accessibleSiteIds(String[] accessibleSiteIds)
    {
        this.accessibleSiteIds = accessibleSiteIds;
        return this;
    }
}