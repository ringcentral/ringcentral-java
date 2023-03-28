package com.ringcentral.definitions;


public class CallLogRecordLegInfoTransferee {
    /**
     * Internal Identifier of Telephony Session, which belongs to transferee in case of Warm Transfer
     */
    public String telephonySessionId;

    public CallLogRecordLegInfoTransferee telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }
}
