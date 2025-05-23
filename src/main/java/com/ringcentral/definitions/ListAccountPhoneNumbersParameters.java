package com.ringcentral.definitions;


/**
 * Query parameters for operation listAccountPhoneNumbers
 */
public class ListAccountPhoneNumbersParameters {
    /**
     * Indicates a page number to retrieve. Only positive number values
     * are accepted
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    /**
     * Extension status
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String extensionStatus;
    /**
     * Usage type of a phone number
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, NumberPool, NumberStorage, BusinessMobileNumber, PartnerBusinessMobileNumber, IntegrationNumber
     */
    public String[] usageType;
    /**
     * Payment type of a phone number. Multiple values are supported
     * Enum: External, TollFree, Local, BusinessMobileNumberProvider, ExternalNumberProvider, ExternalNumberProviderTollFree
     */
    public String[] paymentType;
    /**
     * Status of a phone number. If the value is `Normal`, the phone
     * number is ready to be used. Otherwise, it is an external number not yet
     * ported to RingCentral
     * Enum: Normal, Pending, PortedIn, Temporary, Unknown
     */
    public String status;

    public ListAccountPhoneNumbersParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListAccountPhoneNumbersParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListAccountPhoneNumbersParameters extensionStatus(String extensionStatus) {
        this.extensionStatus = extensionStatus;
        return this;
    }

    public ListAccountPhoneNumbersParameters usageType(String[] usageType) {
        this.usageType = usageType;
        return this;
    }

    public ListAccountPhoneNumbersParameters paymentType(String[] paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public ListAccountPhoneNumbersParameters status(String status) {
        this.status = status;
        return this;
    }
}
