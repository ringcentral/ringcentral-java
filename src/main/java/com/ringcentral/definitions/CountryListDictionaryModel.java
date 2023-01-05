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
    public ProvisioningNavigationInfo navigation;
    public CountryListDictionaryModel navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public ProvisioningPagingInfo paging;
    public CountryListDictionaryModel paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}