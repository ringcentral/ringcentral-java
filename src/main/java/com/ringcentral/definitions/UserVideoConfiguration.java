package com.ringcentral.definitions;


public class UserVideoConfiguration {
    /**
     * Video provider of the user
     * Enum: RCMeetings, RCVideo, None
     */
    public String provider;

    public UserVideoConfiguration provider(String provider) {
        this.provider = provider;
        return this;
    }

}
