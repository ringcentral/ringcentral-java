package com.ringcentral.definitions;


public class UserCallLogRecordTransferTarget {
    /**
     * Internal Identifier of Telephony Session, which belongs to transfer target in case of Warm Transfer
     */
    public String telephonySessionId;

    public UserCallLogRecordTransferTarget telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }
}
