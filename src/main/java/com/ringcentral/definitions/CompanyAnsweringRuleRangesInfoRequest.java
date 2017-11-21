package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyAnsweringRuleRangesInfoRequest
{
    // Date and time in format YYYY-MM-DD hh:mm
    public String from;
    public CompanyAnsweringRuleRangesInfoRequest from(String from) {
        this.from = from;
        return this;
    }
    // Date and time in format YYYY-MM-DD hh:mm
    public String to;
    public CompanyAnsweringRuleRangesInfoRequest to(String to) {
        this.to = to;
        return this;
    }
}
