package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CustomCompanyGreetingAnsweringRuleInfo
{
    // Internal identifier of an answering rule
    public String id;
    public CustomCompanyGreetingAnsweringRuleInfo id(String id) {
        this.id = id;
        return this;
    }
}
