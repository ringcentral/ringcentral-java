package com.ringcentral.definitions;

public class StateInfo_CountryInfo {
    // Internal identifier of a state
    public String id;
    // Canonical URI of a state
    public String uri;

    public StateInfo_CountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public StateInfo_CountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
