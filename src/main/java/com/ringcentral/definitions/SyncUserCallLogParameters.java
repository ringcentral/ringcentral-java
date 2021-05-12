package com.ringcentral.definitions;


// Query parameters for operation syncUserCallLog
public class SyncUserCallLogParameters {
    /**
     * Type of synchronization
     * Default: FSync
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     * Value of syncToken property of last sync request response
     */
    public String syncToken;
    /**
     * The start datetime for resulting records in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is the current moment
     * Format: date-time
     */
    public String dateFrom;
    /**
     * For &#039;FSync&#039; the parameter is mandatory, it limits the number of records to be returned in response. For &#039;ISync&#039; it specifies with how many records to extend sync Frame to the past, the maximum number of records is 250
     */
    public Long recordCount;
    /**
     * Type of calls to be returned. The default value is &#039;All&#039;
     * Enum: Missed, All
     */
    public String[] statusGroup;
    /**
     * View of call records. The same view parameter specified for FSync will be applied for ISync, the view cannot be changed for ISync
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    /**
     * Supported for ISync. If &#039;True&#039; then deleted call records are returned
     */
    public Boolean showDeleted;

    public SyncUserCallLogParameters syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncUserCallLogParameters syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncUserCallLogParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public SyncUserCallLogParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public SyncUserCallLogParameters statusGroup(String[] statusGroup) {
        this.statusGroup = statusGroup;
        return this;
    }

    public SyncUserCallLogParameters view(String view) {
        this.view = view;
        return this;
    }

    public SyncUserCallLogParameters showDeleted(Boolean showDeleted) {
        this.showDeleted = showDeleted;
        return this;
    }
}
