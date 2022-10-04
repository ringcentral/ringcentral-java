package com.ringcentral.definitions;


public class IvrPrompts {
    /**
     * Link to prompts library resource
     */
    public String uri;
    /**
     * List of Prompts
     */
    public PromptInfo[] records;
    /**
     *
     */
    public NavigationInfo navigation;
    /**
     *
     */
    public EnumeratedPaging paging;

    public IvrPrompts uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IvrPrompts records(PromptInfo[] records) {
        this.records = records;
        return this;
    }

    public IvrPrompts navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public IvrPrompts paging(EnumeratedPaging paging) {
        this.paging = paging;
        return this;
    }
}
