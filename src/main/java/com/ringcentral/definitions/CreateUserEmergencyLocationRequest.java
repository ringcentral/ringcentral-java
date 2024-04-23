package com.ringcentral.definitions;


public class CreateUserEmergencyLocationRequest {
    /**
     * Name of a new personal emergency response location
     */
    public String name;
    /**
     * Address format ID
     */
    public String addressFormatId;
    /**
     * If &#039;true&#039; address validation for non-us addresses is skipped
     */
    public Boolean trusted;
    /**
     *
     */
    public CommonEmergencyLocationAddressInfo address;

    public CreateUserEmergencyLocationRequest name(String name) {
        this.name = name;
        return this;
    }

    public CreateUserEmergencyLocationRequest addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    public CreateUserEmergencyLocationRequest trusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }

    public CreateUserEmergencyLocationRequest address(CommonEmergencyLocationAddressInfo address) {
        this.address = address;
        return this;
    }
}
