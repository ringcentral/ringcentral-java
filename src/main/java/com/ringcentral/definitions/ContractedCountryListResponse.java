package com.ringcentral.definitions;


public class ContractedCountryListResponse {
    /**
     * List of countries with the country data
     * Required
     */
    public ContractedCountryListResponseRecords[] records;

    public ContractedCountryListResponse records(ContractedCountryListResponseRecords[] records) {
        this.records = records;
        return this;
    }
}
