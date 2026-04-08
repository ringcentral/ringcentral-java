package com.ringcentral.definitions;

public class EmergencyLocationRequestResource {
    /** */
    public EmergencyAddressResourceRequest address;

    public EmergencyLocationRequestResource address(EmergencyAddressResourceRequest address) {
        this.address = address;
        return this;
    }

    /** Emergency response location name */
    public String name;

    public EmergencyLocationRequestResource name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public SiteBasicInfo site;

    public EmergencyLocationRequestResource site(SiteBasicInfo site) {
        this.site = site;
        return this;
    }

    /** Address format ID */
    public String addressFormatId;

    public EmergencyLocationRequestResource addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    /**
     * Visibility of an emergency response location. If `Private` is set, then a location is visible
     * only for restricted number of users, specified in `owners` array Default: Public Enum: Public
     */
    public String visibility;

    public EmergencyLocationRequestResource visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Specifies emergency address validation during the ERL creation/update. If set to
     * &#039;true&#039;, then address validation for non-US addresses is skipped
     */
    public Boolean trusted;

    public EmergencyLocationRequestResource trusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }
}
