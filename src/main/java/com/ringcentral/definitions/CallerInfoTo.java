package com.ringcentral.definitions;


public class CallerInfoTo {
    /**
     *
     */
    public String phoneNumber;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String location;
    /**
     * Enum: Sent, SendingFailed, Queued
     */
    public String messageStatus;
    /**
     * Enum: Undefined, NoFaxSendPermission, NoInternationalPermission, NoFaxMachine, OutgoingCallError, RenderingFailed, TooManyPages, ReturnToDBQueue, NoCallTime, WrongNumber, ProhibitedNumber, InternalError, FaxSendingProhibited, ThePhoneIsBlacklisted, UserNotFound, ConvertError, DBGeneralError, SkypeBillingFailed, AccountSuspended, ProhibitedDestination, InternationalDisabled
     */
    public String faxErrorCode;

    public CallerInfoTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CallerInfoTo name(String name) {
        this.name = name;
        return this;
    }

    public CallerInfoTo location(String location) {
        this.location = location;
        return this;
    }

    public CallerInfoTo messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public CallerInfoTo faxErrorCode(String faxErrorCode) {
        this.faxErrorCode = faxErrorCode;
        return this;
    }

}
