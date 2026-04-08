package com.ringcentral.definitions;


public class AccountPhoneNumberInfo
{
    /**
     * Phone number activation status. Determine whether phone number migration is completed on the partner side.
     * Enum: Active, Inactive
     */
    public String activationStatus;
    public AccountPhoneNumberInfo activationStatus(String activationStatus)
    {
        this.activationStatus = activationStatus;
        return this;
    }

    /**
     * Internal unique identifier of a phone number
     * Required
     * Example: 1162820004
     */
    public String id;
    public AccountPhoneNumberInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String phoneNumber;
    public AccountPhoneNumberInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Type of a phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    public AccountPhoneNumberInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Indicates if a number is toll or toll-free
     * Required
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;
    public AccountPhoneNumberInfo tollType(String tollType)
    {
        this.tollType = tollType;
        return this;
    }

    /**
     * Usage type of a phone number
     * Required
     * Enum: MainCompanyNumber, DirectNumber, Inventory, InventoryPartnerBusinessMobileNumber, InventoryFmcBusinessMobileNumber, PartnerBusinessMobileNumber, AdditionalCompanyNumber, CompanyNumber, PhoneLine, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, NumberStorage, BusinessMobileNumber, FmcBusinessMobileNumber, ELIN, InventoryMobileNumber
     */
    public String usageType;
    public AccountPhoneNumberInfo usageType(String usageType)
    {
        this.usageType = usageType;
        return this;
    }

    /**
     */
    public Boolean byocNumber;
    public AccountPhoneNumberInfo byocNumber(Boolean byocNumber)
    {
        this.byocNumber = byocNumber;
        return this;
    }

    /**
     */
    public Boolean mobileNumber;
    public AccountPhoneNumberInfo mobileNumber(Boolean mobileNumber)
    {
        this.mobileNumber = mobileNumber;
        return this;
    }

    /**
     * Indicates whether the phone number belongs to a Hot Desk device if applicable.
     */
    public Boolean hotDeskNumber;
    public AccountPhoneNumberInfo hotDeskNumber(Boolean hotDeskNumber)
    {
        this.hotDeskNumber = hotDeskNumber;
        return this;
    }

    /**
     */
    public ContactCenterProvider contactCenterProvider;
    public AccountPhoneNumberInfo contactCenterProvider(ContactCenterProvider contactCenterProvider)
    {
        this.contactCenterProvider = contactCenterProvider;
        return this;
    }

    /**
     * Status of a phone number. If the value is `Normal`, the phone
    * number is ready to be used. Otherwise, it is an external number not yet
    * ported to RingCentral
     * Required
     * Enum: Normal, Pending, PortedIn, Temporary, Unknown
     */
    public String status;
    public AccountPhoneNumberInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Caller ID Name
     */
    public String callerIdName;
    public AccountPhoneNumberInfo callerIdName(String callerIdName)
    {
        this.callerIdName = callerIdName;
        return this;
    }

    /**
     * Reference to the extension this number is assigned to. Omitted for company numbers
     */
    public AccountPhoneNumberInfoExtension extension;
    public AccountPhoneNumberInfo extension(AccountPhoneNumberInfoExtension extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Internal identifier of a phone provider
     */
    public String providerId;
    public AccountPhoneNumberInfo providerId(String providerId)
    {
        this.providerId = providerId;
        return this;
    }
}