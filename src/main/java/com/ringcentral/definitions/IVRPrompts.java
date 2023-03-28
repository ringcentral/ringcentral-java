package com.ringcentral.definitions;


public class IvrPrompts {
    /**
     * Link to prompts library resource
     * Format: uri
     */
    public String uri;
    /**
     * List of Prompts
     */
    public PromptInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public IvrPrompts uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IvrPrompts records(PromptInfo[] records) {
        this.records = records;
        return this;
    }

    public IvrPrompts navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public IvrPrompts paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
