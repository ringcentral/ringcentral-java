package com.ringcentral.definitions;


/**
 * Role assigned to participant when invite was sent or during join time (if an invite was not sent)
 */
public class OriginalRoleModel {
    /**
     * The role of the webinar session participant/invitee.
     * See also: [Understanding Webinar Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required
     * Example: Panelist
     * Enum: Panelist, CoHost, Host, Attendee
     */
    public String originalRole;

    public OriginalRoleModel originalRole(String originalRole) {
        this.originalRole = originalRole;
        return this;
    }
}
