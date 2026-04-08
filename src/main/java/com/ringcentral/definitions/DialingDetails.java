package com.ringcentral.definitions;

/**
 * Absent if the request's parameter `resultContent.includeDialingDetails` value is set to `false`.
 */
public class DialingDetails {
    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain a
     * service code.
     */
    public DialingDetailsServiceCode serviceCode;

    public DialingDetails serviceCode(DialingDetailsServiceCode serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain
     * an outbound call prefix. Example: 9
     */
    public String outboundCallPrefix;

    public DialingDetails outboundCallPrefix(String outboundCallPrefix) {
        this.outboundCallPrefix = outboundCallPrefix;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain a
     * special prefix.
     */
    public DialingDetailsSpecialPrefix specialPrefix;

    public DialingDetails specialPrefix(DialingDetailsSpecialPrefix specialPrefix) {
        this.specialPrefix = specialPrefix;
        return this;
    }
}
