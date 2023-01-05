package com.ringcentral.definitions;


    /**
* Information on account target service plan
*/
public class TargetServicePlanInfo
{
    /**
     * Internal identifier of a target service plan
     */
    public String id;
    public TargetServicePlanInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Name of a target service plan
     */
    public String name;
    public TargetServicePlanInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Edition of a service plan
     */
    public String edition;
    public TargetServicePlanInfo edition(String edition)
    {
        this.edition = edition;
        return this;
    }

    /**
     * Enum: Freyja, Phoenix
     */
    public String freemiumProductType;
    public TargetServicePlanInfo freemiumProductType(String freemiumProductType)
    {
        this.freemiumProductType = freemiumProductType;
        return this;
    }
}