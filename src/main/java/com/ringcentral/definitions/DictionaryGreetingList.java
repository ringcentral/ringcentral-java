package com.ringcentral.definitions;


public class DictionaryGreetingList {
    /**
     * Canonical URI of greetings list resource
     */
    public String uri;
    /**
     * List of greetings
     */
    public DictionaryGreetingInfo[] records;
    /**
     *
     */
    public NavigationInfo navigation;
    /**
     *
     */
    public EnumeratedPaging paging;

    public DictionaryGreetingList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DictionaryGreetingList records(DictionaryGreetingInfo[] records) {
        this.records = records;
        return this;
    }

    public DictionaryGreetingList navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public DictionaryGreetingList paging(EnumeratedPaging paging) {
        this.paging = paging;
        return this;
    }
}
