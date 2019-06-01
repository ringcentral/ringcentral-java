package com.ringcentral.definitions;


public class CallRecording {
    /**
     * Internal identifier of a call recording
     */
    public String id;
    /**
     * Call recording status
     */
    public Boolean active;

    public CallRecording id(String id) {
        this.id = id;
        return this;
    }

    public CallRecording active(Boolean active) {
        this.active = active;
        return this;
    }

}
