package com.ringcentral.definitions;


    /**
* Top IVR Menu extension. Mandatory for MultiLevel mode
* 
*/
public class SiteIVRTopMenu
{
    /**
     * Internal identifier of an IVR menu extension
     */
    public String id;
    public SiteIVRTopMenu id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link to an IVR menu extension resource
     * Format: uri
     */
    public String uri;
    public SiteIVRTopMenu uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Full name of an IVR menu extension user
     */
    public String name;
    public SiteIVRTopMenu name(String name)
    {
        this.name = name;
        return this;
    }
}