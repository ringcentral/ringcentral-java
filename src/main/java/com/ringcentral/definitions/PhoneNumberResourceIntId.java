package com.ringcentral.definitions;


public class PhoneNumberResourceIntId {
    /**
     * Internal identifier of a phone number
     */
    public Long id;
    /**
     * Brief information on a phone number country
     */
    public CountryResource country;
    /**
     * Information on an extension to which the phone number is assigned
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
     * Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system = ['External', 'TollFree', 'Local'],
     * Enum: External, TollFree, Local
     */
    public String paymentType;
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral ,
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
    /**
     * Internal identifier of a phone number reservation; encoded data including reservation type (by brand, by account, by session), particular brand/account/session data, and reservation date and time
     */
    public String reservationId;

    public PhoneNumberResourceIntId id(Long id) {
        this.id = id;
        return this;
    }

    public PhoneNumberResourceIntId country(CountryResource country) {
        this.country = country;
        return this;
    }

    public PhoneNumberResourceIntId extension(PhoneNumberExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public PhoneNumberResourceIntId label(String label) {
        this.label = label;
        return this;
    }

    public PhoneNumberResourceIntId location(String location) {
        this.location = location;
        return this;
    }

    public PhoneNumberResourceIntId paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PhoneNumberResourceIntId phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumberResourceIntId status(String status) {
        this.status = status;
        return this;
    }

    public PhoneNumberResourceIntId usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public PhoneNumberResourceIntId type(String type) {
        this.type = type;
        return this;
    }

    public PhoneNumberResourceIntId reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

}
