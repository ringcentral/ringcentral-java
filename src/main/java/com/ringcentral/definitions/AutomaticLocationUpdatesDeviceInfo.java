package com.ringcentral.definitions;


public class AutomaticLocationUpdatesDeviceInfo {
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * Device type
     * Default: HardPhone
     * Enum: HardPhone, SoftPhone, OtherPhone
     */
    public String type;
    /**
     * Serial number for HardPhone (is returned only when the phone is shipped and provisioned)
     */
    public String serial;
    /**
     * Specifies if Automatic Location Updates feature is enabled
     */
    public Boolean featureEnabled;
    /**
     * Device name
     */
    public String name;
    /**
     *
     */
    public AutomaticLocationUpdatesModelInfo model;
    /**
     *
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     * Phone lines information
     */
    public AutomaticLocationUpdatesPhoneLine[] phoneLines;

    public AutomaticLocationUpdatesDeviceInfo id(String id) {
        this.id = id;
        return this;
    }

    public AutomaticLocationUpdatesDeviceInfo type(String type) {
        this.type = type;
        return this;
    }

    public AutomaticLocationUpdatesDeviceInfo serial(String serial) {
        this.serial = serial;
        return this;
    }

    public AutomaticLocationUpdatesDeviceInfo featureEnabled(Boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
        return this;
    }

    public AutomaticLocationUpdatesDeviceInfo name(String name) {
        this.name = name;
        return this;
    }

    public AutomaticLocationUpdatesDeviceInfo model(AutomaticLocationUpdatesModelInfo model) {
        this.model = model;
        return this;
    }

    public AutomaticLocationUpdatesDeviceInfo site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public AutomaticLocationUpdatesDeviceInfo phoneLines(AutomaticLocationUpdatesPhoneLine[] phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }
}
