package com.ringcentral.definitions;


public class SiteInfo {
    /**
     * Internal idetifier of a site extension
     */
    public String id;
    /**
     * Link to a site resource
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
     * Custom name of a caller. Max number of characters is 15 (only alphabetical symbols, numbers and commas are supported)
     */
    public String callerIdName;
    /**
     * Exetnsion user email
     */
    public String email;
    /**
     * Extension user business address. The default is Company settings
     */
    public ContactBusinessAddressInfo businessAddress;
    /**
     * Information about regional settings. The default is Company settings
     */
    public RegionalSettings regionalSettings;
    /**
     * Site Fax/SMS recipient (operator) reference. Multi-level IVR should be enabled
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

    public SiteInfo operator(OperatorInfo operator) {
        this.operator = operator;
        return this;
    }

    public SiteInfo code(String code) {
        this.code = code;
        return this;
    }

}
