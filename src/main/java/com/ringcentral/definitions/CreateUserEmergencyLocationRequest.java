package com.ringcentral.definitions;


public class CreateUserEmergencyLocationRequest {
    /**
     * Name of a new personal emergency response location
     */
    public String name;
    /**
     *
     */
    public LocationUpdatesEmergencyAddressInfoRequest address;

    public CreateUserEmergencyLocationRequest name(String name) {
        this.name = name;
        return this;
    }

    public CreateUserEmergencyLocationRequest address(LocationUpdatesEmergencyAddressInfoRequest address) {
        this.address = address;
        return this;
    }
}
