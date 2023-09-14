package com.ringcentral.definitions;


public class ForwardAllCompanyCallsInfo {
    /**
     * Indicates whether the *Forward All Company Calls* feature is enabled or disabled for an account
     */
    public Boolean enabled;
    /**
     * Specific data ranges. If specified, weeklyRanges cannot be specified
     */
    public RangesInfo[] ranges;
    /**
     * Specifies how incoming calls are forwarded. The default value
     * is &#039;Operator&#039; &#039;Operator&#039; - play company greeting and forward to operator
     * extension &#039;Disconnect&#039; - play company greeting and disconnect &#039;Bypass&#039;
     * - bypass greeting to go to selected extension = [&#039;Operator&#039;, &#039;Disconnect&#039;,
     * &#039;Bypass&#039;]
     * Enum: Operator, Disconnect, Bypass
     */
    public String callHandlingAction;
    /**
     *
     */
    public ExtensionShortInfoResource extension;
    /**
     *
     */
    public ForwardAllCallsReason reason;

    public ForwardAllCompanyCallsInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ForwardAllCompanyCallsInfo ranges(RangesInfo[] ranges) {
        this.ranges = ranges;
        return this;
    }

    public ForwardAllCompanyCallsInfo callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    public ForwardAllCompanyCallsInfo extension(ExtensionShortInfoResource extension) {
        this.extension = extension;
        return this;
    }

    public ForwardAllCompanyCallsInfo reason(ForwardAllCallsReason reason) {
        this.reason = reason;
        return this;
    }
}
