package com.ringcentral.definitions;

public class ThreadEntriesSyncList {
    /** Required */
    public ThreadEntrySyncItem[] records;

    public ThreadEntriesSyncList records(ThreadEntrySyncItem[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public SyncInfoModel syncInfo;

    public ThreadEntriesSyncList syncInfo(SyncInfoModel syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
}
