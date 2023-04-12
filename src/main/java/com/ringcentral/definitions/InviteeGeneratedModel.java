package com.ringcentral.definitions;


public class InviteeGeneratedModel {
    /**
     * Personalized join link for the Invitee
     * Format: uri
     * Example: https://v.ringcentral.com/w/join/de7yd8ew7yfsdfjh899843rgj
     */
    public String joinUri;
    /**
     * Phone (PSTN) participant code
     */
    public String phoneParticipantCode;

    public InviteeGeneratedModel joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }

    public InviteeGeneratedModel phoneParticipantCode(String phoneParticipantCode) {
        this.phoneParticipantCode = phoneParticipantCode;
        return this;
    }
}
