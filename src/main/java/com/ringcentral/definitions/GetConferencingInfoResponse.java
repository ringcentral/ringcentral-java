package com.ringcentral.definitions;


public class GetConferencingInfoResponse
{
    /**
     * Canonical URI of a conferencing
     * Format: uri
     */
    public String uri;
    public GetConferencingInfoResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Determines if host user allows conference participants to join
    * before the host
     */
    public Boolean allowJoinBeforeHost;
    public GetConferencingInfoResponse allowJoinBeforeHost(Boolean allowJoinBeforeHost)
    {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    /**
     * Access code for a host user
     */
    public String hostCode;
    public GetConferencingInfoResponse hostCode(String hostCode)
    {
        this.hostCode = hostCode;
        return this;
    }

    /**
     * Internal parameter specifying a conferencing engine
     */
    public String mode;
    public GetConferencingInfoResponse mode(String mode)
    {
        this.mode = mode;
        return this;
    }

    /**
     * Access code for any participant
     */
    public String participantCode;
    public GetConferencingInfoResponse participantCode(String participantCode)
    {
        this.participantCode = participantCode;
        return this;
    }

    /**
     * Primary conference phone number for user&#039;s home country returned
    * in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String phoneNumber;
    public GetConferencingInfoResponse phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Short URL leading to the service web page Tap to Join for audio
    * conference bridge
     * Format: uri
     */
    public String tapToJoinUri;
    public GetConferencingInfoResponse tapToJoinUri(String tapToJoinUri)
    {
        this.tapToJoinUri = tapToJoinUri;
        return this;
    }

    /**
     * List of multiple dial-in phone numbers to connect to audio
    * conference service, relevant for the user&#039;s brand. Each number is given with
    * the country and location information, in order to let the user choose
    * less expensive way to connect to a conference. The first number in
    * the list is a primary conference number, that is default and domestic
     */
    public PhoneNumberInfoConferencing[] phoneNumbers;
    public GetConferencingInfoResponse phoneNumbers(PhoneNumberInfoConferencing[] phoneNumbers)
    {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
}