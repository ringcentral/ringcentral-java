package com.ringcentral.definitions;

public class ThreadSyncList {
    /** Required */
    public MessageThread[] records;

    public ThreadSyncList records(MessageThread[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public SyncInfoModel syncInfo;

    public ThreadSyncList syncInfo(SyncInfoModel syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
}
