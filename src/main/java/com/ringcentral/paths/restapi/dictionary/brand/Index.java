package com.ringcentral.paths.restapi.dictionary.brand;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;
    public String brandId;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String brandId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.brandId = brandId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && brandId != null) {
            return parent.path() + "/brand/" + brandId;
        }
        return parent.path() + "/brand";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.restapi.dictionary.brand.contractedcountry.Index contractedCountry() {
        return this.contractedCountry(null);
    }

    public com.ringcentral.paths.restapi.dictionary.brand.contractedcountry.Index contractedCountry(String contractedCountryId) {
        return new com.ringcentral.paths.restapi.dictionary.brand.contractedcountry.Index(this, contractedCountryId);
    }

}
