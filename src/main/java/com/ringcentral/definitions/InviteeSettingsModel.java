package com.ringcentral.definitions;


public class InviteeSettingsModel {
    /**
     * The type of the webinar invitee
     * Default: User
     * Enum: User, Room
     */
    public String type;
    /**
     * Indicates if invite/cancellation emails have to be sent to this invitee.
     * For &quot;Host&quot; it cannot be set to false.
     * If it is true it can&#039;t be changed back to false.
     * Default: true
     */
    public Boolean sendInvite;

    public InviteeSettingsModel type(String type) {
        this.type = type;
        return this;
    }

    public InviteeSettingsModel sendInvite(Boolean sendInvite) {
        this.sendInvite = sendInvite;
        return this;
    }
}
