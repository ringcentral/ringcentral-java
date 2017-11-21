package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomGreetingAnsweringRuleInfoRequest
{
    // Internal identifier of an answering rule
    public String id;
    public CustomGreetingAnsweringRuleInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
