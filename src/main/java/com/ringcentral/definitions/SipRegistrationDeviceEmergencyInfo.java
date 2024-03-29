package com.ringcentral.definitions;


/**
 * Emergency response location settings of a device
 */
public class SipRegistrationDeviceEmergencyInfo {
    /**
     * Address for emergency cases. The same emergency address is assigned to all the numbers of one device
     */
    public SipRegistrationDeviceEmergencyInfoAddress address;
    /**
     *
     */
    public SipRegistrationDeviceLocationInfo location;
    /**
     * Specifies if emergency address is out of country
     */
    public Boolean outOfCountry;
    /**
     * Emergency address status
     * Enum: Valid, Invalid, Processing
     */
    public String addressStatus;
    /**
     * Specifies whether to return only private or only public (company) ERLs (Emergency Response Locations)
     * Enum: Private, Public
     */
    public String visibility;
    /**
     * Resulting status of emergency address synchronization. Returned
     * if `syncEmergencyAddress` parameter is set to `true`
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    /**
     * Ability to register new emergency address for a phone line
     * using devices sharing this line or only main device (line owner)
     * Enum: MainDevice, AnyDevice
     */
    public String addressEditableStatus;
    /**
     * Indicates if emergency address is required for the country of a phone line
     */
    public Boolean addressRequired;
    /**
     * Indicates if out of country emergency address is not allowed for the country of a phone line
     */
    public Boolean addressLocationOnly;

    public SipRegistrationDeviceEmergencyInfo address(SipRegistrationDeviceEmergencyInfoAddress address) {
        this.address = address;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfo location(SipRegistrationDeviceLocationInfo location) {
        this.location = location;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfo outOfCountry(Boolean outOfCountry) {
        this.outOfCountry = outOfCountry;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfo addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfo visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfo syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfo addressEditableStatus(String addressEditableStatus) {
        this.addressEditableStatus = addressEditableStatus;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfo addressRequired(Boolean addressRequired) {
        this.addressRequired = addressRequired;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfo addressLocationOnly(Boolean addressLocationOnly) {
        this.addressLocationOnly = addressLocationOnly;
        return this;
    }
}
