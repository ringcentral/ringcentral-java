package com.ringcentral.definitions;

public class ReservePhoneNumber_Request_ReserveRecord {
    // Phone number in E.164 format without a '+'
    public String phoneNumber;
    // The datetime up to which the number is reserved in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. If it is omitted or explicitly set to 'null', the number will be un-reserved if it was reserved previously by the same session. 'Min' value is 30 seconds; 'Max' value is 30 days (for reservation by brand) and 20 minutes (for reservation by account/session)
    public String reservedTill;
}
