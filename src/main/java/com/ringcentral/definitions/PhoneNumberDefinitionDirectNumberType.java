package com.ringcentral.definitions;


    /**
* Assign a specific phone number
*/
public class PhoneNumberDefinitionDirectNumberType
{
    /**
     * Phone number in e164 format
     * Required
     */
    public String phoneNumber;
    public PhoneNumberDefinitionDirectNumberType phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Type of a phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    public PhoneNumberDefinitionDirectNumberType type(String type)
    {
        this.type = type;
        return this;
    }
}