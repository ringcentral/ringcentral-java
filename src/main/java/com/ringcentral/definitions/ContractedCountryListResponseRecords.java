package com.ringcentral.definitions;


public class ContractedCountryListResponseRecords {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Official name of a country
     */
    public String name;

    public ContractedCountryListResponseRecords id(String id) {
        this.id = id;
        return this;
    }

    public ContractedCountryListResponseRecords name(String name) {
        this.name = name;
        return this;
    }
}
