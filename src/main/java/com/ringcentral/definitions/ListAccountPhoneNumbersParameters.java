package com.ringcentral.definitions;

/** Query parameters for operation listAccountPhoneNumbers */
public class ListAccountPhoneNumbersParameters {
    /**
     * Indicates a page number to retrieve. Only positive number values are accepted Format: int32
     * Default: 1
     */
    public Long page;

    public ListAccountPhoneNumbersParameters page(Long page) {
        this.page = page;
        return this;
    }

    /** Indicates a page size (number of items) Format: int32 Default: 100 */
    public Long perPage;

    public ListAccountPhoneNumbersParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /** Extension status Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned */
    public String extensionStatus;

    public ListAccountPhoneNumbersParameters extensionStatus(String extensionStatus) {
        this.extensionStatus = extensionStatus;
        return this;
    }

    /**
     * Usage type of a phone number Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber,
     * DirectNumber, CompanyFaxNumber, FmcBusinessMobileNumber, InventoryFmcBusinessMobileNumber,
     * ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber,
     * MeetingsNumber, NumberPool, BusinessMobileNumber, ELIN, PartnerBusinessMobileNumber,
     * NumberPoolPartnerBusinessMobileNumber, NumberStorage, IntegrationNumber,
     * InventoryMobileNumber
     */
    public String[] usageType;

    public ListAccountPhoneNumbersParameters usageType(String[] usageType) {
        this.usageType = usageType;
        return this;
    }

    /**
     * Payment type of a phone number. Multiple values are supported Enum: External, TollFree,
     * Local, BusinessMobileNumberProvider, ExternalNumberProvider, ExternalNumberProviderTollFree,
     * Mobile
     */
    public String[] paymentType;

    public ListAccountPhoneNumbersParameters paymentType(String[] paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Status of a phone number. Multiple values are supported Enum: Normal, Pending, PortedIn,
     * Temporary, Unknown
     */
    public String[] status;

    public ListAccountPhoneNumbersParameters status(String[] status) {
        this.status = status;
        return this;
    }
}
