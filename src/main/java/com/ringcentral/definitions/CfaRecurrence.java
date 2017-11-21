package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CfaRecurrence
{
    //
    public String pattern;
    public CfaRecurrence pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    //
    public String value;
    public CfaRecurrence value(String value) {
        this.value = value;
        return this;
    }
}
