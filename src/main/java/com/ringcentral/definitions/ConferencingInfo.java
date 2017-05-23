package com.ringcentral.definitions;

public class ConferencingInfo {
    // Canonical URI of a conferencing
    public String uri;
    // Determines if host user allows conference participants to join before the host
    public Boolean allowJoinBeforeHost;
    // Access code for a host user
    public String hostCode;
    // Internal parameter specifying conferencing engine
    public String mode;
    // Access code for any participant
    public String participantCode;
    // Primary conference phone number for user's home country returned in E.164 (11-digits) format
    public String phoneNumber;
    // Short URL leading to the service web page Tap to Join for audio conference bridge
    public String tapToJoinUri;
    // List of multiple dial-in phone numbers to connect to audio conference service, relevant for user's brand. Each number is given with the country and location information, in order to let the user choose the less expensive way to connect to a conference. The first number in the list is the primary conference number, that is default and domestic
    public ConferencingInfo_PhoneNumberInfo[] phoneNumbers;

    public ConferencingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ConferencingInfo allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    public ConferencingInfo hostCode(String hostCode) {
        this.hostCode = hostCode;
        return this;
    }

    public ConferencingInfo mode(String mode) {
        this.mode = mode;
        return this;
    }

    public ConferencingInfo participantCode(String participantCode) {
        this.participantCode = participantCode;
        return this;
    }

    public ConferencingInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ConferencingInfo tapToJoinUri(String tapToJoinUri) {
        this.tapToJoinUri = tapToJoinUri;
        return this;
    }

    public ConferencingInfo phoneNumbers(ConferencingInfo_PhoneNumberInfo[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
}
