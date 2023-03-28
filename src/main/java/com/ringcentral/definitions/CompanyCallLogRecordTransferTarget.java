package com.ringcentral.definitions;


public class CompanyCallLogRecordTransferTarget {
    /**
     * Internal Identifier of Telephony Session, which belongs to transfer target in case of Warm Transfer
     */
    public String telephonySessionId;

    public CompanyCallLogRecordTransferTarget telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }
}
