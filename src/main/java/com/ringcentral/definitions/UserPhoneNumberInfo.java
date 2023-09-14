package com.ringcentral.definitions;


public class UserPhoneNumberInfo {
    /**
     * Link to the user phone number resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a phone number
     * Format: int64
     */
    public Long id;
    /**
     *
     */
    public CountryInfoBasicModel country;
    /**
     *
     */
    public ContactCenterProvider contactCenterProvider;
    /**
     *
     */
    public UserPhoneNumberExtensionInfo extension;
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
     * Enum: External, TollFree, Local, BusinessMobileNumberProvider, ExternalNumberProvider
     */
    public String paymentType;
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Specifies if a phone number is primary, i.e. displayed as &#039;main number&#039; and called by default
     */
    public Boolean primary;
    /**
     * Status of a phone number. If the value is &#039;Normal&#039;, the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral
     * Enum: Normal, Pending, PortedIn, Temporary
     */
    public String status;
    /**
     * Phone number type
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;
    /**
     * Extension sub-type, if applicable. For any unsupported sub-types the &#039;Unknown&#039; value will be returned
     * Enum: VideoPro, VideoProPlus, DigitalSignage, Unknown
     */
    public String subType;
    /**
     * Usage type of a phone number. Numbers of &#039;NumberPool&#039; type will not be returned for phone number list requests
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, NumberPool, BusinessMobileNumber, PartnerBusinessMobileNumber, IntegrationNumber
     */
    public String usageType;
    /**
     * List of features of a phone number
     * Enum: CallerId, SmsSender, A2PSmsSender, MmsSender, InternationalSmsSender, Delegated
     */
    public String[] features;

    public UserPhoneNumberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserPhoneNumberInfo id(Long id) {
        this.id = id;
        return this;
    }

    public UserPhoneNumberInfo country(CountryInfoBasicModel country) {
        this.country = country;
        return this;
    }

    public UserPhoneNumberInfo contactCenterProvider(ContactCenterProvider contactCenterProvider) {
        this.contactCenterProvider = contactCenterProvider;
        return this;
    }

    public UserPhoneNumberInfo extension(UserPhoneNumberExtensionInfo extension) {
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

    public UserPhoneNumberInfo primary(Boolean primary) {
        this.primary = primary;
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

    public UserPhoneNumberInfo subType(String subType) {
        this.subType = subType;
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
