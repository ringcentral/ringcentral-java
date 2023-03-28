package com.ringcentral.definitions;


/**
 * Optional. Dialing plan country data. If not specified, then an extension
 * home country is applied by default
 */
public class MakeRingOutCountryInfo {
    /**
     * Dialing plan country identifier
     */
    public String id;

    public MakeRingOutCountryInfo id(String id) {
        this.id = id;
        return this;
    }
}
