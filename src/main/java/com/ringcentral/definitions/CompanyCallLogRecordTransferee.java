package com.ringcentral.definitions;


public class CompanyCallLogRecordTransferee {
    /**
     * Internal Identifier of Telephony Session, which belongs to transferee in case of Warm Transfer
     */
    public String telephonySessionId;

    public CompanyCallLogRecordTransferee telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }
}
