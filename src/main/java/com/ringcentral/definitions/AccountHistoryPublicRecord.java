package com.ringcentral.definitions;


public class AccountHistoryPublicRecord {
    /**
     * Internal record identifier
     * Example: 9835bead-397b-4ba8-b457-73f07ab79997
     */
    public String id;
    /**
     * Timestamp of an event (provided by a client), RFC3339 date-time format, UTC time zone.
     * Format: date-time
     */
    public String eventTime;
    /**
     *
     */
    public AccountHistoryRecordPublicInitiator initiator;
    /**
     * Action type
     * Example: CHANGE_SECRET_INFO
     */
    public String actionId;
    /**
     * Operation: &quot;CREATE&quot;, &quot;UPDATE&quot;, or &quot;DELETE&quot;
     * Example: UPDATE
     */
    public String eventType;
    /**
     * Account which is related with the particular record.
     * Example: 403858014008
     */
    public String accountId;
    /**
     * Account (company) name
     * Example: Some Company
     */
    public String accountName;
    /**
     *
     */
    public AccountHistoryRecordTarget target;
    /**
     * IP-address of a client. If not specified RCClientIp header value is used
     * Example: 192.168.42.6
     */
    public String clientIp;
    /**
     * Custom top-level comment
     */
    public String comment;
    /**
     *
     */
    public AccountHistoryRecordPublicDetails details;

    public AccountHistoryPublicRecord id(String id) {
        this.id = id;
        return this;
    }

    public AccountHistoryPublicRecord eventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public AccountHistoryPublicRecord initiator(AccountHistoryRecordPublicInitiator initiator) {
        this.initiator = initiator;
        return this;
    }

    public AccountHistoryPublicRecord actionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    public AccountHistoryPublicRecord eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public AccountHistoryPublicRecord accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public AccountHistoryPublicRecord accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public AccountHistoryPublicRecord target(AccountHistoryRecordTarget target) {
        this.target = target;
        return this;
    }

    public AccountHistoryPublicRecord clientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    public AccountHistoryPublicRecord comment(String comment) {
        this.comment = comment;
        return this;
    }

    public AccountHistoryPublicRecord details(AccountHistoryRecordPublicDetails details) {
        this.details = details;
        return this;
    }
}
