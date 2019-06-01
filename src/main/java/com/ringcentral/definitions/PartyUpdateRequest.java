package com.ringcentral.definitions;


public class PartyUpdateRequest {
    /**
     * Party update data
     */
    public PartyUpdateInfo party;

    public PartyUpdateRequest party(PartyUpdateInfo party) {
        this.party = party;
        return this;
    }

}
