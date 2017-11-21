package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyAnsweringRuleCalledNumberInfoRequest
{
    // Internal identifier of an account phone number
    public String id;
    public CompanyAnsweringRuleCalledNumberInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
