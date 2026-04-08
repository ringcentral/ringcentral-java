package com.ringcentral.definitions;


    /**
* For 'Connect' or 'Voicemail' actions only. Extension reference
*/
public class IvrMenuExtensionInfo
{
    /**
     * Link to an extension resource
     * Format: uri
     */
    public String uri;
    public IvrMenuExtensionInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of an extension
     */
    public String id;
    public IvrMenuExtensionInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Name of an extension
     */
    public String name;
    public IvrMenuExtensionInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Extension number
     */
    public String pin;
    public IvrMenuExtensionInfo pin(String pin)
    {
        this.pin = pin;
        return this;
    }
}