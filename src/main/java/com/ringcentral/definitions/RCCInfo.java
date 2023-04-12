package com.ringcentral.definitions;


public class RCCInfo {
    /**
     * Conferencing phone number
     */
    public String conferencePhoneNumber;
    /**
     *
     */
    public String[] conferencePins;

    public RCCInfo conferencePhoneNumber(String conferencePhoneNumber) {
        this.conferencePhoneNumber = conferencePhoneNumber;
        return this;
    }

    public RCCInfo conferencePins(String[] conferencePins) {
        this.conferencePins = conferencePins;
        return this;
    }
}
