package com.ringcentral.definitions;


// Company emergency response location details
public class EmergencyLocationInfo {
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
     * Enum: Valid, Invalid, Provisioning
     */
    public String addressStatus;
    /**
     * Status of emergency response location usage.
     * Enum: Active, Inactive
     */
    public String usageStatus;
    /**
     * Resulting status of emergency address synchronization. Returned if `syncEmergencyAddress` parameter is set to &#039;True&#039;
     * Enum: Verified, Updated, Deleted, ActivationProcess, Unsupported, Failed
     */
    public String syncStatus;
    /**
     * Visibility of an emergency response location. If `Private` is set, then location is visible only for the restricted number of users, specified in `owners` array
     * Default: Public
     * Enum: Private, Public
     */
    public String visibility;
    /**
     * List of private location owners
     */
    public LocationOwnerInfo[] owners;

    public EmergencyLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyLocationInfo address(EmergencyLocationAddressInfo address) {
        this.address = address;
        return this;
    }

    public EmergencyLocationInfo name(String name) {
        this.name = name;
        return this;
    }

    public EmergencyLocationInfo site(ShortSiteInfo site) {
        this.site = site;
        return this;
    }

    public EmergencyLocationInfo addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    public EmergencyLocationInfo usageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
        return this;
    }

    public EmergencyLocationInfo syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public EmergencyLocationInfo visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public EmergencyLocationInfo owners(LocationOwnerInfo[] owners) {
        this.owners = owners;
        return this;
    }
}
