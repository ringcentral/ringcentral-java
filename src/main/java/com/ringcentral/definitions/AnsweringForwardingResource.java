package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AnsweringForwardingResource
{
    //
    public Boolean notifyMySoftPhones;
    public AnsweringForwardingResource notifyMySoftPhones(Boolean notifyMySoftPhones) {
        this.notifyMySoftPhones = notifyMySoftPhones;
        return this;
    }
    //
    public Boolean notifyAdminSoftPhones;
    public AnsweringForwardingResource notifyAdminSoftPhones(Boolean notifyAdminSoftPhones) {
        this.notifyAdminSoftPhones = notifyAdminSoftPhones;
        return this;
    }
    //
    public Long softPhonesRingCount;
    public AnsweringForwardingResource softPhonesRingCount(Long softPhonesRingCount) {
        this.softPhonesRingCount = softPhonesRingCount;
        return this;
    }
    //
    public String ringingMode;
    public AnsweringForwardingResource ringingMode(String ringingMode) {
        this.ringingMode = ringingMode;
        return this;
    }
    //
    public AnsweringForwardingRuleResource[] rules;
    public AnsweringForwardingResource rules(AnsweringForwardingRuleResource[] rules) {
        this.rules = rules;
        return this;
    }
}
