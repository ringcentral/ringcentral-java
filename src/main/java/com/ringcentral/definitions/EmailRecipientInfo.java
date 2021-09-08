package com.ringcentral.definitions;


public class EmailRecipientInfo {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * User full name
     */
    public String fullName;
    /**
     * User extension number
     */
    public String extensionNumber;
    /**
     * Current state of an extension
     * Enum: Enabled, Disable, NotActivated, Unassigned
     */
    public String status;
    /**
     * List of user email addresses from extension notification settings. By default main email address from contact information is returned
     */
    public String[] emailAddresses;
    /**
     * Call queue manager permission
     * Enum: FullAccess, Messages, MemberManagement
     */
    public String permission;

    public EmailRecipientInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public EmailRecipientInfo fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public EmailRecipientInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public EmailRecipientInfo status(String status) {
        this.status = status;
        return this;
    }

    public EmailRecipientInfo emailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    public EmailRecipientInfo permission(String permission) {
        this.permission = permission;
        return this;
    }
}
