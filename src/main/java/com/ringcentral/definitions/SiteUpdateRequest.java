package com.ringcentral.definitions;


public class SiteUpdateRequest {
    /**
     * Extension user first name
     * Required
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
     *
     */
    public OperatorInfo operator;

    public SiteUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    public SiteUpdateRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public SiteUpdateRequest callerIdName(String callerIdName) {
        this.callerIdName = callerIdName;
        return this;
    }

    public SiteUpdateRequest email(String email) {
        this.email = email;
        return this;
    }

    public SiteUpdateRequest businessAddress(ContactBusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public SiteUpdateRequest regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public SiteUpdateRequest operator(OperatorInfo operator) {
        this.operator = operator;
        return this;
    }
}
