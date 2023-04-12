package com.ringcentral.definitions;


public class CountryListDictionaryModel {
    /**
     * Link to the list of countries supported
     * Format: uri
     */
    public String uri;
    /**
     * List of countries with the country data
     * Required
     */
    public CountryInfoDictionaryModel[] records;
    /**
     * Required
     */
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public CountryListDictionaryModel uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CountryListDictionaryModel records(CountryInfoDictionaryModel[] records) {
        this.records = records;
        return this;
    }

    public CountryListDictionaryModel navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public CountryListDictionaryModel paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
