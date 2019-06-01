package com.ringcentral.definitions;


public class ListContactsParameters {
    /**
     * If specified, only contacts whose First name or Last name start with the mentioned substring are returned. Case-insensitive
     */
    public String startsWith;
    /**
     * Sorts results by the specified property
     */
    public String[] sortBy;
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
     *
     */
    public String[] phoneNumber;

    public ListContactsParameters startsWith(String startsWith) {
        this.startsWith = startsWith;
        return this;
    }

    public ListContactsParameters sortBy(String[] sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public ListContactsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListContactsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListContactsParameters phoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
