package com.ringcentral.definitions;


/**
 * Status information (reason, comment). Returned for 'Disabled'
 * status only
 */
public class ExtensionStatusInfo {
    /**
     * A free-form user comment, describing the status change reason
     */
    public String comment;
    /**
     * Type of suspension
     * Enum: SuspendedVoluntarily, SuspendedInvoluntarily, CancelledVoluntarily, CancelledInvoluntarily
     */
    public String reason;
    /**
     * Date until which an account will get deleted. The default
     * value is 30 days since the current date
     * Format: date-time
     */
    public String till;

    public ExtensionStatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

    public ExtensionStatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public ExtensionStatusInfo till(String till) {
        this.till = till;
        return this;
    }
}
