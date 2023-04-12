package com.ringcentral.definitions;


/**
 * The attribute declaration to indicate webinar session participant/invitee role
 */
public class RcwRoleAttributeModel {
    /**
     * The role of the webinar session participant/invitee.
     * See also: [Understanding Webinar Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required
     * Example: Panelist
     * Enum: Panelist, CoHost, Host, Attendee
     */
    public String role;

    public RcwRoleAttributeModel role(String role) {
        this.role = role;
        return this;
    }
}
