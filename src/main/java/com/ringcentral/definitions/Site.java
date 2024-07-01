package com.ringcentral.definitions;


    /**
* Specifies a site that message template is associated with. Supported only if the Sites feature is enabled. 
* The default is `main-site` value.
* 
*/
public class Site
{
    /**
     * Internal identifier of a site
     */
    public String id;
    public Site id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Custom name of a site
     */
    public String name;
    public Site name(String name)
    {
        this.name = name;
        return this;
    }
}