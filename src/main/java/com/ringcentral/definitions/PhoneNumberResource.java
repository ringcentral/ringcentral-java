package com.ringcentral.definitions;


public class PhoneNumberResource {
    /**
     * Internal identifier of a phone number
     */
    public String id;
    /**
     *
     */
    public DeviceCountryResource country;
    /**
     *
     */
    public PhoneNumberExtensionInfo extension;
    /**
     * Custom user name of a phone number, if any
     */
    public String label;
    /**
     * Location (City, State). Filled for local US numbers
     */
    public String location;
    /**
     * Payment type. &#039;External&#039; is returned for forwarded numbers which are not terminated in the RingCentral phone system
     * Enum: External, TollFree, Local
     */
    public String paymentType;
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Status of a phone number. If the value is &#039;Normal&#039;, the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral
     */
    public String status;
    /**
     * Enum: CompanyNumber, MainCompanyNumber, AdditionalCompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber
     */
    public String usageType;
    /**
     * Type of a phone number
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;

    public PhoneNumberResource id(String id) {
        this.id = id;
        return this;
    }

    public PhoneNumberResource country(DeviceCountryResource country) {
        this.country = country;
        return this;
    }

    public PhoneNumberResource extension(PhoneNumberExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public PhoneNumberResource label(String label) {
        this.label = label;
        return this;
    }

    public PhoneNumberResource location(String location) {
        this.location = location;
        return this;
    }

    public PhoneNumberResource paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PhoneNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumberResource status(String status) {
        this.status = status;
        return this;
    }

    public PhoneNumberResource usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public PhoneNumberResource type(String type) {
        this.type = type;
        return this;
    }
}
