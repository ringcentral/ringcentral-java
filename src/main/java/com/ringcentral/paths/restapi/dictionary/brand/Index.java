package com.ringcentral.paths.restapi.dictionary.brand;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/brand";
    }


    public com.ringcentral.paths.restapi.dictionary.brand.contractedcountry.Index contractedCountry() {
        return this.contractedCountry(null);
    }

    public com.ringcentral.paths.restapi.dictionary.brand.contractedcountry.Index contractedCountry(String contractedCountryId) {
        return new com.ringcentral.paths.restapi.dictionary.brand.contractedcountry.Index(this, contractedCountryId);
    }

}
