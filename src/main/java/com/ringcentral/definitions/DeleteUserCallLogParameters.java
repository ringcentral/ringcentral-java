package com.ringcentral.definitions;


/**
 * Query parameters for operation deleteUserCallLog
 */
public class DeleteUserCallLogParameters {
    /**
     * The time boundary to delete all older records in ISO 8601 format including
     * timezone, for example *2016-03-10T18:07:52.534Z*. The default value is current time
     * Format: date-time
     */
    public String dateTo;

    public DeleteUserCallLogParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }
}
