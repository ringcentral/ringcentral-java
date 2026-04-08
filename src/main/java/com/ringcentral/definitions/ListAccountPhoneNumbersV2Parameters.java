package com.ringcentral.definitions;


    /**
* Query parameters for operation listAccountPhoneNumbersV2
*/
public class ListAccountPhoneNumbersV2Parameters
{
    /**
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    public ListAccountPhoneNumbersV2Parameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * The number of items per page. If the provided value in the request
    * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    public ListAccountPhoneNumbersV2Parameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Types of phone numbers to be returned
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String[] type;
    public ListAccountPhoneNumbersV2Parameters type(String[] type)
    {
        this.type = type;
        return this;
    }

    /**
     * Usage type(s) of phone numbers to be returned
     * Enum: MainCompanyNumber, DirectNumber, Inventory, InventoryPartnerBusinessMobileNumber, InventoryFmcBusinessMobileNumber, PartnerBusinessMobileNumber, AdditionalCompanyNumber, CompanyNumber, PhoneLine, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, NumberStorage, BusinessMobileNumber, FmcBusinessMobileNumber, ELIN, InventoryMobileNumber
     */
    public String[] usageType;
    public ListAccountPhoneNumbersV2Parameters usageType(String[] usageType)
    {
        this.usageType = usageType;
        return this;
    }

    /**
     * Status of a phone number. If the value is `Normal`, the phone
    * number is ready to be used. Otherwise, it is an external number not yet
    * ported to RingCentral
     * Enum: Normal, Pending, PortedIn, Temporary, Unknown
     */
    public String status;
    public ListAccountPhoneNumbersV2Parameters status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Indicates if a number is toll or toll-free
     * Example: Toll
     * Enum: Toll, TollFree
     */
    public String tollType;
    public ListAccountPhoneNumbersV2Parameters tollType(String tollType)
    {
        this.tollType = tollType;
        return this;
    }

    /**
     * Extension status
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String extensionStatus;
    public ListAccountPhoneNumbersV2Parameters extensionStatus(String extensionStatus)
    {
        this.extensionStatus = extensionStatus;
        return this;
    }

    /**
     * The parameter reflects whether this number is BYOC or not
     */
    public Boolean byocNumber;
    public ListAccountPhoneNumbersV2Parameters byocNumber(Boolean byocNumber)
    {
        this.byocNumber = byocNumber;
        return this;
    }

    /**
     * The parameter reflects whether this number is mobileNumber or not
     */
    public Boolean mobileNumber;
    public ListAccountPhoneNumbersV2Parameters mobileNumber(Boolean mobileNumber)
    {
        this.mobileNumber = mobileNumber;
        return this;
    }

    /**
     * Phone number in e.164 format to be searched for.
    * Parameter value can include wildcards (e.g. &quot;+165012345**&quot;)
    * or be an exact number &quot;+16501234500&quot; - single number is searched in that case.
    * Make sure you escape the &quot;+&quot; in the URL as &quot;%2B&quot;
     */
    public String phoneNumber;
    public ListAccountPhoneNumbersV2Parameters phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}