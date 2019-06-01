package com.ringcentral.definitions;


public class MeetingExternalUserInfoResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String userId;
    /**
     *
     */
    public String accountId;
    /**
     *
     */
    public Long userType;
    /**
     *
     */
    public String userToken;
    /**
     *
     */
    public String hostKey;
    /**
     *
     */
    public String personalMeetingId;

    public MeetingExternalUserInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingExternalUserInfoResource userId(String userId) {
        this.userId = userId;
        return this;
    }

    public MeetingExternalUserInfoResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public MeetingExternalUserInfoResource userType(Long userType) {
        this.userType = userType;
        return this;
    }

    public MeetingExternalUserInfoResource userToken(String userToken) {
        this.userToken = userToken;
        return this;
    }

    public MeetingExternalUserInfoResource hostKey(String hostKey) {
        this.hostKey = hostKey;
        return this;
    }

    public MeetingExternalUserInfoResource personalMeetingId(String personalMeetingId) {
        this.personalMeetingId = personalMeetingId;
        return this;
    }

}
