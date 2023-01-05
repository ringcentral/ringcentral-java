package com.ringcentral.definitions;


public class CallerInfoTo
{
    /**
     */
    public String phoneNumber;
    public CallerInfoTo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     */
    public String name;
    public CallerInfoTo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String location;
    public CallerInfoTo location(String location)
    {
        this.location = location;
        return this;
    }

    /**
     * Enum: Sent, SendingFailed, Queued
     */
    public String messageStatus;
    public CallerInfoTo messageStatus(String messageStatus)
    {
        this.messageStatus = messageStatus;
        return this;
    }

    /**
     * Enum: AllLinesInUse, Undefined, NoFaxSendPermission, NoInternationalPermission, NoFaxMachine, NoAnswer, LineBusy, CallerHungUp, NotEnoughCredits, SentPartially, InternationalCallingDisabled, DestinationCountryDisabled, UnknownCountryCode, NotAccepted, InvalidNumber, CallDeclined, TooManyCallsPerLine, CallFailed, RenderingFailed, TooManyPages, ReturnToDBQueue, NoCallTime, WrongNumber, ProhibitedNumber, InternalError, FaxSendingProhibited, ThePhoneIsBlacklisted, UserNotFound, ConvertError, DBGeneralError, SkypeBillingFailed, AccountSuspended, ProhibitedDestination, InternationalDisabled
     */
    public String faxErrorCode;
    public CallerInfoTo faxErrorCode(String faxErrorCode)
    {
        this.faxErrorCode = faxErrorCode;
        return this;
    }
}