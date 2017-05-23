package com.ringcentral.definitions;

public class ReservePhoneNumber_Response_ReserveRecord {
    // Phone number in E.164 format without a '+'
    public String phoneNumber;
    // Domestic format of a phone number
    public String formattedNumber;
    // The datetime up to which the number is reserved in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. No value means that number is not reserved anymore
    public String reservedTill;
    // Internal identifier of phone number reservation; encoded data including reservation type (by brand, by account, by session), particular brand/account/session data, and reservation date and time
    public String reservationId;
    // Phone number status
    public String status;
    // The error code in case of reservation/un-reservation failure
    public String error;
}
