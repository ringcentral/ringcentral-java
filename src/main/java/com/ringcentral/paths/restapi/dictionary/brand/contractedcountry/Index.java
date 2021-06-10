package com.ringcentral.paths.restapi.dictionary.brand.contractedcountry;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetCountryListResponse;
import com.ringcentral.definitions.ListDomesticCountriesParameters;

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
     * Returns the list of domestic countries by contracted country and brand of the account.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/brand/{brandId}/contracted-country/{contractedCountryId}
     * Rate Limit Group: Light
     */
    public GetCountryListResponse get(ListDomesticCountriesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (contractedCountryId == null) {
            throw new IllegalArgumentException("Parameter contractedCountryId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetCountryListResponse.class);
    }

    public GetCountryListResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
