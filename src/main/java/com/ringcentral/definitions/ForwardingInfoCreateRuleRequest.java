package com.ringcentral.definitions;


// Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
public class ForwardingInfoCreateRuleRequest {
    /**
     * Specifies if the first ring on desktop/mobile apps is enabled. The default value is &#039;True&#039;
     */
    public Boolean notifyMySoftPhones;
    /**
     * Deprecated parameter. Specifies if the administrator&#039;s softphone (desktop application) is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is &#039;True&#039;.
     */
    public Boolean notifyAdminSoftPhones;
    /**
     * Specifies delay between ring on apps and starting of a call forwarding. To activate this parameter use the value &gt; 0, and turn off the `softPhonesAlwaysRing` setting. If the value is 1 or 0, the `softPhonesAlwaysRing` setting cannot be turned off
     */
    public Long softPhonesRingCount;
    /**
     * Specifies that desktop and mobile applications of the user will ring till the end of their forwarding list. If set to &#039;True&#039; then `softPhonesRingCount` is ignored
     * Default: true
     */
    public Boolean softPhonesAlwaysRing;
    /**
     * Specifies the order in which forwarding numbers ring. &#039;Sequentially&#039; means that forwarding numbers are ringing one at a time, in order of priority. &#039;Simultaneously&#039; means that forwarding numbers are ringing all at the same time. The default value is &#039;Sequentially&#039;
     * Enum: Sequentially, Simultaneously
     */
    public String ringingMode;
    /**
     * Information on a call forwarding rule
     */
    public RuleInfoCreateRuleRequest[] rules;
    /**
     * Deprecated parameter. Specifies if mobile timeout is activated for the rule
     */
    public Boolean mobileTimeout;

    public ForwardingInfoCreateRuleRequest notifyMySoftPhones(Boolean notifyMySoftPhones) {
        this.notifyMySoftPhones = notifyMySoftPhones;
        return this;
    }

    public ForwardingInfoCreateRuleRequest notifyAdminSoftPhones(Boolean notifyAdminSoftPhones) {
        this.notifyAdminSoftPhones = notifyAdminSoftPhones;
        return this;
    }

    public ForwardingInfoCreateRuleRequest softPhonesRingCount(Long softPhonesRingCount) {
        this.softPhonesRingCount = softPhonesRingCount;
        return this;
    }

    public ForwardingInfoCreateRuleRequest softPhonesAlwaysRing(Boolean softPhonesAlwaysRing) {
        this.softPhonesAlwaysRing = softPhonesAlwaysRing;
        return this;
    }

    public ForwardingInfoCreateRuleRequest ringingMode(String ringingMode) {
        this.ringingMode = ringingMode;
        return this;
    }

    public ForwardingInfoCreateRuleRequest rules(RuleInfoCreateRuleRequest[] rules) {
        this.rules = rules;
        return this;
    }

    public ForwardingInfoCreateRuleRequest mobileTimeout(Boolean mobileTimeout) {
        this.mobileTimeout = mobileTimeout;
        return this;
    }
}
