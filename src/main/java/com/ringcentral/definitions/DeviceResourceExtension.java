package com.ringcentral.definitions;


public class DeviceResourceExtension {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String extensionNumber;

    public DeviceResourceExtension id(String id) {
        this.id = id;
        return this;
    }

    public DeviceResourceExtension name(String name) {
        this.name = name;
        return this;
    }

    public DeviceResourceExtension extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
