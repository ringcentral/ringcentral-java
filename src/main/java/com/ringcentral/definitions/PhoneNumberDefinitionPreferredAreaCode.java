package com.ringcentral.definitions;


    /**
* Used as selection hint when a "toll" number is selected from the number pool
*/
public class PhoneNumberDefinitionPreferredAreaCode
{
    /**
     * Preferred area code to use if the numbers are available
     * Required
     * Example: 650
     */
    public String preferredAreaCode;
    public PhoneNumberDefinitionPreferredAreaCode preferredAreaCode(String preferredAreaCode)
    {
        this.preferredAreaCode = preferredAreaCode;
        return this;
    }

    /**
     * Indicates if a number is toll or toll-free
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;
    public PhoneNumberDefinitionPreferredAreaCode tollType(String tollType)
    {
        this.tollType = tollType;
        return this;
    }

    /**
     * Type of a phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    public PhoneNumberDefinitionPreferredAreaCode type(String type)
    {
        this.type = type;
        return this;
    }
}