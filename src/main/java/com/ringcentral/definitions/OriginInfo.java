package com.ringcentral.definitions;


public class OriginInfo {
    /**
     * Session origin type
     * Enum: Call, RingOut, RingMe, Conference, GreetingsRecording, VerificationCall, Zoom, CallOut
     */
    public String type;

    public OriginInfo type(String type) {
        this.type = type;
        return this;
    }

}
