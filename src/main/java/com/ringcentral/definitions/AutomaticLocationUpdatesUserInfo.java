package com.ringcentral.definitions;


public class AutomaticLocationUpdatesUserInfo {
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * User name
     */
    public String fullName;
    /**
     *
     */
    public String extensionNumber;
    /**
     * Specifies if Automatic Location Updates feature is enabled
     */
    public Boolean featureEnabled;
    /**
     * User extension type
     * Enum: User, Limited
     */
    public String type;
    /**
     *
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     * Department name
     */
    public String department;

    public AutomaticLocationUpdatesUserInfo id(String id) {
        this.id = id;
        return this;
    }

    public AutomaticLocationUpdatesUserInfo fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public AutomaticLocationUpdatesUserInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public AutomaticLocationUpdatesUserInfo featureEnabled(Boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
        return this;
    }

    public AutomaticLocationUpdatesUserInfo type(String type) {
        this.type = type;
        return this;
    }

    public AutomaticLocationUpdatesUserInfo site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public AutomaticLocationUpdatesUserInfo department(String department) {
        this.department = department;
        return this;
    }
}
