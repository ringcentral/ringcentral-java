package com.ringcentral.definitions;


public class GetStateInfoResponse {
    /**
     * Internal identifier of a state
     */
    public String id;
    /**
     * Canonical URI of a state
     */
    public String uri;
    /**
     * Information on a country the state belongs to
     */
    public GetCountryInfoState country;
    /**
     * Short code for a state (2-letter usually)
     */
    public String isoCode;
    /**
     * Official name of a state
     */
    public String name;

    public GetStateInfoResponse id(String id) {
        this.id = id;
        return this;
    }

    public GetStateInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetStateInfoResponse country(GetCountryInfoState country) {
        this.country = country;
        return this;
    }

    public GetStateInfoResponse isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public GetStateInfoResponse name(String name) {
        this.name = name;
        return this;
    }

}
