package com.ringcentral.definitions;


public class ScimPhoneNumber
{
    /**
     * Required
     * Enum: work, mobile, other
     */
    public String type;
    public ScimPhoneNumber type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public String value;
    public ScimPhoneNumber value(String value)
    {
        this.value = value;
        return this;
    }
}