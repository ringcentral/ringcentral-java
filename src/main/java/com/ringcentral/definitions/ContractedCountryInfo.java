package com.ringcentral.definitions;


// Information on the contracted country of account
public class ContractedCountryInfo {
    /**
     * Identifier of a contracted country
     */
    public String id;
    /**
     * Canonical URI of a contracted country
     */
    public String uri;

    public ContractedCountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public ContractedCountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
