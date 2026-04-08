package com.ringcentral.definitions;


public class UserPhoneNumberInfo
{
    /**
     * Link to the user phone number resource
     * Format: uri
     */
    public String uri;
    public UserPhoneNumberInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a phone number
     * Format: int64
     */
    public Long id;
    public UserPhoneNumberInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public CountryInfoBasicModel country;
    public UserPhoneNumberInfo country(CountryInfoBasicModel country)
    {
        this.country = country;
        return this;
    }

    /**
     */
    public ContactCenterProvider contactCenterProvider;
    public UserPhoneNumberInfo contactCenterProvider(ContactCenterProvider contactCenterProvider)
    {
        this.contactCenterProvider = contactCenterProvider;
        return this;
    }

    /**
     */
    public UserPhoneNumberExtensionInfo extension;
    public UserPhoneNumberInfo extension(UserPhoneNumberExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Custom user-defined name of a phone number, if any
     */
    public String label;
    public UserPhoneNumberInfo label(String label)
    {
        this.label = label;
        return this;
    }

    /**
     * Location (City, State). Filled for local US numbers
     */
    public String location;
    public UserPhoneNumberInfo location(String location)
    {
        this.location = location;
        return this;
    }

    /**
     * Payment type. &#039;External&#039; is returned for forwarded numbers
    * which are not terminated in the RingCentral phone system
     * Enum: External, TollFree, Local, BusinessMobileNumberProvider, ExternalNumberProvider, ExternalNumberProviderTollFree, Mobile
     */
    public String paymentType;
    public UserPhoneNumberInfo paymentType(String paymentType)
    {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Phone number
     */
    public String phoneNumber;
    public UserPhoneNumberInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Indicates if a phone number is primary, i.e. displayed as &#039;main number&#039; and called by default
     */
    public Boolean primary;
    public UserPhoneNumberInfo primary(Boolean primary)
    {
        this.primary = primary;
        return this;
    }

    /**
     * Status of a phone number. If the value is `Normal`, the phone
    * number is ready to be used. Otherwise, it is an external number not yet
    * ported to RingCentral
     * Enum: Normal, Pending, PortedIn, Temporary, Unknown
     */
    public String status;
    public UserPhoneNumberInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Type of a phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    public UserPhoneNumberInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Extension subtype, if applicable.
    * For unrecognized subtypes the `Unknown` value is returned
     * Enum: VideoPro, VideoProPlus, DigitalSignageOnlyRooms, Unknown, Emergency
     */
    public String subType;
    public UserPhoneNumberInfo subType(String subType)
    {
        this.subType = subType;
        return this;
    }

    /**
     * Usage type of a phone number. Numbers of &#039;NumberPool&#039; and &#039;NumberStorage&#039; type are not returned in
    * phone number list requests
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, FmcBusinessMobileNumber, InventoryFmcBusinessMobileNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, NumberPool, BusinessMobileNumber, ELIN, PartnerBusinessMobileNumber, NumberPoolPartnerBusinessMobileNumber, NumberStorage, IntegrationNumber, InventoryMobileNumber
     */
    public String usageType;
    public UserPhoneNumberInfo usageType(String usageType)
    {
        this.usageType = usageType;
        return this;
    }

    /**
     * List of features of a phone number
     * Enum: CallerId, SmsSender, A2PSmsSender, MmsSender, InternationalSmsSender, Delegated
     */
    public String[] features;
    public UserPhoneNumberInfo features(String[] features)
    {
        this.features = features;
        return this;
    }

    /**
     * Caller ID Name
     */
    public String callerIdName;
    public UserPhoneNumberInfo callerIdName(String callerIdName)
    {
        this.callerIdName = callerIdName;
        return this;
    }
}