package com.ringcentral.definitions;

/**
 * Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These
 * settings determine the forwarding numbers to which the call will be forwarded
 */
public class ForwardingInfoCreateRuleRequest {
    /**
     * Specifies if the first ring on desktop/mobile apps is enabled. The default value is `true`
     */
    public Boolean notifyMySoftPhones;

    public ForwardingInfoCreateRuleRequest notifyMySoftPhones(Boolean notifyMySoftPhones) {
        this.notifyMySoftPhones = notifyMySoftPhones;
        return this;
    }

    /**
     * Specifies delay between ring on apps and starting of a call forwarding. To activate this
     * parameter use the value &gt; 0, and turn off the `softPhonesAlwaysRing` setting. If the value
     * is 1 or 0, the `softPhonesAlwaysRing` setting cannot be turned off Format: int32
     */
    public Long softPhonesRingCount;

    public ForwardingInfoCreateRuleRequest softPhonesRingCount(Long softPhonesRingCount) {
        this.softPhonesRingCount = softPhonesRingCount;
        return this;
    }

    /**
     * Specifies that desktop and mobile applications of the user will ring till the end of their
     * forwarding list. If set to `true` then `softPhonesRingCount` is ignored Default: true
     */
    public Boolean softPhonesAlwaysRing;

    public ForwardingInfoCreateRuleRequest softPhonesAlwaysRing(Boolean softPhonesAlwaysRing) {
        this.softPhonesAlwaysRing = softPhonesAlwaysRing;
        return this;
    }

    /**
     * Specifies the order in which forwarding numbers ring. &#039;Sequentially&#039; means that
     * forwarding numbers are ringing one at a time, in order of priority.
     * &#039;Simultaneously&#039; means that forwarding numbers are ringing all at the same time.
     * The default value is &#039;Sequentially&#039; Enum: Sequentially, Simultaneously
     */
    public String ringingMode;

    public ForwardingInfoCreateRuleRequest ringingMode(String ringingMode) {
        this.ringingMode = ringingMode;
        return this;
    }

    /** Information on a call forwarding rule */
    public ForwardingRuleCreateRequest[] rules;

    public ForwardingInfoCreateRuleRequest rules(ForwardingRuleCreateRequest[] rules) {
        this.rules = rules;
        return this;
    }
}
