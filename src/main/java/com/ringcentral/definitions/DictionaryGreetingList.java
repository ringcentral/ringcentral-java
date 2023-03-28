package com.ringcentral.definitions;


public class DictionaryGreetingList {
    /**
     * Canonical URI of greetings list resource
     * Format: uri
     */
    public String uri;
    /**
     * List of greetings
     */
    public DictionaryGreetingInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public DictionaryGreetingList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DictionaryGreetingList records(DictionaryGreetingInfo[] records) {
        this.records = records;
        return this;
    }

    public DictionaryGreetingList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public DictionaryGreetingList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
