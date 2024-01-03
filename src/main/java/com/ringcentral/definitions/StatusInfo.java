package com.ringcentral.definitions;


/**
 * Optional information to be used when account is moved to "Disabled" status
 */
public class StatusInfo {
    /**
     * Type of suspension, voluntarily or not
     * Example: CancelledVoluntarily
     * Enum: SuspendedVoluntarily, SuspendedInvoluntarily, CancelledVoluntarily, CancelledInvoluntarily
     */
    public String reason;
    /**
     * A meaningful description of the reason to change the status
     * Example: By customer request. Case ABC123
     */
    public String comment;
    /**
     * Date after which the account will get deleted. Parameter can be used to overwrite default retention period
     * Format: date-time
     * Example: 2023-03-26T11:30:45.940Z
     */
    public String till;

    public StatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public StatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

    public StatusInfo till(String till) {
        this.till = till;
        return this;
    }
}
