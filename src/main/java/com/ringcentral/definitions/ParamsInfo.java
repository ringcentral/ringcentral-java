package com.ringcentral.definitions;


public class ParamsInfo
{
    /**
     * Parameter name
     */
    public String name;
    public ParamsInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Parameter value
     */
    public String value;
    public ParamsInfo value(String value)
    {
        this.value = value;
        return this;
    }
}