package com.ringcentral.definitions;


public class DeviceAddonInfo {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;
    /**
     * Format: int32
     */
    public String count;

    public DeviceAddonInfo id(String id) {
        this.id = id;
        return this;
    }

    public DeviceAddonInfo name(String name) {
        this.name = name;
        return this;
    }

    public DeviceAddonInfo count(String count) {
        this.count = count;
        return this;
    }
}
