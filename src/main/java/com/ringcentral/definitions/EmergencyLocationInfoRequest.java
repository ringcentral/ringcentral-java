package com.ringcentral.definitions;


public class EmergencyLocationInfoRequest {
    /**
     * Internal identifier of an emergency response location
     */
    public String id;
    /**
     *
     */
    public CommonEmergencyLocationAddressInfo address;
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
     * Status of an emergency response location usage.
     * Enum: Active, Inactive
     */
    public String usageStatus;
    /**
     * Address format ID
     */
    public String addressFormatId;
    /**
     * Visibility of an emergency response location. If `Private`
     * is set, then a location is visible only for restricted number of users,
     * specified in `owners` array
     * Default: Public
     * Enum: Public
     */
    public String visibility;

    public EmergencyLocationInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyLocationInfoRequest address(CommonEmergencyLocationAddressInfo address) {
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

    public EmergencyLocationInfoRequest addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    public EmergencyLocationInfoRequest visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
}
