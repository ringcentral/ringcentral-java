package com.ringcentral.definitions;

public class PhoneNumberInfo {
    // Internal identifier of a phone number
    public String id;
    // Brief information on a phone number country
    public CountryInfo country;
    // Information on the extension, to which the phone number is assigned. Returned only for the request of Account phone number list
    public PhoneNumberInfo_ExtensionInfo extension;
    // Indicates if this phone number is enabled to appear as CallerId and/or to send outbound SMS from it. Returned only for the request of Extension phone number list
    public String[] features;
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

    public PhoneNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public PhoneNumberInfo country(CountryInfo country) {
        this.country = country;
        return this;
    }

    public PhoneNumberInfo extension(PhoneNumberInfo_ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public PhoneNumberInfo features(String[] features) {
        this.features = features;
        return this;
    }

    public PhoneNumberInfo location(String location) {
        this.location = location;
        return this;
    }

    public PhoneNumberInfo paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumberInfo status(String status) {
        this.status = status;
        return this;
    }

    public PhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }

    public PhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
