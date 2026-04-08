package com.ringcentral.definitions;


public class CountryListDictionaryModel
{
    /**
     * Link to the list of countries supported
     * Format: uri
     */
    public String uri;
    public CountryListDictionaryModel uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of countries with the country data
     * Required
     */
    public CountryInfoDictionaryModel[] records;
    public CountryListDictionaryModel records(CountryInfoDictionaryModel[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public PageNavigationModel navigation;
    public CountryListDictionaryModel navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    public CountryListDictionaryModel paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}