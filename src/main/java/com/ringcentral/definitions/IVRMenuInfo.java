package com.ringcentral.definitions;


public class IVRMenuInfo
{
    /**
     * Internal identifier of an IVR Menu extension
     */
    public String id;
    public IVRMenuInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link to an IVR Menu extension resource
     */
    public String uri;
    public IVRMenuInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * First name of an IVR Menu user
     */
    public String name;
    public IVRMenuInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Number of an IVR Menu extension
     */
    public String extensionNumber;
    public IVRMenuInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     */
    public IvrMenuSiteInfo site;
    public IVRMenuInfo site(IvrMenuSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     */
    public IvrMenuPromptInfo prompt;
    public IVRMenuInfo prompt(IvrMenuPromptInfo prompt)
    {
        this.prompt = prompt;
        return this;
    }

    /**
     * Keys handling settings
     */
    public IVRMenuActionsInfo[] actions;
    public IVRMenuInfo actions(IVRMenuActionsInfo[] actions)
    {
        this.actions = actions;
        return this;
    }
}