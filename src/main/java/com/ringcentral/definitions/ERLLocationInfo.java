package com.ringcentral.definitions;


/**
 * Emergency response location information
 */
public class ERLLocationInfo {
    /**
     * Internal identifier of an emergency response location
     */
    public String id;
    /**
     * Emergency response location name
     */
    public String name;
    /**
     * Address format ID
     */
    public String addressFormatId;

    public ERLLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    public ERLLocationInfo name(String name) {
        this.name = name;
        return this;
    }

    public ERLLocationInfo addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }
}
