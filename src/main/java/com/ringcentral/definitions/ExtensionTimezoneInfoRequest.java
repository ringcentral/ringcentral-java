package com.ringcentral.definitions;


public class ExtensionTimezoneInfoRequest {
    /**
     * Internal identifier of a timezone
     */
    public String id;

    public ExtensionTimezoneInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
