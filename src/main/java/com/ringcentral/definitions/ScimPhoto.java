package com.ringcentral.definitions;


public class ScimPhoto
{
    /**
     * Required
     * Enum: photo
     */
    public String type;
    public ScimPhoto type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public String value;
    public ScimPhoto value(String value)
    {
        this.value = value;
        return this;
    }
}