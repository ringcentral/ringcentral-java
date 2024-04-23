package com.ringcentral.definitions;


/**
 * Optional information to be used when account is moved to "Disabled" status
 */
public class AccountStatusInfo {
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

    public AccountStatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public AccountStatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

    public AccountStatusInfo till(String till) {
        this.till = till;
        return this;
    }
}
