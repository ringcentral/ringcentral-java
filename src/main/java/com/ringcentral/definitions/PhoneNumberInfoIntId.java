package com.ringcentral.definitions;


/**
 * Phone number information
 */
public class PhoneNumberInfoIntId {
    /**
     * Internal identifier of a phone number
     * Format: int64
     */
    public Long id;
    /**
     *
     */
    public PhoneNumberCountryInfo country;
    /**
     *
     */
    public DeviceProvisioningExtensionInfo extension;
    /**
     * Custom user name of a phone number, if any
     */
    public String label;
    /**
     * Location (City, State). Filled for local US numbers
     */
    public String location;
    /**
     * Payment type. &#039;External&#039; is returned for forwarded numbers
     * which are not terminated in the RingCentral phone system
     * Enum: External, TollFree, Local
     */
    public String paymentType;
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Status of a phone number. If the value is &#039;Normal&#039;, the phone
     * number is ready to be used. Otherwise it is an external number not yet
     * ported to RingCentral
     */
    public String status;
    /**
     * Phone number type
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;
    /**
     * Usage type of the phone number
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber
     */
    public String usageType;

    public PhoneNumberInfoIntId id(Long id) {
        this.id = id;
        return this;
    }

    public PhoneNumberInfoIntId country(PhoneNumberCountryInfo country) {
        this.country = country;
        return this;
    }

    public PhoneNumberInfoIntId extension(DeviceProvisioningExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public PhoneNumberInfoIntId label(String label) {
        this.label = label;
        return this;
    }

    public PhoneNumberInfoIntId location(String location) {
        this.location = location;
        return this;
    }

    public PhoneNumberInfoIntId paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PhoneNumberInfoIntId phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumberInfoIntId status(String status) {
        this.status = status;
        return this;
    }

    public PhoneNumberInfoIntId type(String type) {
        this.type = type;
        return this;
    }

    public PhoneNumberInfoIntId usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
