package com.ringcentral.definitions;


/**
 * Company emergency response location details
 */
public class CommonEmergencyLocationResource {
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
     * Enum: Valid, Invalid, Provisioning
     */
    public String addressStatus;
    /**
     * Status of emergency response location usage.
     * Enum: Active, Inactive
     */
    public String usageStatus;
    /**
     * Resulting status of emergency address synchronization. Returned
     * if `syncEmergencyAddress` parameter is set to `true`
     * Enum: Verified, Updated, Deleted, ActivationProcess, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    /**
     * Enum: LocationWithElins, LocationWithEndpoint
     */
    public String addressType;
    /**
     * Visibility of an emergency response location. If `Private`
     * is set, then location is visible only for the restricted number of users,
     * specified in `owners` array
     * Default: Public
     * Enum: Private, Public
     */
    public String visibility;
    /**
     * List of private location owners
     */
    public LocationOwnerInfo[] owners;
    /**
     * Address format ID
     */
    public String addressFormatId;

    public CommonEmergencyLocationResource id(String id) {
        this.id = id;
        return this;
    }

    public CommonEmergencyLocationResource address(CommonEmergencyLocationAddressInfo address) {
        this.address = address;
        return this;
    }

    public CommonEmergencyLocationResource name(String name) {
        this.name = name;
        return this;
    }

    public CommonEmergencyLocationResource site(ShortSiteInfo site) {
        this.site = site;
        return this;
    }

    public CommonEmergencyLocationResource addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    public CommonEmergencyLocationResource usageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
        return this;
    }

    public CommonEmergencyLocationResource syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public CommonEmergencyLocationResource addressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    public CommonEmergencyLocationResource visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public CommonEmergencyLocationResource owners(LocationOwnerInfo[] owners) {
        this.owners = owners;
        return this;
    }

    public CommonEmergencyLocationResource addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }
}
