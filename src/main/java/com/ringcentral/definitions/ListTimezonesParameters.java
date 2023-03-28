package com.ringcentral.definitions;


/**
 * Query parameters for operation listTimezones
 */
public class ListTimezonesParameters {
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

    public ListTimezonesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListTimezonesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
