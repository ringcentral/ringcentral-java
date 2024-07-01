package com.ringcentral.definitions;


    /**
* Account sub-brand information
*/
public class ServiceInfoUBrand
{
    /**
     * Sub-brand unique ID
     * Example: 111.222
     */
    public String id;
    public ServiceInfoUBrand id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Sub-brand name
     * Example: Sub-brand name
     */
    public String name;
    public ServiceInfoUBrand name(String name)
    {
        this.name = name;
        return this;
    }
}