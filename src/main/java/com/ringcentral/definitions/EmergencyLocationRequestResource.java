package com.ringcentral.definitions;


public class EmergencyLocationRequestResource {
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
    /**
     * If &#039;true&#039; address validation for non-us addresses is skipped
     */
    public Boolean trusted;

    public EmergencyLocationRequestResource id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyLocationRequestResource address(CommonEmergencyLocationAddressInfo address) {
        this.address = address;
        return this;
    }

    public EmergencyLocationRequestResource name(String name) {
        this.name = name;
        return this;
    }

    public EmergencyLocationRequestResource site(ShortSiteInfo site) {
        this.site = site;
        return this;
    }

    public EmergencyLocationRequestResource addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    public EmergencyLocationRequestResource usageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
        return this;
    }

    public EmergencyLocationRequestResource addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    public EmergencyLocationRequestResource visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public EmergencyLocationRequestResource trusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }
}
