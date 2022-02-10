package com.ringcentral.definitions;


/**
 * Status information (reason, comment). Returned for 'Disabled' status only
 */
public class ExtensionStatusInfo {
    /**
     * A free-form user comment, describing the status change reason
     */
    public String comment;
    /**
     * Type of suspension
     * Enum: Voluntarily, Involuntarily, SuspendedVoluntarily, SuspendedVoluntarily2
     */
    public String reason;

    public ExtensionStatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

    public ExtensionStatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }
}
