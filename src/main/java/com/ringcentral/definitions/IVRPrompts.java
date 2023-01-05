package com.ringcentral.definitions;


public class IvrPrompts
{
    /**
     * Link to prompts library resource
     */
    public String uri;
    public IvrPrompts uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of Prompts
     */
    public PromptInfo[] records;
    public IvrPrompts records(PromptInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public NavigationInfo navigation;
    public IvrPrompts navigation(NavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPaging paging;
    public IvrPrompts paging(EnumeratedPaging paging)
    {
        this.paging = paging;
        return this;
    }
}