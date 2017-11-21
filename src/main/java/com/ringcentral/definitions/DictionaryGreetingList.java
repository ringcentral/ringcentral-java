package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DictionaryGreetingList
{
    // Canonical URI of greetings list resource
    public String uri;
    public DictionaryGreetingList uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of greetings
    public DictionaryGreetingInfo[] records;
    public DictionaryGreetingList records(DictionaryGreetingInfo[] records) {
        this.records = records;
        return this;
    }
}
