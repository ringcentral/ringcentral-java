package com.ringcentral.definitions;

public class DictionaryGreetingList {
    /** Canonical URI of greetings list resource Format: uri */
    public String uri;

    public DictionaryGreetingList uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of greetings */
    public DictionaryGreetingInfo[] records;

    public DictionaryGreetingList records(DictionaryGreetingInfo[] records) {
        this.records = records;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public DictionaryGreetingList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public DictionaryGreetingList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
