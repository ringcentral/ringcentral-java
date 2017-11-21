package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReservePhoneNumberResource
{
    // Phone number in E.164
    public String phoneNumber;
    public ReservePhoneNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Domestic format of a phone number
    public String formattedNumber;
    public ReservePhoneNumberResource formattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
        return this;
    }
    //  Datetime up to which the number is reserved in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. No value means that number is not reserved anymore
    public String reservedTill;
    public ReservePhoneNumberResource reservedTill(String reservedTill) {
        this.reservedTill = reservedTill;
        return this;
    }
    // nternal identifier of phone number reservation; encoded data including reservation type (by brand, by account, by session), particular brand/account/session data, and reservation date and time
    public String reservationId;
    public ReservePhoneNumberResource reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }
    // Phone number status = ['Enabled', 'Pending', 'Disabled'],
    public String status;
    public ReservePhoneNumberResource status(String status) {
        this.status = status;
        return this;
    }
    // The error code in case of reservation/un-reservation failure = ['NumberIsAlreadyProvisioned', 'NumberReserved', 'NumberNotAvailable']
    public String error;
    public ReservePhoneNumberResource error(String error) {
        this.error = error;
        return this;
    }
}
