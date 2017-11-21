package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyAnsweringRuleExtensionInfoRequest
{
    // Time in format hh:mm
    public String id;
    public CompanyAnsweringRuleExtensionInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
