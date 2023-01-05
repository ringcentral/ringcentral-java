package com.ringcentral.definitions;


    /**
* Query parameters for operation syncAccountCallLog
*/
public class SyncAccountCallLogParameters
{
    /**
     * Type of call log synchronization request: full or incremental sync
     * Enum: FSync, ISync
     */
    public String syncType;
    public SyncAccountCallLogParameters syncType(String syncType)
    {
        this.syncType = syncType;
        return this;
    }

    /**
     * Value of syncToken property of last sync request response
     */
    public String syncToken;
    public SyncAccountCallLogParameters syncToken(String syncToken)
    {
        this.syncToken = syncToken;
        return this;
    }

    /**
     * The start datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is the current moment
     * Format: date-time
     */
    public String dateFrom;
    public SyncAccountCallLogParameters dateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * For &#039;FSync&#039; the parameter is mandatory, it limits the number of records to be returned in response. For &#039;ISync&#039; it specifies with how many records to extend sync frame to the past, the maximum number of records is 250
     * Minimum: 1
     * Format: int32
     */
    public Long recordCount;
    public SyncAccountCallLogParameters recordCount(Long recordCount)
    {
        this.recordCount = recordCount;
        return this;
    }

    /**
     * Type of calls to be returned.
     * Enum: Missed, All
     */
    public String[] statusGroup;
    public SyncAccountCallLogParameters statusGroup(String[] statusGroup)
    {
        this.statusGroup = statusGroup;
        return this;
    }

    /**
     * Defines the level of details for returned call records
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    public SyncAccountCallLogParameters view(String view)
    {
        this.view = view;
        return this;
    }

    /**
     * Supported for `ISync` mode. Indicates that deleted call records should be returned
     */
    public Boolean showDeleted;
    public SyncAccountCallLogParameters showDeleted(Boolean showDeleted)
    {
        this.showDeleted = showDeleted;
        return this;
    }
}