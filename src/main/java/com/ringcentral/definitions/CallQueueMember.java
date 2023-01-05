package com.ringcentral.definitions;


    /**
* Call queue member information
*/
public class CallQueueMember
{
    /**
     * Internal identifier of an extension
     */
    public String id;
    public CallQueueMember id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Extension full name
     */
    public String name;
    public CallQueueMember name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Extension number
     */
    public String extensionNumber;
    public CallQueueMember extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     */
    public SiteResource site;
    public CallQueueMember site(SiteResource site)
    {
        this.site = site;
        return this;
    }
}