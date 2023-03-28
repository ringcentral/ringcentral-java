package com.ringcentral.definitions;


public class UserCallLogRecordTransferee {
    /**
     * Internal Identifier of Telephony Session, which belongs to transferee in case of Warm Transfer
     */
    public String telephonySessionId;

    public UserCallLogRecordTransferee telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }
}
