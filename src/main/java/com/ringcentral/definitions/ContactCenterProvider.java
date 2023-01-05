package com.ringcentral.definitions;


    /**
* CCRN (Contact Center Routing Number) provider. If not specified then the default value 'InContact/North America' is used, its ID is '1'
*/
public class ContactCenterProvider
{
    /**
     * Internal identifier of the provider
     */
    public String id;
    public ContactCenterProvider id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Provider&#039;s name
     */
    public String name;
    public ContactCenterProvider name(String name)
    {
        this.name = name;
        return this;
    }
}