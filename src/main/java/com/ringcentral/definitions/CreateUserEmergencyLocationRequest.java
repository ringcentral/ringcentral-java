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

    public CreateUserEmergencyLocationRequest address(CommonEmergencyLocationAddressInfo address) {
        this.address = address;
        return this;
    }
}
