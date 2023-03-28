package com.ringcentral.definitions;


public class BridgeJoinPstnPreferences {
    /**
     * Specifies whether to play &#039;Announce yourself&#039; prompt
     * Default: true
     */
    public Boolean promptAnnouncement;
    /**
     * Specifies whether to play &#039;There are X participants&#039; prompt
     * Default: true
     */
    public Boolean promptParticipants;

    public BridgeJoinPstnPreferences promptAnnouncement(Boolean promptAnnouncement) {
        this.promptAnnouncement = promptAnnouncement;
        return this;
    }

    public BridgeJoinPstnPreferences promptParticipants(Boolean promptParticipants) {
        this.promptParticipants = promptParticipants;
        return this;
    }
}
