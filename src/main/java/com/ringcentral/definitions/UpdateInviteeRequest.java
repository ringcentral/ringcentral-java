package com.ringcentral.definitions;


/**
 * The attribute declaration to indicate webinar session participant/invitee role
 */
public class UpdateInviteeRequest {
    /**
     * First (given) name
     * Example: John
     */
    public String firstName;
    /**
     * Last (family) name
     * Example: Doe
     */
    public String lastName;
    /**
     * User&#039;s contact email
     * Format: email
     * Example: john.doe@example.com
     */
    public String email;
    /**
     * Job title
     * Example: Product Manager
     */
    public String jobTitle;
    /**
     * The role of the webinar session participant/invitee.
     * See also: [Understanding Webinar Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required
     * Example: Panelist
     * Enum: Panelist, CoHost, Host, Attendee
     */
    public String role;
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

    public UpdateInviteeRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UpdateInviteeRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UpdateInviteeRequest email(String email) {
        this.email = email;
        return this;
    }

    public UpdateInviteeRequest jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public UpdateInviteeRequest role(String role) {
        this.role = role;
        return this;
    }

    public UpdateInviteeRequest type(String type) {
        this.type = type;
        return this;
    }

    public UpdateInviteeRequest sendInvite(Boolean sendInvite) {
        this.sendInvite = sendInvite;
        return this;
    }
}
