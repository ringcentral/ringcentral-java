package com.ringcentral.definitions;


public class DeviceModelInfo {
    /**
     * Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier
     */
    public String id;
    /**
     * Device name
     */
    public String name;
    /**
     * Addons description
     * Required
     */
    public DeviceAddonInfo[] addons;
    /**
     * Device feature or multiple features supported
     */
    public String[] features;

    public DeviceModelInfo id(String id) {
        this.id = id;
        return this;
    }

    public DeviceModelInfo name(String name) {
        this.name = name;
        return this;
    }

    public DeviceModelInfo addons(DeviceAddonInfo[] addons) {
        this.addons = addons;
        return this;
    }

    public DeviceModelInfo features(String[] features) {
        this.features = features;
        return this;
    }

}
