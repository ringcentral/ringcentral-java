package com.ringcentral.definitions;


public class LocationOwnerInfo {
    /**
     * Internal identifier of a user - private location owner
     */
    public String id;

    public LocationOwnerInfo id(String id) {
        this.id = id;
        return this;
    }
}
