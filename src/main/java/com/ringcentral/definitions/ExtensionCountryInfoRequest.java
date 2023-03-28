package com.ringcentral.definitions;


public class ExtensionCountryInfoRequest {
    /**
     * Internal identifier of a country
     */
    public String id;

    public ExtensionCountryInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
