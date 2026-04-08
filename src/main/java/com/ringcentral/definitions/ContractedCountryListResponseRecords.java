package com.ringcentral.definitions;


public class ContractedCountryListResponseRecords
{
    /**
     * Internal identifier of a country
     */
    public String id;
    public ContractedCountryListResponseRecords id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Official name of a country
     */
    public String name;
    public ContractedCountryListResponseRecords name(String name)
    {
        this.name = name;
        return this;
    }
}