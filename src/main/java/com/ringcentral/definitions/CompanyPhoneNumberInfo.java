package com.ringcentral.definitions;


public class CompanyPhoneNumberInfo {
    /**
     * Link to a company phone number resource
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
    public ExtensionInfo extension;
    /**
     * Custom user-defined name of a phone number, if any
     */
    public String label;
    /**
     * Location (City, State). Filled for local US numbers
     */
    public String location;
    /**
     * Payment type. &#039;External&#039; is returned for forwarded numbers
     * which are not terminated in the RingCentral phone system
     * Enum: External, TollFree, Local, BusinessMobileNumberProvider, ExternalNumberProvider, ExternalNumberProviderTollFree
     */
    public String paymentType;
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Status of a phone number. If the value is `Normal`, the phone
     * number is ready to be used. Otherwise, it is an external number not yet
     * ported to RingCentral
     * Enum: Normal, Pending, PortedIn, Temporary, Unknown
     */
    public String status;
    /**
     * Type of a phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    /**
     * Usage type of a phone number. Numbers of &#039;NumberPool&#039; and &#039;NumberStorage&#039; type are not returned in
     * phone number list requests
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, NumberPool, NumberStorage, BusinessMobileNumber, PartnerBusinessMobileNumber, IntegrationNumber
     */
    public String usageType;
    /**
     *
     */
    public TemporaryNumberInfo temporaryNumber;
    /**
     *
     */
    public ContactCenterProvider contactCenterProvider;
    /**
     * Vanity pattern for this number. Returned only when vanity search option is requested. Vanity pattern corresponds to request parameters `nxx` plus `line` or `numberPattern`
     */
    public String vanityPattern;
    /**
     * Specifies if a phone number is primary, i.e. displayed as &#039;main number&#039; and called by default
     */
    public Boolean primary;
    /**
     * Phone number activation status. Determine whether phone number migration is completed on the partner side.
     * Enum: Active, Inactive
     */
    public String activationStatus;

    public CompanyPhoneNumberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CompanyPhoneNumberInfo id(Long id) {
        this.id = id;
        return this;
    }

    public CompanyPhoneNumberInfo extension(ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public CompanyPhoneNumberInfo label(String label) {
        this.label = label;
        return this;
    }

    public CompanyPhoneNumberInfo location(String location) {
        this.location = location;
        return this;
    }

    public CompanyPhoneNumberInfo paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public CompanyPhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CompanyPhoneNumberInfo status(String status) {
        this.status = status;
        return this;
    }

    public CompanyPhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }

    public CompanyPhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public CompanyPhoneNumberInfo temporaryNumber(TemporaryNumberInfo temporaryNumber) {
        this.temporaryNumber = temporaryNumber;
        return this;
    }

    public CompanyPhoneNumberInfo contactCenterProvider(ContactCenterProvider contactCenterProvider) {
        this.contactCenterProvider = contactCenterProvider;
        return this;
    }

    public CompanyPhoneNumberInfo vanityPattern(String vanityPattern) {
        this.vanityPattern = vanityPattern;
        return this;
    }

    public CompanyPhoneNumberInfo primary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    public CompanyPhoneNumberInfo activationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
        return this;
    }
}
