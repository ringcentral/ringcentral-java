package com.ringcentral.definitions;

public class ForwardingInfo {
    // Specifies if the user's softphone(s) are notified before forwarding the incoming call to desk phones and forwarding numbers
    public Boolean notifyMySoftPhones;
    // Specifies if the administrator's softphone is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is 'False'
    public Boolean notifyAdminSoftPhones;
    // Number of rings before forwarding starts
    public Long softPhonesRingCount;
    // Specifies the order in which forwarding numbers ring. 'Sequentially' means that forwarding numbers are ringing one at a time, in order of priority. 'Simultaneously' means that forwarding numbers are ring all at the same time
    public String ringingMode;
    // Information on a call forwarding rule
    public RuleInfo[] rules;
}
