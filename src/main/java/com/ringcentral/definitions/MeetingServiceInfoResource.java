package com.ringcentral.definitions;


public class MeetingServiceInfoResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String supportUri;
    /**
     *
     */
    public String intlDialInNumbersUri;
    /**
     *
     */
    public MeetingExternalUserInfoResource externalUserInfo;
    /**
     *
     */
    public DialInNumberResource[] dialInNumbers;

    public MeetingServiceInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingServiceInfoResource supportUri(String supportUri) {
        this.supportUri = supportUri;
        return this;
    }

    public MeetingServiceInfoResource intlDialInNumbersUri(String intlDialInNumbersUri) {
        this.intlDialInNumbersUri = intlDialInNumbersUri;
        return this;
    }

    public MeetingServiceInfoResource externalUserInfo(MeetingExternalUserInfoResource externalUserInfo) {
        this.externalUserInfo = externalUserInfo;
        return this;
    }

    public MeetingServiceInfoResource dialInNumbers(DialInNumberResource[] dialInNumbers) {
        this.dialInNumbers = dialInNumbers;
        return this;
    }

}
