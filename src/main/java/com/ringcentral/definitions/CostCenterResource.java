package com.ringcentral.definitions;


public class CostCenterResource
{
    /**
     * Example: 83266549237542
     */
    public String id;
    public CostCenterResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Example: Main
     */
    public String code;
    public CostCenterResource code(String code)
    {
        this.code = code;
        return this;
    }

    /**
     * Example: Cost Center A
     */
    public String name;
    public CostCenterResource name(String name)
    {
        this.name = name;
        return this;
    }
}