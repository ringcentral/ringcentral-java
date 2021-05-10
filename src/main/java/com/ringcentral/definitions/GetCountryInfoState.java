package com.ringcentral.definitions;


// Information on a country the state belongs to
public class GetCountryInfoState {
    /**
     * Internal identifier of a state
     */
    public String id;
    /**
     * Canonical URI of a state
     */
    public String uri;

    public GetCountryInfoState id(String id) {
        this.id = id;
        return this;
    }

    public GetCountryInfoState uri(String uri) {
        this.uri = uri;
        return this;
    }
}
