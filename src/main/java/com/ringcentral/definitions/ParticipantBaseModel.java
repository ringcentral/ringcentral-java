package com.ringcentral.definitions;


/**
 * The internal IDs of RC-authenticated users.
 */
public class ParticipantBaseModel {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;
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
     * The role of the webinar session participant/invitee.
     * See also: [Understanding Webinar Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required
     * Example: Panelist
     * Enum: Panelist, CoHost, Host, Attendee
     */
    public String role;
    /**
     * The role of the webinar session participant/invitee.
     * See also: [Understanding Webinar Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required
     * Example: Panelist
     * Enum: Panelist, CoHost, Host, Attendee
     */
    public String originalRole;
    /**
     *
     */
    public RcwDomainUserModel linkedUser;
    /**
     * A token to access avatar image from CDN. Available only for authenticated panel members and attendees
     * Example: wedyugwied8wud98u90i329silqdjalidj
     */
    public String avatarToken;
    /**
     * The type of the participant specified in invite or determined at join time
     * Required
     * Default: User
     * Enum: User, Room
     */
    public String type;
    /**
     * User&#039;s contact email
     * Format: email
     * Example: john.doe@example.com
     */
    public String email;
    /**
     * Boolean to indicate if the participant was blocked from Q&amp;A
     * Example: true
     */
    public Boolean qnaBlocked;

    public ParticipantBaseModel id(String id) {
        this.id = id;
        return this;
    }

    public ParticipantBaseModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ParticipantBaseModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ParticipantBaseModel role(String role) {
        this.role = role;
        return this;
    }

    public ParticipantBaseModel originalRole(String originalRole) {
        this.originalRole = originalRole;
        return this;
    }

    public ParticipantBaseModel linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }

    public ParticipantBaseModel avatarToken(String avatarToken) {
        this.avatarToken = avatarToken;
        return this;
    }

    public ParticipantBaseModel type(String type) {
        this.type = type;
        return this;
    }

    public ParticipantBaseModel email(String email) {
        this.email = email;
        return this;
    }

    public ParticipantBaseModel qnaBlocked(Boolean qnaBlocked) {
        this.qnaBlocked = qnaBlocked;
        return this;
    }
}
