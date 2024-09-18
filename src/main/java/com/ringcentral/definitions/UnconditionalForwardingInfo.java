package com.ringcentral.definitions;


/**
 * Unconditional forwarding parameters.
 * Returned if 'UnconditionalForwarding' value is specified for the `callHandlingAction` parameter
 */
public class UnconditionalForwardingInfo {
    /**
     * Phone number to which the call is forwarded. In addition to
     * common E.164 format, the following number patterns are supported: 11xxxxxxxxxxx,
     * 444xxxxxxxxxxx, 616xxxxxxxxxxx, 1700yyyy; where xxxxxxxxxxx is a phone number in
     * E.164 format (without &#039;+&#039; sign) and yyyy is an external short extension number.
     * Max number of digits is 15
     */
    public String phoneNumber;
    /**
     * Event that initiates forwarding to the specified phone number
     * Enum: HoldTimeExpiration, MaxCallers, NoAnswer
     */
    public String action;

    public UnconditionalForwardingInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UnconditionalForwardingInfo action(String action) {
        this.action = action;
        return this;
    }
}
