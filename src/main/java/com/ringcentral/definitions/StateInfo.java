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
}
