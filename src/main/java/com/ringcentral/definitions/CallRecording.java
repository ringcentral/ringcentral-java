package com.ringcentral.definitions;

public class CallRecording {
    /** Internal identifier of a call recording */
    public String id;

    public CallRecording id(String id) {
        this.id = id;
        return this;
    }

    /** Call recording status */
    public Boolean active;

    public CallRecording active(Boolean active) {
        this.active = active;
        return this;
    }

    /** Recording mode Enum: Automatic, OnDemand */
    public String mode;

    public CallRecording mode(String mode) {
        this.mode = mode;
        return this;
    }

    /** Recording view Enum: Party, Session */
    public String view;

    public CallRecording view(String view) {
        this.view = view;
        return this;
    }
}
