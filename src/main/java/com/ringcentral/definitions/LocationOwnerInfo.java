package com.ringcentral.definitions;

public class LocationOwnerInfo {
    /** Internal identifier of a user - private location owner */
    public String id;

    public LocationOwnerInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Extension number of a location number */
    public String extensionNumber;

    public LocationOwnerInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** Name of a location owner */
    public String name;

    public LocationOwnerInfo name(String name) {
        this.name = name;
        return this;
    }
}
