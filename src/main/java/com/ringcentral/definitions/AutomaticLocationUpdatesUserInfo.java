package com.ringcentral.definitions;


public class AutomaticLocationUpdatesUserInfo
{
    /**
     * Internal identifier of a device
     */
    public String id;
    public AutomaticLocationUpdatesUserInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * User name
     */
    public String fullName;
    public AutomaticLocationUpdatesUserInfo fullName(String fullName)
    {
        this.fullName = fullName;
        return this;
    }

    /**
     */
    public String extensionNumber;
    public AutomaticLocationUpdatesUserInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Specifies whether Automatic Location Updates feature is enabled
     */
    public Boolean featureEnabled;
    public AutomaticLocationUpdatesUserInfo featureEnabled(Boolean featureEnabled)
    {
        this.featureEnabled = featureEnabled;
        return this;
    }

    /**
     * User extension type
     * Enum: User, Limited
     */
    public String type;
    public AutomaticLocationUpdatesUserInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public AutomaticLocationUpdatesSiteInfo site;
    public AutomaticLocationUpdatesUserInfo site(AutomaticLocationUpdatesSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     * Department name
     */
    public String department;
    public AutomaticLocationUpdatesUserInfo department(String department)
    {
        this.department = department;
        return this;
    }
}