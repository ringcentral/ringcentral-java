package com.ringcentral.definitions;


public class OriginInfo {
    /**
     * Session origin type
     * Enum: RingOut, RingMe, Conference, GreetingRecording, VerificartionCall, Call
     */
    public String type;

    public OriginInfo type(String type) {
        this.type = type;
        return this;
    }

}
