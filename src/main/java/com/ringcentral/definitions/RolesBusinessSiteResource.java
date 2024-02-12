package com.ringcentral.definitions;


public class RolesBusinessSiteResource {
    /**
     * Link to a business site resource
     */
    public String uri;
    /**
     * Required
     */
    public String id;
    /**
     * Format: email
     */
    public String email;
    /**
     *
     */
    public String code;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String extensionNumber;
    /**
     *
     */
    public String callerIdName;
    /**
     *
     */
    public BasicExtensionInfoResource operator;
    /**
     *
     */
    public RolesRegionalSettingsResource regionalSettings;
    /**
     *
     */
    public ContactAddressInfoResource businessAddress;

    public RolesBusinessSiteResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RolesBusinessSiteResource id(String id) {
        this.id = id;
        return this;
    }

    public RolesBusinessSiteResource email(String email) {
        this.email = email;
        return this;
    }

    public RolesBusinessSiteResource code(String code) {
        this.code = code;
        return this;
    }

    public RolesBusinessSiteResource name(String name) {
        this.name = name;
        return this;
    }

    public RolesBusinessSiteResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public RolesBusinessSiteResource callerIdName(String callerIdName) {
        this.callerIdName = callerIdName;
        return this;
    }

    public RolesBusinessSiteResource operator(BasicExtensionInfoResource operator) {
        this.operator = operator;
        return this;
    }

    public RolesBusinessSiteResource regionalSettings(RolesRegionalSettingsResource regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    public RolesBusinessSiteResource businessAddress(ContactAddressInfoResource businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
}
