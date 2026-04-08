package com.ringcentral.definitions;

/** The internal IDs of RC-authenticated users. */
public class ParticipantExtendedModel {
    /** Internal object ID Example: 78654321 */
    public String id;

    public ParticipantExtendedModel id(String id) {
        this.id = id;
        return this;
    }

    /** First (given) name Example: John */
    public String firstName;

    public ParticipantExtendedModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Example: Doe */
    public String lastName;

    public ParticipantExtendedModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * The role of the webinar session participant/invitee. See also: [Understanding Webinar
     * Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required Example: Panelist Enum: Panelist, CoHost, Host, Attendee
     */
    public String role;

    public ParticipantExtendedModel role(String role) {
        this.role = role;
        return this;
    }

    /**
     * The role of the webinar session participant/invitee. See also: [Understanding Webinar
     * Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required Example: Panelist Enum: Panelist, CoHost, Host, Attendee
     */
    public String originalRole;

    public ParticipantExtendedModel originalRole(String originalRole) {
        this.originalRole = originalRole;
        return this;
    }

    /** */
    public RcwDomainUserModel linkedUser;

    public ParticipantExtendedModel linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }

    /**
     * A token to access avatar image from CDN. Available only for authenticated panel members and
     * attendees Example: wedyugwied8wud98u90i329silqdjalidj
     */
    public String avatarToken;

    public ParticipantExtendedModel avatarToken(String avatarToken) {
        this.avatarToken = avatarToken;
        return this;
    }

    /**
     * The type of the participant specified in invite or determined at join time Required Default:
     * User Enum: User, Room
     */
    public String type;

    public ParticipantExtendedModel type(String type) {
        this.type = type;
        return this;
    }

    /** User&#039;s contact email Format: email Example: john.doe@example.com */
    public String email;

    public ParticipantExtendedModel email(String email) {
        this.email = email;
        return this;
    }

    /** Boolean to indicate if the participant was blocked from Q&amp;A Example: true */
    public Boolean qnaBlocked;

    public ParticipantExtendedModel qnaBlocked(Boolean qnaBlocked) {
        this.qnaBlocked = qnaBlocked;
        return this;
    }

    /** The time (earliest) when this participant joined the session Format: date-time */
    public String joinTime;

    public ParticipantExtendedModel joinTime(String joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    /** The time (latest) when this participant left the session Format: date-time */
    public String leaveTime;

    public ParticipantExtendedModel leaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
        return this;
    }

    /** Indicates if this participant was ejected from the webinar */
    public Boolean wasEjected;

    public ParticipantExtendedModel wasEjected(Boolean wasEjected) {
        this.wasEjected = wasEjected;
        return this;
    }

    /** For invited participants - Invitee ID (matches Configuration API Invitee IDs) */
    public String inviteeId;

    public ParticipantExtendedModel inviteeId(String inviteeId) {
        this.inviteeId = inviteeId;
        return this;
    }

    /** Registrant ID Example: 12345678 */
    public String registrantId;

    public ParticipantExtendedModel registrantId(String registrantId) {
        this.registrantId = registrantId;
        return this;
    }

    /**
     * The hash string which is unique for each unique user Example:
     * qzR4wNbddziRil7i033ELlb3KXrJDsw8mOyj970J+so=
     */
    public String uniqueUserHash;

    public ParticipantExtendedModel uniqueUserHash(String uniqueUserHash) {
        this.uniqueUserHash = uniqueUserHash;
        return this;
    }
}
