package com.ringcentral.definitions;


public class EmergencyLocationInfoRequest {
    /**
     * Internal identifier of the emergency response location
     */
    public String id;
    /**
     *
     */
    public EmergencyLocationAddressInfo address;
    /**
     * Emergency response location name
     */
    public String name;
    /**
     *
     */
    public ShortSiteInfo site;
    /**
     * Emergency address status
     * Enum: Valid, Invalid
     */
    public String addressStatus;
    /**
     * Status of emergency response location usage.
     * Enum: Active, Inactive
     */
    public String usageStatus;
    /**
     * Visibility of an emergency response location. If `Private` is set, then location is visible only for restricted number of users, specified in `owners` array
     * Default: Public
     * Enum: Private, Public
     */
    public String visibility;
    /**
     * List of private location owners
     */
    public LocationOwnerInfo[] owners;

    public EmergencyLocationInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyLocationInfoRequest address(EmergencyLocationAddressInfo address) {
        this.address = address;
        return this;
    }

    public EmergencyLocationInfoRequest name(String name) {
        this.name = name;
        return this;
    }

    public EmergencyLocationInfoRequest site(ShortSiteInfo site) {
        this.site = site;
        return this;
    }

    public EmergencyLocationInfoRequest addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    public EmergencyLocationInfoRequest usageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
        return this;
    }

    public EmergencyLocationInfoRequest visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public EmergencyLocationInfoRequest owners(LocationOwnerInfo[] owners) {
        this.owners = owners;
        return this;
    }
}
