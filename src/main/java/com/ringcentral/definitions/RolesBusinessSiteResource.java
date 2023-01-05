package com.ringcentral.definitions;


public class RolesBusinessSiteResource
{
    /**
     * Required
     */
    public String id;
    public RolesBusinessSiteResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String email;
    public RolesBusinessSiteResource email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     */
    public String code;
    public RolesBusinessSiteResource code(String code)
    {
        this.code = code;
        return this;
    }

    /**
     */
    public String name;
    public RolesBusinessSiteResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String extensionNumber;
    public RolesBusinessSiteResource extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     */
    public String callerIdName;
    public RolesBusinessSiteResource callerIdName(String callerIdName)
    {
        this.callerIdName = callerIdName;
        return this;
    }

    /**
     */
    public BasicExtensionInfoResource operator;
    public RolesBusinessSiteResource operator(BasicExtensionInfoResource operator)
    {
        this.operator = operator;
        return this;
    }

    /**
     */
    public RolesRegionalSettingsResource regionalSettings;
    public RolesBusinessSiteResource regionalSettings(RolesRegionalSettingsResource regionalSettings)
    {
        this.regionalSettings = regionalSettings;
        return this;
    }

    /**
     */
    public ContactAddressInfoResource businessAddress;
    public RolesBusinessSiteResource businessAddress(ContactAddressInfoResource businessAddress)
    {
        this.businessAddress = businessAddress;
        return this;
    }
}