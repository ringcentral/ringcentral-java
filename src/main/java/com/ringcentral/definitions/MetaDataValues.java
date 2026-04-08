package com.ringcentral.definitions;


public class MetaDataValues
{
    /**
     * Unique identifier
     */
    public String id;
    public MetaDataValues id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Value
     */
    public String value;
    public MetaDataValues value(String value)
    {
        this.value = value;
        return this;
    }
}