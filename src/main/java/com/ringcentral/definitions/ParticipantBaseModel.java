package com.ringcentral.definitions;

/** The internal IDs of RC-authenticated users. */
public class ParticipantBaseModel {
    /** Internal object ID Example: 78654321 */
    public String id;

    public ParticipantBaseModel id(String id) {
        this.id = id;
        return this;
    }

    /** First (given) name Example: John */
    public String firstName;

    public ParticipantBaseModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Example: Doe */
    public String lastName;

    public ParticipantBaseModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * The role of the webinar session participant/invitee. See also: [Understanding Webinar
     * Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required Example: Panelist Enum: Panelist, CoHost, Host, Attendee
     */
    public String role;

    public ParticipantBaseModel role(String role) {
        this.role = role;
        return this;
    }

    /**
     * The role of the webinar session participant/invitee. See also: [Understanding Webinar
     * Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required Example: Panelist Enum: Panelist, CoHost, Host, Attendee
     */
    public String originalRole;

    public ParticipantBaseModel originalRole(String originalRole) {
        this.originalRole = originalRole;
        return this;
    }

    /** */
    public RcwDomainUserModel linkedUser;

    public ParticipantBaseModel linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }

    /**
     * A token to access avatar image from CDN. Available only for authenticated panel members and
     * attendees Example: wedyugwied8wud98u90i329silqdjalidj
     */
    public String avatarToken;

    public ParticipantBaseModel avatarToken(String avatarToken) {
        this.avatarToken = avatarToken;
        return this;
    }

    /**
     * The type of the participant specified in invite or determined at join time Required Default:
     * User Enum: User, Room
     */
    public String type;

    public ParticipantBaseModel type(String type) {
        this.type = type;
        return this;
    }

    /** User&#039;s contact email Format: email Example: john.doe@example.com */
    public String email;

    public ParticipantBaseModel email(String email) {
        this.email = email;
        return this;
    }

    /** Boolean to indicate if the participant was blocked from Q&amp;A Example: true */
    public Boolean qnaBlocked;

    public ParticipantBaseModel qnaBlocked(Boolean qnaBlocked) {
        this.qnaBlocked = qnaBlocked;
        return this;
    }
}
