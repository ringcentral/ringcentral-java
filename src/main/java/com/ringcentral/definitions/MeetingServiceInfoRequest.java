package com.ringcentral.definitions;


public class MeetingServiceInfoRequest {
    /**
     *
     */
    public MeetingExternalUserInfoResource externalUserInfo;

    public MeetingServiceInfoRequest externalUserInfo(MeetingExternalUserInfoResource externalUserInfo) {
        this.externalUserInfo = externalUserInfo;
        return this;
    }

}
