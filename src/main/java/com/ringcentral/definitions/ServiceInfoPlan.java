package com.ringcentral.definitions;


    /**
* Information on account service plan
*/
public class ServiceInfoPlan
{
    /**
     * Internal identifier of a service plan
     */
    public String id;
    public ServiceInfoPlan id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Name of a service plan
     */
    public String name;
    public ServiceInfoPlan name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Edition of a service plan
     */
    public String edition;
    public ServiceInfoPlan edition(String edition)
    {
        this.edition = edition;
        return this;
    }

    /**
     * Enum: Freyja, Phoenix
     */
    public String freemiumProductType;
    public ServiceInfoPlan freemiumProductType(String freemiumProductType)
    {
        this.freemiumProductType = freemiumProductType;
        return this;
    }
}