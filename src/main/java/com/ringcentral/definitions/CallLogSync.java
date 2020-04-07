package com.ringcentral.definitions;


public class CallLogSync {
    /**
     * Link to the list of call log records with sync information
     */
    public String uri;
    /**
     * List of call log records with synchronization information. For ISync the total number of returned records is limited to 250; this includes both new records and the old ones, specified by the recordCount parameter
     */
    public UserCallLogRecord[] records;
    /**
     * Sync information (type, token and time)
     */
    public SyncInfoCallLog syncInfo;

    public CallLogSync uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallLogSync records(UserCallLogRecord[] records) {
        this.records = records;
        return this;
    }

    public CallLogSync syncInfo(SyncInfoCallLog syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }

}
