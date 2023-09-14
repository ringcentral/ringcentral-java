package com.ringcentral.definitions;


/**
 * Query parameters for operation listAccountPhoneNumbersV2
 */
public class ListAccountPhoneNumbersV2Parameters {
    /**
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    /**
     * Types of phone numbers to be returned
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String[] type;
    /**
     * Usage type(s) of phone numbers to be returned
     * Enum: MainCompanyNumber, DirectNumber, Inventory, InventoryPartnerBusinessMobileNumber, PartnerBusinessMobileNumber, AdditionalCompanyNumber, CompanyNumber, PhoneLine, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, BusinessMobileNumber, ELIN
     */
    public String[] usageType;
    /**
     * Status(es) of phone numbers to be returned
     * Enum: Normal, Pending, PortedIn, Temporary, Unknown
     */
    public String[] status;
    /**
     * Indicates if a number is toll or toll-free
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;
    /**
     * Extension status
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String extensionStatus;
    /**
     * Phone number in e.164 format to be searched for.
     * Parameter value can include wildcards (e.g. &#039;&#039;+165012345**&#039;&#039;)
     * or be an exact number &#039;&#039;+16501234500&#039;&#039; - single number is searched in that case.
     * Make sure you escape the &#039;&#039;+&#039;&#039; in the URL as &#039;&#039;%2B&#039;&#039;&#039;
     */
    public String phoneNumber;

    public ListAccountPhoneNumbersV2Parameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListAccountPhoneNumbersV2Parameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListAccountPhoneNumbersV2Parameters type(String[] type) {
        this.type = type;
        return this;
    }

    public ListAccountPhoneNumbersV2Parameters usageType(String[] usageType) {
        this.usageType = usageType;
        return this;
    }

    public ListAccountPhoneNumbersV2Parameters status(String[] status) {
        this.status = status;
        return this;
    }

    public ListAccountPhoneNumbersV2Parameters tollType(String tollType) {
        this.tollType = tollType;
        return this;
    }

    public ListAccountPhoneNumbersV2Parameters extensionStatus(String extensionStatus) {
        this.extensionStatus = extensionStatus;
        return this;
    }

    public ListAccountPhoneNumbersV2Parameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
