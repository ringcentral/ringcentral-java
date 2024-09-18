package com.ringcentral.definitions;


public class SiteInfo {
    /**
     * Internal identifier of a site extension
     */
    public String id;
    /**
     * Link to a site resource
     * Format: uri
     */
    public String uri;
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
     * Site extension contact email
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
     * Site access status for cross-site limitation
     * Enum: Limited, Unlimited
     */
    public String siteAccess;
    /**
     *
     */
    public OperatorInfo operator;
    /**
     * Site code value. Returned only if specified
     */
    public String code;

    public SiteInfo id(String id) {
        this.id = id;
        return this;
    }

    public SiteInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SiteInfo name(String name) {
        this.name = name;
        return this;
    }

    public SiteInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public SiteInfo callerIdName(String callerIdName) {
        this.callerIdName = callerIdName;
        return this;
    }

    public SiteInfo email(String email) {
        this.email = email;
        return this;
    }

    public SiteInfo businessAddress(ContactBusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public SiteInfo regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public SiteInfo siteAccess(String siteAccess) {
        this.siteAccess = siteAccess;
        return this;
    }

    public SiteInfo operator(OperatorInfo operator) {
        this.operator = operator;
        return this;
    }

    public SiteInfo code(String code) {
        this.code = code;
        return this;
    }
}
