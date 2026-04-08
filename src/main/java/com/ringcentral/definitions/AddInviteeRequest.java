package com.ringcentral.definitions;

/** The attribute declaration to indicate webinar session participant/invitee role */
public class AddInviteeRequest {
    /** First (given) name Example: John */
    public String firstName;

    public AddInviteeRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Example: Doe */
    public String lastName;

    public AddInviteeRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /** User&#039;s contact email Format: email Example: john.doe@example.com */
    public String email;

    public AddInviteeRequest email(String email) {
        this.email = email;
        return this;
    }

    /** Job title Example: Product Manager */
    public String jobTitle;

    public AddInviteeRequest jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /** */
    public RcwDomainUserModel linkedUser;

    public AddInviteeRequest linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }

    /**
     * The role of the webinar session participant/invitee. See also: [Understanding Webinar
     * Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required Example: Panelist Enum: Panelist, CoHost, Host, Attendee
     */
    public String role;

    public AddInviteeRequest role(String role) {
        this.role = role;
        return this;
    }

    /** The type of the webinar invitee Default: User Enum: User, Room */
    public String type;

    public AddInviteeRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indicates if invite/cancellation emails have to be sent to this invitee. For &quot;Host&quot;
     * it cannot be set to false. If it is true it can&#039;t be changed back to false. Default:
     * true
     */
    public Boolean sendInvite;

    public AddInviteeRequest sendInvite(Boolean sendInvite) {
        this.sendInvite = sendInvite;
        return this;
    }
}
