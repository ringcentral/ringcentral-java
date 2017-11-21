package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumberInfo
{
    // Internal identifier of a phone number
    public String id;
    public PhoneNumberInfo id(String id) {
        this.id = id;
        return this;
    }
    // Brief information on a phone number country
    public CountryInfo country;
    public PhoneNumberInfo country(CountryInfo country) {
        this.country = country;
        return this;
    }
    // Information on the extension, to which the phone number is assigned. Returned only for the request of Account phone number list
    public ExtensionInfo extension;
    public PhoneNumberInfo extension(ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
    // Custom user name of a phone number, if any. Supported for numbers assigned to Auto-Receptionist, with usage type 'CompanyNumber'
    public String label;
    public PhoneNumberInfo label(String label) {
        this.label = label;
        return this;
    }
    // Location (City, State). Filled for local US numbers
    public String location;
    public PhoneNumberInfo location(String location) {
        this.location = location;
        return this;
    }
    // Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system
    public String paymentType;
    public PhoneNumberInfo paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    // Phone number
    public String phoneNumber;
    public PhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral
    public String status;
    public PhoneNumberInfo status(String status) {
        this.status = status;
        return this;
    }
    // Phone number type
    public String type;
    public PhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }
    // Usage type of the phone number
    public String usageType;
    public PhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
