package com.ringcentral.definitions;

/** Company emergency response location details */
public class CommonEmergencyLocationResource {
    /** Link to an emergency location resource */
    public String uri;

    public CommonEmergencyLocationResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Internal identifier of an emergency response location */
    public String id;

    public CommonEmergencyLocationResource id(String id) {
        this.id = id;
        return this;
    }

    /** */
    public EmergencyLocationAddressResource address;

    public CommonEmergencyLocationResource address(EmergencyLocationAddressResource address) {
        this.address = address;
        return this;
    }

    /** Emergency response location name */
    public String name;

    public CommonEmergencyLocationResource name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public SiteBasicInfo site;

    public CommonEmergencyLocationResource site(SiteBasicInfo site) {
        this.site = site;
        return this;
    }

    /** Emergency address status Enum: Valid, Invalid, Provisioning, Deprovisioned */
    public String addressStatus;

    public CommonEmergencyLocationResource addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    /** Status of emergency response location usage. Enum: Active, Inactive */
    public String usageStatus;

    public CommonEmergencyLocationResource usageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
        return this;
    }

    /**
     * Resulting status of emergency address synchronization. Returned if `syncEmergencyAddress`
     * parameter is set to `true` Enum: Verified, Updated, Deleted, ActivationProcess, NotRequired,
     * Unsupported, Failed
     */
    public String syncStatus;

    public CommonEmergencyLocationResource syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /** Enum: LocationWithElins, LocationWithEndpoint */
    public String addressType;

    public CommonEmergencyLocationResource addressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * Visibility of an emergency response location. If `Private` is set, then location is visible
     * only for the restricted number of users, specified in `owners` array Default: Public Enum:
     * Private, Public
     */
    public String visibility;

    public CommonEmergencyLocationResource visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /** List of private location owners */
    public LocationOwnerInfo[] owners;

    public CommonEmergencyLocationResource owners(LocationOwnerInfo[] owners) {
        this.owners = owners;
        return this;
    }

    /** Address format ID */
    public String addressFormatId;

    public CommonEmergencyLocationResource addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    /** Address format statuses Enum: Actual, Outdated, Deprecated */
    public String addressFormatStatus;

    public CommonEmergencyLocationResource addressFormatStatus(String addressFormatStatus) {
        this.addressFormatStatus = addressFormatStatus;
        return this;
    }
}
