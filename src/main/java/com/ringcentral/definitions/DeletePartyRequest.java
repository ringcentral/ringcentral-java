package com.ringcentral.definitions;

public class DeletePartyRequest {
    /** Keep conference session alive after deleting the party */
    public Boolean keepConferenceAlive;

    public DeletePartyRequest keepConferenceAlive(Boolean keepConferenceAlive) {
        this.keepConferenceAlive = keepConferenceAlive;
        return this;
    }
}
