package com.ringcentral.definitions;


public class UserTemplates {
    /**
     * Link to user templates resource
     * Format: uri
     */
    public String uri;
    /**
     * List of user templates
     * Required
     */
    public TemplateInfo[] records;
    /**
     * Required
     */
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public UserTemplates uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserTemplates records(TemplateInfo[] records) {
        this.records = records;
        return this;
    }

    public UserTemplates navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public UserTemplates paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
