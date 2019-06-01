package com.ringcentral.definitions;


public class RecordingInfo {
    /**
     * Internal identifier of a Recording resource
     */
    public String id;
    /**
     * True if the recording is active. False if the recording is paused.
     */
    public Boolean active;

    public RecordingInfo id(String id) {
        this.id = id;
        return this;
    }

    public RecordingInfo active(Boolean active) {
        this.active = active;
        return this;
    }

}
