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
}
