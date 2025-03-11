package com.ringcentral.paths.restapi.dictionary.brand.contractedcountry;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.brand.Index parent;
    public String contractedCountryId;

    public Index(com.ringcentral.paths.restapi.dictionary.brand.Index parent, String contractedCountryId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.contractedCountryId = contractedCountryId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && contractedCountryId != null) {
            return parent.path() + "/contracted-country/" + contractedCountryId;
        }
        return parent.path() + "/contracted-country";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of contracted countries for the given brand.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/brand/{brandId}/contracted-country
     * Rate Limit Group: Light
     */
    public ContractedCountryListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ContractedCountryListResponse.class);
    }

    /**
     * Returns the list of domestic countries for account contracted country and brand.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/brand/{brandId}/contracted-country/{contractedCountryId}
     * Rate Limit Group: Light
     */
    public CountryListDictionaryModel get(ListDomesticCountriesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (contractedCountryId == null) {
            throw new IllegalArgumentException("Parameter contractedCountryId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CountryListDictionaryModel.class);
    }

    public CountryListDictionaryModel get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
