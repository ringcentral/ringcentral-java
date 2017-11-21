package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyAnsweringRuleCalledNumberInfo
{
    // Internal identifier of an account phone number
    public String id;
    public CompanyAnsweringRuleCalledNumberInfo id(String id) {
        this.id = id;
        return this;
    }
}
