package com.ringcentral.definitions;


// Query parameters for operation listAccountPhoneNumbers
public class ListAccountPhoneNumbersParameters {
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    /**
     * Usage type of a phone number
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, BusinessMobileNumber
     */
    public String[] usageType;
    /**
     * Status of a phone number. Multiple values are supported
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
