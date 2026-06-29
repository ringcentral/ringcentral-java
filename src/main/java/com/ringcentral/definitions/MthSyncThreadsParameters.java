package com.ringcentral.definitions;

/** Query parameters for operation mthSyncThreads */
public class MthSyncThreadsParameters {
    /**
     * Type of message synchronization request: - FSync -- full sync - ISync -- incremental sync
     * Default: FSync Enum: FSync, ISync
     */
    public String syncType;

    public MthSyncThreadsParameters syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /** Sync token (for &quot;ISync&quot; only) */
    public String syncToken;

    public MthSyncThreadsParameters syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
}
