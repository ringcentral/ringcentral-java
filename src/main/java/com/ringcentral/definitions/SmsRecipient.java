package com.ringcentral.definitions;

public class SmsRecipient {
    /** ID of extension who is configured as a CQ&#039;s SMS recipient. */
    public String id;

    public SmsRecipient id(String id) {
        this.id = id;
        return this;
    }

    /** PIN of the extension who is configured as a CQ&#039;s SMS recipient. */
    public String extensionNumber;

    public SmsRecipient extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Type of the extension assigned as Sms recipient. Example: User Enum: User, DigitalUser,
     * ApplicationExtension
     */
    public String extensionType;

    public SmsRecipient extensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    /** Name (first + last) of the extension who is configured as a CQ&#039;s SMS recipient. */
    public String name;

    public SmsRecipient name(String name) {
        this.name = name;
        return this;
    }

    /** Indicates user&#039;s ability to become a thread assignee. */
    public Boolean assignable;

    public SmsRecipient assignable(Boolean assignable) {
        this.assignable = assignable;
        return this;
    }

    /** Indicates availability of a new MessageThreadsPaid feature status. */
    public Boolean hasLicense;

    public SmsRecipient hasLicense(Boolean hasLicense) {
        this.hasLicense = hasLicense;
        return this;
    }
}
