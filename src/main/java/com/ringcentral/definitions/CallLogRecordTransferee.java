package com.ringcentral.definitions;


public class CallLogRecordTransferee {
    /**
     * Internal Identifier of Telephony Session, which belongs to transferee in case of Warm Transfer
     */
    public String telephonySessionId;

    public CallLogRecordTransferee telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }
}
