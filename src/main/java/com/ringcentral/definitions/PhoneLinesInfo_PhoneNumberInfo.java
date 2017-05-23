package com.ringcentral.definitions;

public class PhoneLinesInfo_PhoneNumberInfo {
    // Internal identifier of a phone number
    public String id;
    // Brief information on a phone number country
    public CountryInfo country;
    // Location (City, State). Filled for local US numbers
    public String location;
    // Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system
    public String paymentType;
    // Phone number
    public String phoneNumber;
    // Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral
    public String status;
    // Phone number type
    public String type;
    // Usage type of the phone number
    public String usageType;

    public PhoneLinesInfo_PhoneNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public PhoneLinesInfo_PhoneNumberInfo country(CountryInfo country) {
        this.country = country;
        return this;
    }

    public PhoneLinesInfo_PhoneNumberInfo location(String location) {
        this.location = location;
        return this;
    }

    public PhoneLinesInfo_PhoneNumberInfo paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PhoneLinesInfo_PhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneLinesInfo_PhoneNumberInfo status(String status) {
        this.status = status;
        return this;
    }

    public PhoneLinesInfo_PhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }

    public PhoneLinesInfo_PhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
