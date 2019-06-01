package com.ringcentral.definitions;


public class IVRPrompts {
    /**
     * Link to prompts library resource
     */
    public String uri;
    /**
     * List of Prompts
     */
    public PromptInfo[] records;
    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;
    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;

    public IVRPrompts uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IVRPrompts records(PromptInfo[] records) {
        this.records = records;
        return this;
    }

    public IVRPrompts navigation(CallHandlingNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public IVRPrompts paging(CallHandlingPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
