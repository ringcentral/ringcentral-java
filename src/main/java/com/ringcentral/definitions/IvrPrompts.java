package com.ringcentral.definitions;


public class IvrPrompts
{
    /**
     * Link to prompts library resource
     * Format: uri
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
    public PageNavigationModel navigation;
    public IvrPrompts navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public IvrPrompts paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}