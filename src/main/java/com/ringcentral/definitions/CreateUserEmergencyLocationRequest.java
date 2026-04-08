package com.ringcentral.definitions;

public class CreateUserEmergencyLocationRequest {
    /** Name of a new personal emergency response location */
    public String name;

    public CreateUserEmergencyLocationRequest name(String name) {
        this.name = name;
        return this;
    }

    /** Address format ID */
    public String addressFormatId;

    public CreateUserEmergencyLocationRequest addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    /**
     * Specifies emergency address validation during the ERL creation/update. If set to
     * &#039;true&#039;, then address validation for non-US addresses is skipped
     */
    public Boolean trusted;

    public CreateUserEmergencyLocationRequest trusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }

    /** */
    public EmergencyAddressResourceRequest address;

    public CreateUserEmergencyLocationRequest address(EmergencyAddressResourceRequest address) {
        this.address = address;
        return this;
    }

    /** */
    public SiteBasicInfo site;

    public CreateUserEmergencyLocationRequest site(SiteBasicInfo site) {
        this.site = site;
        return this;
    }
}
