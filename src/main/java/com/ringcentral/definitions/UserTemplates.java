package com.ringcentral.definitions;

public class UserTemplates {
    /** Link to user templates resource Format: uri */
    public String uri;

    public UserTemplates uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of user templates Required */
    public TemplateInfo[] records;

    public UserTemplates records(TemplateInfo[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public PageNavigationModel navigation;

    public UserTemplates navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public UserTemplates paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
