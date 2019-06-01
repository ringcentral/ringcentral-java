package com.ringcentral.definitions;


public class ExtensionTimezoneInfoRequest {
    /**
     * internal Identifier of a timezone
     */
    public String id;

    public ExtensionTimezoneInfoRequest id(String id) {
        this.id = id;
        return this;
    }

}
