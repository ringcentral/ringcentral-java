package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomGreetingAnsweringRuleInfo
{
    // Canonical URI of an answering rule
    public String uri;
    public CustomGreetingAnsweringRuleInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of an answering rule
    public String id;
    public CustomGreetingAnsweringRuleInfo id(String id) {
        this.id = id;
        return this;
    }
}
