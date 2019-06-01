package com.ringcentral.definitions;


public class ListExtensionPhoneNumbersParameters {
    /**
     * Usage type of a phone number
     */
    public String[] usageType;
    /**
     * Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
     */
    public Long page;
    /**
     * Indicates the page size (number of items). If not specified, the value is '100' by default
     */
    public Long perPage;

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
