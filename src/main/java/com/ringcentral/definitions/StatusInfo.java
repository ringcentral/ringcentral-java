package com.ringcentral.definitions;

public class StatusInfo {
    // A free-form user comment, describing the status change reason
    public String comment;
    // Type of suspension
    public String reason;

    public StatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

    public StatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }
}
