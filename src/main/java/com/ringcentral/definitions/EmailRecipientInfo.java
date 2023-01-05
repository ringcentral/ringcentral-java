package com.ringcentral.definitions;


public class EmailRecipientInfo
{
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    public EmailRecipientInfo extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * User full name
     */
    public String fullName;
    public EmailRecipientInfo fullName(String fullName)
    {
        this.fullName = fullName;
        return this;
    }

    /**
     * User extension number
     */
    public String extensionNumber;
    public EmailRecipientInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Current state of an extension
     * Enum: Enabled, Disable, NotActivated, Unassigned
     */
    public String status;
    public EmailRecipientInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * List of user email addresses from extension notification settings.
    * By default main email address from contact information is returned
     */
    public String[] emailAddresses;
    public EmailRecipientInfo emailAddresses(String[] emailAddresses)
    {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Call queue manager permission
     * Enum: FullAccess, Messages, MemberManagement
     */
    public String permission;
    public EmailRecipientInfo permission(String permission)
    {
        this.permission = permission;
        return this;
    }
}