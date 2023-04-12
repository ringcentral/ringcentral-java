package com.ringcentral.definitions;


public class BaseCallLogRecordTransferee {
    /**
     * Internal Identifier of Telephony Session, which belongs to transferee in case of Warm Transfer
     */
    public String telephonySessionId;

    public BaseCallLogRecordTransferee telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }
}
