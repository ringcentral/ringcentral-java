package com.ringcentral.definitions;


public class PhoneNumberResource
{
    /**
     * Example: +1 (205) 6812029
     */
    public String formattedPhoneNumber;
    public PhoneNumberResource formattedPhoneNumber(String formattedPhoneNumber)
    {
        this.formattedPhoneNumber = formattedPhoneNumber;
        return this;
    }

    /**
     * Example: 12056812029
     */
    public String phoneNumber;
    public PhoneNumberResource phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Example: VoiceFax
     */
    public String type;
    public PhoneNumberResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Custom user name of a phone number, if any
     * Example: Boss
     */
    public String label;
    public PhoneNumberResource label(String label)
    {
        this.label = label;
        return this;
    }

    /**
     * Usage type of a phone number
     * Example: DirectNumber
     * Enum: MobileNumber, ContactNumber, DirectNumber, ForwardedNumber
     */
    public String usageType;
    public PhoneNumberResource usageType(String usageType)
    {
        this.usageType = usageType;
        return this;
    }

    /**
     * Specifies if a phone number should be hidden or not
     */
    public Boolean hidden;
    public PhoneNumberResource hidden(Boolean hidden)
    {
        this.hidden = hidden;
        return this;
    }

    /**
     * Specifies if the number is primary, i.e. displayed as &#039;main number&#039; and called by default
     */
    public Boolean primary;
    public PhoneNumberResource primary(Boolean primary)
    {
        this.primary = primary;
        return this;
    }
}