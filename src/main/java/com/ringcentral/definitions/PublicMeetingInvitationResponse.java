package com.ringcentral.definitions;


public class PublicMeetingInvitationResponse {
    /**
     * Meeting invitation
     */
    public String invitation;

    public PublicMeetingInvitationResponse invitation(String invitation) {
        this.invitation = invitation;
        return this;
    }
}
