package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ForwardingInfoCreateRuleRequest
{
    // Specifies if the first ring on desktop/mobile apps is enabled. The default value is 'True'
    public Boolean notifyMySoftPhones;
    public ForwardingInfoCreateRuleRequest notifyMySoftPhones(Boolean notifyMySoftPhones) {
        this.notifyMySoftPhones = notifyMySoftPhones;
        return this;
    }
    // Specifies if the administrator's softphone (desktop application) is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is 'True'
    public Boolean notifyAdminSoftPhones;
    public ForwardingInfoCreateRuleRequest notifyAdminSoftPhones(Boolean notifyAdminSoftPhones) {
        this.notifyAdminSoftPhones = notifyAdminSoftPhones;
        return this;
    }
    // Specifies delay between ring on apps and starting of a call forwarding. The default value is 1
    public Long softPhonesRingCount;
    public ForwardingInfoCreateRuleRequest softPhonesRingCount(Long softPhonesRingCount) {
        this.softPhonesRingCount = softPhonesRingCount;
        return this;
    }
    // Specifies the order in which forwarding numbers ring. 'Sequentially' means that forwarding numbers are ringing one at a time, in order of priority. 'Simultaneously' means that forwarding numbers are ringing all at the same time. The default value is 'Sequentially'
    public String ringingMode;
    public ForwardingInfoCreateRuleRequest ringingMode(String ringingMode) {
        this.ringingMode = ringingMode;
        return this;
    }
    // Information on a call forwarding rule
    public RuleInfoCreateRuleRequest[] rules;
    public ForwardingInfoCreateRuleRequest rules(RuleInfoCreateRuleRequest[] rules) {
        this.rules = rules;
        return this;
    }
}
