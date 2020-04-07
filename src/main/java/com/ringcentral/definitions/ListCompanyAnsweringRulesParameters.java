package com.ringcentral.definitions;


public class ListCompanyAnsweringRulesParameters {
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items per page)
     * Default: 100
     */
    public Long perPage;

    public ListCompanyAnsweringRulesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListCompanyAnsweringRulesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

}
