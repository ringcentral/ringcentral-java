package com.ringcentral.definitions;


public class UserTemplates {
    /**
     * Link to user templates resource
     */
    public String uri;
    /**
     * List of user templates
     * Required
     */
    public TemplateInfo[] records;
    /**
     * Information on navigation
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     * Required
     */
    public ProvisioningPagingInfo paging;

    public UserTemplates uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserTemplates records(TemplateInfo[] records) {
        this.records = records;
        return this;
    }

    public UserTemplates navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public UserTemplates paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
