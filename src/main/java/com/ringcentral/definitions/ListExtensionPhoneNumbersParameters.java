package com.ringcentral.definitions;


    /**
* Query parameters for operation listExtensionPhoneNumbers
*/
public class ListExtensionPhoneNumbersParameters
{
    /**
     * Status of a phone number. Multiple values are supported
     * Enum: Normal, Pending, PortedIn, Temporary
     */
    public String status;
    public ListExtensionPhoneNumbersParameters status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Usage type of a phone number
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, BusinessMobileNumber, IntegrationNumber
     */
    public String[] usageType;
    public ListExtensionPhoneNumbersParameters usageType(String[] usageType)
    {
        this.usageType = usageType;
        return this;
    }

    /**
     * Indicates a page number to retrieve. Only positive number values
    * are allowed. Default value is &#039;1&#039;
     * Format: int32
     */
    public Long page;
    public ListExtensionPhoneNumbersParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates a page size (number of items). If not specified, the value is &#039;100&#039; by default
     * Format: int32
     */
    public Long perPage;
    public ListExtensionPhoneNumbersParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}