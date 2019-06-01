package com.ringcentral.definitions;


public class LanguageList {
    /**
     * Canonical URI of the language list resource
     */
    public String uri;
    /**
     * Language data
     */
    public LanguageInfo[] records;
    /**
     * Information on navigation
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     */
    public ProvisioningPagingInfo paging;

    public LanguageList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public LanguageList records(LanguageInfo[] records) {
        this.records = records;
        return this;
    }

    public LanguageList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public LanguageList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
