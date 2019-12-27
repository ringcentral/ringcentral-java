package com.ringcentral.definitions;


public class DevicePhoneNumberInfo {
    /**
     * Internal identifier of a phone number
     */
    public Long id;
    /**
     * Brief information on a phone number country
     */
    public DevicePhoneNumberCountryInfo country;
    /**
     * Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system = ['External', 'TollFree', 'Local'],
     * Enum: External, TollFree, Local
     */
    public String paymentType;
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Enum: CompanyNumber, MainCompanyNumber, AdditionalCompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber
     */
    public String usageType;
    /**
     * Type of a phone number
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;

    public DevicePhoneNumberInfo id(Long id) {
        this.id = id;
        return this;
    }

    public DevicePhoneNumberInfo country(DevicePhoneNumberCountryInfo country) {
        this.country = country;
        return this;
    }

    public DevicePhoneNumberInfo paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public DevicePhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public DevicePhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public DevicePhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }

}
