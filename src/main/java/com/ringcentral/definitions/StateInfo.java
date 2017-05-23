package com.ringcentral.definitions;

public class StateInfo {
    // Internal identifier of a state
    public String id;
    // Canonical URI of a state
    public String uri;
    // Information on a country the state belongs to
    public StateInfo_CountryInfo country;
    // Short code for a state (2-letter usually)
    public String isoCode;
    // Official name of a state
    public String name;

    public StateInfo id(String id) {
        this.id = id;
        return this;
    }

    public StateInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public StateInfo country(StateInfo_CountryInfo country) {
        this.country = country;
        return this;
    }

    public StateInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public StateInfo name(String name) {
        this.name = name;
        return this;
    }
}
