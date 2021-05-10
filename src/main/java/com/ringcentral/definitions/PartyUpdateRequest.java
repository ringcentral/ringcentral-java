package com.ringcentral.definitions;


public class PartyUpdateRequest {
    /**
     *
     */
    public PartyUpdateInfo party;

    public PartyUpdateRequest party(PartyUpdateInfo party) {
        this.party = party;
        return this;
    }
}
