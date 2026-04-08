package com.ringcentral.definitions;

/** The attribute declaration to indicate webinar session participant/invitee role */
public class InviteeResource {
    /** Internal object ID Example: 78654321 */
    public String id;

    public InviteeResource id(String id) {
        this.id = id;
        return this;
    }

    /** Object creation time Required Format: date-time */
    public String creationTime;

    public InviteeResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Object last modification time Required Format: date-time */
    public String lastModifiedTime;

    public InviteeResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** First (given) name Example: John */
    public String firstName;

    public InviteeResource firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Example: Doe */
    public String lastName;

    public InviteeResource lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /** User&#039;s contact email Format: email Example: john.doe@example.com */
    public String email;

    public InviteeResource email(String email) {
        this.email = email;
        return this;
    }

    /** Job title Example: Product Manager */
    public String jobTitle;

    public InviteeResource jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /** */
    public RcwDomainUserModel linkedUser;

    public InviteeResource linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }

    /**
     * The role of the webinar session participant/invitee. See also: [Understanding Webinar
     * Roles](https://support.ringcentral.com/webinar/getting-started/understanding-ringcentral-webinar-roles.html)
     * Required Example: Panelist Enum: Panelist, CoHost, Host, Attendee
     */
    public String role;

    public InviteeResource role(String role) {
        this.role = role;
        return this;
    }

    /** The type of the webinar invitee Default: User Enum: User, Room */
    public String type;

    public InviteeResource type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indicates if invite/cancellation emails have to be sent to this invitee. For &quot;Host&quot;
     * it cannot be set to false. If it is true it can&#039;t be changed back to false. Default:
     * true
     */
    public Boolean sendInvite;

    public InviteeResource sendInvite(Boolean sendInvite) {
        this.sendInvite = sendInvite;
        return this;
    }

    /**
     * Personalized join link for the Invitee Format: uri Example:
     * https://v.ringcentral.com/w/join/de7yd8ew7yfsdfjh899843rgj
     */
    public String joinUri;

    public InviteeResource joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }

    /** Phone (PSTN) participant code */
    public String phoneParticipantCode;

    public InviteeResource phoneParticipantCode(String phoneParticipantCode) {
        this.phoneParticipantCode = phoneParticipantCode;
        return this;
    }
}
