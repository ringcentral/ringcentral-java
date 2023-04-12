package com.ringcentral.definitions;


public class EmotionApiResponse {
    /**
     * Enum: Success, Fail
     */
    public String status;
    /**
     *
     */
    public EmotionSegment[] response;

    public EmotionApiResponse status(String status) {
        this.status = status;
        return this;
    }

    public EmotionApiResponse response(EmotionSegment[] response) {
        this.response = response;
        return this;
    }
}
