package com.ringcentral.definitions;


public class UserPhoneNumberInfo {
    /**
     * Internal identifier of a phone number
     */
    public String id;
    /**
     * Brief information on a phone number country
     */
    public CountryInfo country;
    /**
     * Information on the extension, to which the phone number is assigned. Returned only for the request of Account phone number list
     */
    public ExtensionInfo extension;
    /**
     * Custom user name of a phone number, if any
     */
    public String label;
    /**
     * Location (City, State). Filled for local US numbers
     */
    public String location;
    /**
     * Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system
     * Enum: External, TollFree, Local
     */
    public String paymentType;
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral
     */
    public String status;
    /**
     * Phone number type
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;
    /**
     * Usage type of a phone number
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber
     */
    public String usageType;
    /**
     * List of features of a phone number
     */
    public String[] features;

    public UserPhoneNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public UserPhoneNumberInfo country(CountryInfo country) {
        this.country = country;
        return this;
    }

    public UserPhoneNumberInfo extension(ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public UserPhoneNumberInfo label(String label) {
        this.label = label;
        return this;
    }

    public UserPhoneNumberInfo location(String location) {
        this.location = location;
        return this;
    }

    public UserPhoneNumberInfo paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public UserPhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserPhoneNumberInfo status(String status) {
        this.status = status;
        return this;
    }

    public UserPhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }

    public UserPhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public UserPhoneNumberInfo features(String[] features) {
        this.features = features;
        return this;
    }

}
