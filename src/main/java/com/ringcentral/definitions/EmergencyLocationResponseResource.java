package com.ringcentral.definitions;


/**
 * Company emergency response location details
 */
public class EmergencyLocationResponseResource {
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
    public SiteBasicInfo site;
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
    /**
     * Specifies emergency address validation during the ERL creation/update.
     * If set to &#039;true&#039;, then address validation for non-US addresses is skipped
     */
    public Boolean trusted;

    public EmergencyLocationResponseResource id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyLocationResponseResource address(CommonEmergencyLocationAddressInfo address) {
        this.address = address;
        return this;
    }

    public EmergencyLocationResponseResource name(String name) {
        this.name = name;
        return this;
    }

    public EmergencyLocationResponseResource site(SiteBasicInfo site) {
        this.site = site;
        return this;
    }

    public EmergencyLocationResponseResource addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    public EmergencyLocationResponseResource usageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
        return this;
    }

    public EmergencyLocationResponseResource syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public EmergencyLocationResponseResource addressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    public EmergencyLocationResponseResource visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public EmergencyLocationResponseResource owners(LocationOwnerInfo[] owners) {
        this.owners = owners;
        return this;
    }

    public EmergencyLocationResponseResource addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    public EmergencyLocationResponseResource trusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }
}
