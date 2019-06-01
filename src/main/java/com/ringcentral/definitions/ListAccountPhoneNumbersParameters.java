package com.ringcentral.definitions;


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
     */
    public String[] usageType;

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

}
