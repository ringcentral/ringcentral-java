package com.ringcentral.definitions;

public class MeetingServiceInfo {
    // Canonical URI of a meeting service info resource
    public String uri;
    // URI to retrieve support information for meetings functionality
    public String supportUri;
    // URI to retrieve international dial in numbers
    public String intlDialInNumbersUri;
    // External user data
    public ExternalUserInfo externalUserInfo;
    // Dial-in numbers data
    public DialInNumbers dialInNumbers;

    public MeetingServiceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingServiceInfo supportUri(String supportUri) {
        this.supportUri = supportUri;
        return this;
    }

    public MeetingServiceInfo intlDialInNumbersUri(String intlDialInNumbersUri) {
        this.intlDialInNumbersUri = intlDialInNumbersUri;
        return this;
    }

    public MeetingServiceInfo externalUserInfo(ExternalUserInfo externalUserInfo) {
        this.externalUserInfo = externalUserInfo;
        return this;
    }

    public MeetingServiceInfo dialInNumbers(DialInNumbers dialInNumbers) {
        this.dialInNumbers = dialInNumbers;
        return this;
    }
}
