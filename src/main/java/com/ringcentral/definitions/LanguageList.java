package com.ringcentral.definitions;


public class LanguageList {
    /**
     * Canonical URI of the language list resource
     * Format: uri
     */
    public String uri;
    /**
     * Language data
     */
    public LanguageInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public LanguageList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public LanguageList records(LanguageInfo[] records) {
        this.records = records;
        return this;
    }

    public LanguageList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public LanguageList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
