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
     * Usage type of phone number
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, BusinessMobileNumber, PartnerBusinessMobileNumber, IntegrationNumber
     */
    public String[] usageType;
    /**
     * Status of a phone number
     * Enum: Normal, Pending, PortedIn, Temporary
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

    public ListAccountPhoneNumbersParameters usageType(String[] usageType) {
        this.usageType = usageType;
        return this;
    }

    public ListAccountPhoneNumbersParameters status(String status) {
        this.status = status;
        return this;
    }
}
