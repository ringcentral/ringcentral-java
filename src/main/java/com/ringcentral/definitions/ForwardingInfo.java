package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ForwardingInfo
{
    // Specifies if the user's softphone(s) are notified before forwarding the incoming call to desk phones and forwarding numbers
    public Boolean notifyMySoftPhones;
    public ForwardingInfo notifyMySoftPhones(Boolean notifyMySoftPhones) {
        this.notifyMySoftPhones = notifyMySoftPhones;
        return this;
    }
    // Specifies if the administrator's softphone is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is 'False'
    public Boolean notifyAdminSoftPhones;
    public ForwardingInfo notifyAdminSoftPhones(Boolean notifyAdminSoftPhones) {
        this.notifyAdminSoftPhones = notifyAdminSoftPhones;
        return this;
    }
    // Number of rings before forwarding starts
    public Long softPhonesRingCount;
    public ForwardingInfo softPhonesRingCount(Long softPhonesRingCount) {
        this.softPhonesRingCount = softPhonesRingCount;
        return this;
    }
    // Specifies the order in which forwarding numbers ring. 'Sequentially' means that forwarding numbers are ringing one at a time, in order of priority. 'Simultaneously' means that forwarding numbers are ring all at the same time
    public String ringingMode;
    public ForwardingInfo ringingMode(String ringingMode) {
        this.ringingMode = ringingMode;
        return this;
    }
    // Information on a call forwarding rule
    public RuleInfo[] rules;
    public ForwardingInfo rules(RuleInfo[] rules) {
        this.rules = rules;
        return this;
    }
}
