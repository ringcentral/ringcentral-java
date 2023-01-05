package com.ringcentral.definitions;


public class DictionaryGreetingList
{
    /**
     * Canonical URI of greetings list resource
     */
    public String uri;
    public DictionaryGreetingList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of greetings
     */
    public DictionaryGreetingInfo[] records;
    public DictionaryGreetingList records(DictionaryGreetingInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public NavigationInfo navigation;
    public DictionaryGreetingList navigation(NavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPaging paging;
    public DictionaryGreetingList paging(EnumeratedPaging paging)
    {
        this.paging = paging;
        return this;
    }
}