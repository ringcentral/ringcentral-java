package com.ringcentral.definitions;

public class LanguageList {
    /** Canonical URI of the language list resource Format: uri */
    public String uri;

    public LanguageList uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Language data */
    public LanguageInfo[] records;

    public LanguageList records(LanguageInfo[] records) {
        this.records = records;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public LanguageList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public LanguageList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
