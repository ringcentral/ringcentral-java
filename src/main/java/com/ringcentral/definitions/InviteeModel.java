package com.ringcentral.definitions;


/**
 * The internal IDs of RC-authenticated users.
 */
public class InviteeModel {
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
    /**
     * Indicates if invite/cancellation emails was sent to this invitee.
     * Required
     * Example: true
     */
    public Boolean sendInvite;
    /**
     * Indicates that this invitee joined the session
     * Required
     * Example: true
     */
    public Boolean joined;

    public InviteeModel id(String id) {
        this.id = id;
        return this;
    }

    public InviteeModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public InviteeModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public InviteeModel role(String role) {
        this.role = role;
        return this;
    }

    public InviteeModel originalRole(String originalRole) {
        this.originalRole = originalRole;
        return this;
    }

    public InviteeModel linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }

    public InviteeModel avatarToken(String avatarToken) {
        this.avatarToken = avatarToken;
        return this;
    }

    public InviteeModel type(String type) {
        this.type = type;
        return this;
    }

    public InviteeModel email(String email) {
        this.email = email;
        return this;
    }

    public InviteeModel qnaBlocked(Boolean qnaBlocked) {
        this.qnaBlocked = qnaBlocked;
        return this;
    }

    public InviteeModel sendInvite(Boolean sendInvite) {
        this.sendInvite = sendInvite;
        return this;
    }

    public InviteeModel joined(Boolean joined) {
        this.joined = joined;
        return this;
    }
}
