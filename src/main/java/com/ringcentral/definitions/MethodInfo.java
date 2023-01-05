package com.ringcentral.definitions;


    /**
* Shipping method information
*/
public class MethodInfo
{
    /**
     * Method identifier. The default value is 1 (Ground)
     * Enum: 1, 2, 3
     */
    public String id;
    public MethodInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Method name, corresponding to the identifier
     * Enum: Ground, 2 Day, Overnight
     */
    public String name;
    public MethodInfo name(String name)
    {
        this.name = name;
        return this;
    }
}