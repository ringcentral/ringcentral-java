package com.ringcentral.definitions;


public class PhoneNumberSenderConsentRecord
{
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String from;
    public PhoneNumberSenderConsentRecord from(String from)
    {
        this.from = from;
        return this;
    }
}