package com.ringcentral.definitions;


public class AccountPhoneNumberInfo {
    /**
     * Internal unique identifier of a phone number
     * Required
     * Example: 1162820004
     */
    public String id;
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String phoneNumber;
    /**
     * Type of a phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    /**
     * Indicates if a number is toll or toll-free
     * Required
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;
    /**
     * Usage type of a phone number
     * Required
     * Enum: MainCompanyNumber, DirectNumber, Inventory, InventoryPartnerBusinessMobileNumber, PartnerBusinessMobileNumber, AdditionalCompanyNumber, CompanyNumber, PhoneLine, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, NumberStorage, BusinessMobileNumber, ELIN
     */
    public String usageType;
    /**
     *
     */
    public Boolean byocNumber;
    /**
     *
     */
    public ContactCenterProvider contactCenterProvider;
    /**
     * Status of a phone number. If the value is `Normal`, the phone
     * number is ready to be used. Otherwise, it is an external number not yet
     * ported to RingCentral
     * Required
     * Enum: Normal, Pending, PortedIn, Temporary, Unknown
     */
    public String status;
    /**
     * Reference to the extension this number is assigned to. Omitted for company numbers
     */
    public AccountPhoneNumberInfoExtension extension;

    public AccountPhoneNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public AccountPhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AccountPhoneNumberInfo type(String type) {
        this.type = type;
        return this;
    }

    public AccountPhoneNumberInfo tollType(String tollType) {
        this.tollType = tollType;
        return this;
    }

    public AccountPhoneNumberInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public AccountPhoneNumberInfo byocNumber(Boolean byocNumber) {
        this.byocNumber = byocNumber;
        return this;
    }

    public AccountPhoneNumberInfo contactCenterProvider(ContactCenterProvider contactCenterProvider) {
        this.contactCenterProvider = contactCenterProvider;
        return this;
    }

    public AccountPhoneNumberInfo status(String status) {
        this.status = status;
        return this;
    }

    public AccountPhoneNumberInfo extension(AccountPhoneNumberInfoExtension extension) {
        this.extension = extension;
        return this;
    }
}
