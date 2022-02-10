package com.ringcentral.definitions;


/**
 * Party update data
 */
public class PartyUpdateInfo {
    /**
     * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via Hard phone or RingCentral App (not only through the API by calling call control methods) then it cannot be fully muted/unmuted via API only, in this case the action should be duplicated via Hard phone/RC App interfaces
     */
    public Boolean muted;
    /**
     * If &#039;True&#039; then the party is not connected to a session voice conference, &#039;False&#039; means the party is connected to other parties in a session
     */
    public Boolean standAlone;

    public PartyUpdateInfo muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    public PartyUpdateInfo standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }
}
