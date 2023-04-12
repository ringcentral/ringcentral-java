package com.ringcentral.definitions;


public class SpeakerIdentifyApiResponse {
    /**
     * Enum: Success, Fail
     */
    public String status;
    /**
     *
     */
    public SpeakerIdentifyApiResponseResponse response;

    public SpeakerIdentifyApiResponse status(String status) {
        this.status = status;
        return this;
    }

    public SpeakerIdentifyApiResponse response(SpeakerIdentifyApiResponseResponse response) {
        this.response = response;
        return this;
    }
}
