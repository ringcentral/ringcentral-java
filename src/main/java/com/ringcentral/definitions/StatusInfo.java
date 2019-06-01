package com.ringcentral.definitions;


public class StatusInfo {
    /**
     *
     */
    public String reason;
    /**
     *
     */
    public String till;
    /**
     *
     */
    public String comment;

    public StatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public StatusInfo till(String till) {
        this.till = till;
        return this;
    }

    public StatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

}
