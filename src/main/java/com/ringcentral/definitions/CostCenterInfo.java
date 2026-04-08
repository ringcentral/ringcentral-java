package com.ringcentral.definitions;


    /**
* Cost center information. Applicable if Cost Center feature is enabled. The default is `root` cost center value
*/
public class CostCenterInfo
{
    /**
     * Internal identifier of a cost center
     */
    public String id;
    public CostCenterInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Name of a cost center
     */
    public String name;
    public CostCenterInfo name(String name)
    {
        this.name = name;
        return this;
    }
}