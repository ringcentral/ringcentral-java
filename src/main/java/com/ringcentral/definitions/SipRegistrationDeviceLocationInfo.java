package com.ringcentral.definitions;


    /**
* Company emergency response location details
*/
public class SipRegistrationDeviceLocationInfo
{
    /**
     * Internal identifier of an emergency response location
     */
    public String id;
    public SipRegistrationDeviceLocationInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Emergency response location name
     */
    public String name;
    public SipRegistrationDeviceLocationInfo name(String name)
    {
        this.name = name;
        return this;
    }
}