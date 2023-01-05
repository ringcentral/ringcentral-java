package com.ringcentral.definitions;


public class DevicesSearchOrderBy
{
    /**
     * The sorting field name
     * Enum: name, phoneNumber, serial, extensionName, site, orderStatus, extensionNumber
     */
    public String fieldName;
    public DevicesSearchOrderBy fieldName(String fieldName)
    {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Default: ASC
     * Enum: ASC, DESC
     */
    public String direction;
    public DevicesSearchOrderBy direction(String direction)
    {
        this.direction = direction;
        return this;
    }
}