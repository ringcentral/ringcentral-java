package com.ringcentral.definitions;


public class LocationOwnerInfo {
    /**
     * Internal identifier of a user - private location owner
     */
    public String id;
    /**
     * Extension number of a location number
     */
    public String extensionNumber;
    /**
     * Name of a location owner
     */
    public String name;

    public LocationOwnerInfo id(String id) {
        this.id = id;
        return this;
    }

    public LocationOwnerInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public LocationOwnerInfo name(String name) {
        this.name = name;
        return this;
    }
}
