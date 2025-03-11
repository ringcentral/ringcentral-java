package com.ringcentral.definitions;


/**
 * Query parameters for operation listExtensionPhoneNumbers
 */
public class ListExtensionPhoneNumbersParameters {
    /**
     * Status of a phone number. If the value is `Normal`, the phone
     * number is ready to be used. Otherwise, it is an external number not yet
     * ported to RingCentral
     * Enum: Normal, Pending, PortedIn, Temporary, Unknown
     */
    public String status;
    /**
     * Usage type of a phone number
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, MeetingsNumber, NumberPool, NumberStorage, BusinessMobileNumber, PartnerBusinessMobileNumber, IntegrationNumber
     */
    public String[] usageType;
    /**
     * Indicates a page number to retrieve. Only positive number values
     * are allowed. Default value is &#039;1&#039;
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates a page size (number of items). If not specified, the value is &#039;100&#039; by default
     * Format: int32
     * Default: 100
     */
    public Long perPage;

    public ListExtensionPhoneNumbersParameters status(String status) {
        this.status = status;
        return this;
    }

    public ListExtensionPhoneNumbersParameters usageType(String[] usageType) {
        this.usageType = usageType;
        return this;
    }

    public ListExtensionPhoneNumbersParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListExtensionPhoneNumbersParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
