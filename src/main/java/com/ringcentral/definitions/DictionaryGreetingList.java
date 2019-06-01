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

    public DictionaryGreetingList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DictionaryGreetingList records(DictionaryGreetingInfo[] records) {
        this.records = records;
        return this;
    }

}
