package com.ringcentral.definitions;


    /**
* Filtering criteria when a number is selected from the number pool
*/
public class PhoneNumberDefinitionTollType
{
    /**
     * Indicates if a number is toll or toll-free
     * Required
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;
    public PhoneNumberDefinitionTollType tollType(String tollType)
    {
        this.tollType = tollType;
        return this;
    }

    /**
     * Type of a phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    public PhoneNumberDefinitionTollType type(String type)
    {
        this.type = type;
        return this;
    }
}