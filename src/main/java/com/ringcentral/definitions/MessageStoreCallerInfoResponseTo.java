package com.ringcentral.definitions;


public class MessageStoreCallerInfoResponseTo {
    /**
     * Extension short number (usually 3 or 4 digits). This property
     * is filled when parties communicate by means of short internal numbers,
     * for example when calling to other extension or sending/receiving Company
     * Pager messages
     */
    public String extensionNumber;
    /**
     *
     */
    public String extensionId;
    /**
     * Contains party location (city, state) if one can be determined
     * from a phone number. This property is filled only when `phoneNumber` is not
     * empty and a server can calculate location information from it (for example,
     * this information is unavailable for US toll-free numbers)
     */
    public String location;
    /**
     * The `true` value specifies that message is sent exactly to this recipient.
     * Returned in the `to` field for group MMS. Useful if one extension has several
     * phone numbers&#039;
     */
    public Boolean target;
    /**
     * Message status. Different message types may have different
     * allowed status values. For outbound faxes the aggregated message status
     * is returned. If, for multi-recipient outbound message, a status for
     * at least one recipient is `Queued`, then the `Queued` value is returned.
     * If a status for at least one recipient is `SendingFailed`,
     * then the &#039;SendingFailed&#039; value is returned. In other cases,
     * the `Sent` status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    /**
     * Enum: AllLinesInUse, Undefined, NoFaxSendPermission, NoInternationalPermission, NoFaxMachine, NoAnswer, LineBusy, CallerHungUp, NotEnoughCredits, SentPartially, InternationalCallingDisabled, DestinationCountryDisabled, UnknownCountryCode, NotAccepted, InvalidNumber, CallDeclined, TooManyCallsPerLine, CallFailed, RenderingFailed, TooManyPages, ReturnToDBQueue, NoCallTime, WrongNumber, ProhibitedNumber, InternalError, FaxSendingProhibited, ThePhoneIsBlacklisted, UserNotFound, ConvertError, DBGeneralError, SkypeBillingFailed, AccountSuspended, ProhibitedDestination, InternationalDisabled
     */
    public String faxErrorCode;
    /**
     * Symbolic name associated with a party. If the phone does not
     * belong to the known extension, only the location is returned, the name
     * is not determined then
     */
    public String name;
    /**
     * Phone number of a party. Usually it is a plain number including
     * country and area code like 18661234567. But sometimes it could be returned
     * from database with some formatting applied, for example (866)123-4567.
     * This property is filled in all cases where parties communicate by means
     * of global phone numbers, for example when calling to direct numbers or
     * sending/receiving SMS
     */
    public String phoneNumber;
    /**
     * Internal identifier of a message recipient
     */
    public String recipientId;

    public MessageStoreCallerInfoResponseTo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public MessageStoreCallerInfoResponseTo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public MessageStoreCallerInfoResponseTo location(String location) {
        this.location = location;
        return this;
    }

    public MessageStoreCallerInfoResponseTo target(Boolean target) {
        this.target = target;
        return this;
    }

    public MessageStoreCallerInfoResponseTo messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public MessageStoreCallerInfoResponseTo faxErrorCode(String faxErrorCode) {
        this.faxErrorCode = faxErrorCode;
        return this;
    }

    public MessageStoreCallerInfoResponseTo name(String name) {
        this.name = name;
        return this;
    }

    public MessageStoreCallerInfoResponseTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public MessageStoreCallerInfoResponseTo recipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }
}
