package com.ringcentral.definitions;

/** The internal IDs of RC-authenticated users. */
public class ParticipantReducedModel {
    /** Internal object ID Example: 78654321 */
    public String id;

    public ParticipantReducedModel id(String id) {
        this.id = id;
        return this;
    }

    /** First (given) name Example: John */
    public String firstName;

    public ParticipantReducedModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Example: Doe */
    public String lastName;

    public ParticipantReducedModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * The role of the webinar session participant/invitee. See also: [Understanding Webinar
     * Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required Example: Panelist Enum: Panelist, CoHost, Host, Attendee
     */
    public String role;

    public ParticipantReducedModel role(String role) {
        this.role = role;
        return this;
    }

    /**
     * The role of the webinar session participant/invitee. See also: [Understanding Webinar
     * Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required Example: Panelist Enum: Panelist, CoHost, Host, Attendee
     */
    public String originalRole;

    public ParticipantReducedModel originalRole(String originalRole) {
        this.originalRole = originalRole;
        return this;
    }

    /** */
    public RcwDomainUserModel linkedUser;

    public ParticipantReducedModel linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }

    /**
     * A token to access avatar image from CDN. Available only for authenticated panel members and
     * attendees Example: wedyugwied8wud98u90i329silqdjalidj
     */
    public String avatarToken;

    public ParticipantReducedModel avatarToken(String avatarToken) {
        this.avatarToken = avatarToken;
        return this;
    }

    /**
     * The type of the participant specified in invite or determined at join time Required Default:
     * User Enum: User, Room
     */
    public String type;

    public ParticipantReducedModel type(String type) {
        this.type = type;
        return this;
    }
}
