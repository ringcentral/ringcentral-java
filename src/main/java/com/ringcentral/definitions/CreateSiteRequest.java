package com.ringcentral.definitions;


public class CreateSiteRequest {
    /**
     * Extension user first name
     */
    public String name;
    /**
     * Extension number
     */
    public String extensionNumber;
    /**
     * Custom name of a caller. Max number of characters is 15 (only
     * alphabetical symbols, numbers and commas are supported)
     */
    public String callerIdName;
    /**
     * Extension user email
     * Format: email
     */
    public String email;
    /**
     *
     */
    public ContactBusinessAddressInfo businessAddress;
    /**
     *
     */
    public RegionalSettings regionalSettings;
    /**
     *
     */
    public SiteOperatorReference operator;
    /**
     * Site access status for cross-site limitation
     * Enum: Limited, Unlimited
     */
    public String siteAccess;
    /**
     *
     */
    public String[] accessibleSiteIds;
    /**
     * Site code value
     */
    public String code;

    public CreateSiteRequest name(String name) {
        this.name = name;
        return this;
    }

    public CreateSiteRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CreateSiteRequest callerIdName(String callerIdName) {
        this.callerIdName = callerIdName;
        return this;
    }

    public CreateSiteRequest email(String email) {
        this.email = email;
        return this;
    }

    public CreateSiteRequest businessAddress(ContactBusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public CreateSiteRequest regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public CreateSiteRequest operator(SiteOperatorReference operator) {
        this.operator = operator;
        return this;
    }

    public CreateSiteRequest siteAccess(String siteAccess) {
        this.siteAccess = siteAccess;
        return this;
    }

    public CreateSiteRequest accessibleSiteIds(String[] accessibleSiteIds) {
        this.accessibleSiteIds = accessibleSiteIds;
        return this;
    }

    public CreateSiteRequest code(String code) {
        this.code = code;
        return this;
    }
}
