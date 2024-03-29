package com.ringcentral.definitions;


public class UpdateConferencingInfoRequest {
    /**
     * Multiple dial-in phone numbers to connect to audio conference
     * service, relevant for user&#039;s brand. Each number is given with the country
     * and location information, in order to let the user choose the less expensive
     * way to connect to a conference. The first number in the list is the primary
     * conference number, that is default and domestic
     */
    public ConferencePhoneNumberInfo[] phoneNumbers;
    /**
     * Determines if host user allows conference participants to join before the host
     */
    public Boolean allowJoinBeforeHost;

    public UpdateConferencingInfoRequest phoneNumbers(ConferencePhoneNumberInfo[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public UpdateConferencingInfoRequest allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }
}
