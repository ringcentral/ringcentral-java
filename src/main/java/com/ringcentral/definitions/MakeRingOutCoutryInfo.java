package com.ringcentral.definitions;


// Optional. Dialing plan country data. If not specified, then extension home country is applied by default
public class MakeRingOutCoutryInfo {
    /**
     * Dialing plan country identifier
     */
    public String id;

    public MakeRingOutCoutryInfo id(String id) {
        this.id = id;
        return this;
    }
}
