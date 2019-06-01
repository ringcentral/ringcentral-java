package com.ringcentral.definitions;


public class GetConferencingInfoResponse {
    /**
     * Canonical URI of a conferencing
     */
    public String uri;
    /**
     * Determines if host user allows conference participants to join before the host
     */
    public Boolean allowJoinBeforeHost;
    /**
     * Access code for a host user
     */
    public String hostCode;
    /**
     * Internal parameter specifying conferencing engine
     */
    public String mode;
    /**
     * Access code for any participant
     */
    public String participantCode;
    /**
     * Primary conference phone number for user's home country returned in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String phoneNumber;
    /**
     * Short URL leading to the service web page Tap to Join for audio conference bridge
     */
    public String tapToJoinUri;
    /**
     * List of multiple dial-in phone numbers to connect to audio conference service, relevant for user's brand. Each number is given with the country and location information, in order to let the user choose the less expensive way to connect to a conference. The first number in the list is the primary conference number, that is default and domestic
     */
    public PhoneNumberInfoConferencing[] phoneNumbers;

    public GetConferencingInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetConferencingInfoResponse allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    public GetConferencingInfoResponse hostCode(String hostCode) {
        this.hostCode = hostCode;
        return this;
    }

    public GetConferencingInfoResponse mode(String mode) {
        this.mode = mode;
        return this;
    }

    public GetConferencingInfoResponse participantCode(String participantCode) {
        this.participantCode = participantCode;
        return this;
    }

    public GetConferencingInfoResponse phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public GetConferencingInfoResponse tapToJoinUri(String tapToJoinUri) {
        this.tapToJoinUri = tapToJoinUri;
        return this;
    }

    public GetConferencingInfoResponse phoneNumbers(PhoneNumberInfoConferencing[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

}
