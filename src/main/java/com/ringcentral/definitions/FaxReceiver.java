package com.ringcentral.definitions;


    /**
* Fax receiver
*/
public class FaxReceiver
{
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;
    public FaxReceiver phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Name of the receiver
     */
    public String name;
    public FaxReceiver name(String name)
    {
        this.name = name;
        return this;
    }
}