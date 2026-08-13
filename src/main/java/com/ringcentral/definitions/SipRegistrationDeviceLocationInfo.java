package com.ringcentral.definitions;

/** Company emergency response location details */
public class SipRegistrationDeviceLocationInfo {
    /** Internal identifier of an emergency response location */
    public String id;

    public SipRegistrationDeviceLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Emergency response location name */
    public String name;

    public SipRegistrationDeviceLocationInfo name(String name) {
        this.name = name;
        return this;
    }

    /** Address format ID */
    public String addressFormatId;

    public SipRegistrationDeviceLocationInfo addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    /** Address format statuses Enum: Actual, Outdated, Deprecated */
    public String addressFormatStatus;

    public SipRegistrationDeviceLocationInfo addressFormatStatus(String addressFormatStatus) {
        this.addressFormatStatus = addressFormatStatus;
        return this;
    }

    /**
     * Specifies emergency address validation during the ERL creation/update. If set to
     * &#039;true&#039;, then address validation for non-US addresses is skipped
     */
    public Boolean trusted;

    public SipRegistrationDeviceLocationInfo trusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }
}
