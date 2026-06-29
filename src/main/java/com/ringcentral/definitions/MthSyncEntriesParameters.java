package com.ringcentral.definitions;

/** Query parameters for operation mthSyncEntries */
public class MthSyncEntriesParameters {
    /**
     * Scope of synchronization (`syncType=FSync` only):
     *
     * <p>- `Accessible`: returns entries in threads monitored by the current user; - `Unassigned`:
     * returns entries in accessible unassigned threads; - `AssignedToMe`: returns entries in
     * threads that are assigned to the current user; - `AssignedToMeAndUnassigned`: returns entries
     * in threads that are assigned to the current user or unassigned; - `Explicit`: returns entries
     * in threads specified through the `threadIds` parameter. Default: AssignedToMe Enum:
     * Accessible, Unassigned, AssignedToMe, AssignedToMeAndUnassigned, Explicit
     */
    public String scope;

    public MthSyncEntriesParameters scope(String scope) {
        this.scope = scope;
        return this;
    }

    /** List of thread IDs to synchronize (`Explicit` scope only) */
    public String[] threadIds;

    public MthSyncEntriesParameters threadIds(String[] threadIds) {
        this.threadIds = threadIds;
        return this;
    }

    /**
     * Type of message synchronization request: - FSync -- full sync - ISync -- incremental sync
     * Default: FSync Enum: FSync, ISync
     */
    public String syncType;

    public MthSyncEntriesParameters syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /** Sync token (for &quot;ISync&quot; only) */
    public String syncToken;

    public MthSyncEntriesParameters syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
}
