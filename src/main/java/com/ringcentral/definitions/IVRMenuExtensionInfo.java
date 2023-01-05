package com.ringcentral.definitions;


    /**
* For 'Connect' or 'Voicemail' actions only. Extension reference
*/
public class IVRMenuExtensionInfo
{
    /**
     * Link to an extension resource
     */
    public String uri;
    public IVRMenuExtensionInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of an extension
     */
    public String id;
    public IVRMenuExtensionInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Name of an extension
     */
    public String name;
    public IVRMenuExtensionInfo name(String name)
    {
        this.name = name;
        return this;
    }
}