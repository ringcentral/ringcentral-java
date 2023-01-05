package com.ringcentral.definitions;


public class CreateUserEmergencyLocationRequest
{
    /**
     * Name of a new personal emergency response location
     */
    public String name;
    public CreateUserEmergencyLocationRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public EmergencyLocationAddressInfo address;
    public CreateUserEmergencyLocationRequest address(EmergencyLocationAddressInfo address)
    {
        this.address = address;
        return this;
    }
}