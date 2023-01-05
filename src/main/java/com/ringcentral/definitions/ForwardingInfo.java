package com.ringcentral.definitions;


    /**
* Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
*/
public class ForwardingInfo
{
    /**
     * Specifies if the user&#039;s softphone(s) are notified before forwarding the incoming call to desk phones and forwarding numbers
     */
    public Boolean notifyMySoftPhones;
    public ForwardingInfo notifyMySoftPhones(Boolean notifyMySoftPhones)
    {
        this.notifyMySoftPhones = notifyMySoftPhones;
        return this;
    }

    /**
     * Deprecated parameter. Specifies if the administrator&#039;s softphone is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is &#039;False&#039;
     */
    public Boolean notifyAdminSoftPhones;
    public ForwardingInfo notifyAdminSoftPhones(Boolean notifyAdminSoftPhones)
    {
        this.notifyAdminSoftPhones = notifyAdminSoftPhones;
        return this;
    }

    /**
     * Number of rings before forwarding starts
     * Format: int32
     */
    public Long softPhonesRingCount;
    public ForwardingInfo softPhonesRingCount(Long softPhonesRingCount)
    {
        this.softPhonesRingCount = softPhonesRingCount;
        return this;
    }

    /**
     * Specifies that desktop and mobile applications of the user will ring till the end of their forwarding list. If set to &#039;True&#039; then `softPhonesRingCount` is ignored
     * Default: true
     */
    public Boolean softPhonesAlwaysRing;
    public ForwardingInfo softPhonesAlwaysRing(Boolean softPhonesAlwaysRing)
    {
        this.softPhonesAlwaysRing = softPhonesAlwaysRing;
        return this;
    }

    /**
     * Specifies the order in which the forwarding numbers ring. &#039;Sequentially&#039; means that forwarding numbers are ringing one at a time, in order of priority. &#039;Simultaneously&#039; means that forwarding numbers are ring all at the same time
     * Enum: Sequentially, Simultaneously
     */
    public String ringingMode;
    public ForwardingInfo ringingMode(String ringingMode)
    {
        this.ringingMode = ringingMode;
        return this;
    }

    /**
     * Information on a call forwarding rule
     */
    public ForwardingRuleInfo[] rules;
    public ForwardingInfo rules(ForwardingRuleInfo[] rules)
    {
        this.rules = rules;
        return this;
    }

    /**
     * Specifies if desktop and mobile applications of the user are notified before (true) or after (false) forwarding the incoming call to desk phones and forwarding numbers. Applicable only if `notifyMySoftPhones` parameter is set to `true`
     */
    public Boolean softPhonesPositionTop;
    public ForwardingInfo softPhonesPositionTop(Boolean softPhonesPositionTop)
    {
        this.softPhonesPositionTop = softPhonesPositionTop;
        return this;
    }

    /**
     * Deprecated parameter. Specifies if mobile timeout is activated for the rule
     */
    public Boolean mobileTimeout;
    public ForwardingInfo mobileTimeout(Boolean mobileTimeout)
    {
        this.mobileTimeout = mobileTimeout;
        return this;
    }
}