package com.ringcentral.definitions;


    /**
* Emergency response location information
*/
public class ERLLocationInfo
{
    /**
     * Internal identifier of an emergency response location
     */
    public String id;
    public ERLLocationInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Emergency response location name
     */
    public String name;
    public ERLLocationInfo name(String name)
    {
        this.name = name;
        return this;
    }
}