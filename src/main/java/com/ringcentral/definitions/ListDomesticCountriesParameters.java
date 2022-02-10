package com.ringcentral.definitions;


/**
 * Query parameters for operation listDomesticCountries
 */
public class ListDomesticCountriesParameters {
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

    public ListDomesticCountriesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListDomesticCountriesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
