package com.ringcentral.definitions;


public class TelephonySessionsEventPartyInfo {
    /**
     *
     */
    public String accountId;
    /**
     *
     */
    public String extensionId;
    /**
     *
     */
    public String id;
    /**
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     *
     */
    public CallPartyInfo to;
    /**
     *
     */
    public CallPartyInfo from;
    /**
     *
     */
    public CallSessionStatusInfo status;

    public TelephonySessionsEventPartyInfo accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public TelephonySessionsEventPartyInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public TelephonySessionsEventPartyInfo id(String id) {
        this.id = id;
        return this;
    }

    public TelephonySessionsEventPartyInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    public TelephonySessionsEventPartyInfo to(CallPartyInfo to) {
        this.to = to;
        return this;
    }

    public TelephonySessionsEventPartyInfo from(CallPartyInfo from) {
        this.from = from;
        return this;
    }

    public TelephonySessionsEventPartyInfo status(CallSessionStatusInfo status) {
        this.status = status;
        return this;
    }
}
