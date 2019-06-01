package com.ringcentral.definitions;


public class DisabledFilterInfo {
    /**
     * Event filter that is disabled for the user
     */
    public String filter;
    /**
     * Reason why the filter is disabled for the user
     */
    public String reason;
    /**
     * Error message
     */
    public String message;

    public DisabledFilterInfo filter(String filter) {
        this.filter = filter;
        return this;
    }

    public DisabledFilterInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public DisabledFilterInfo message(String message) {
        this.message = message;
        return this;
    }

}
