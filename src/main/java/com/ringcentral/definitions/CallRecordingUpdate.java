package com.ringcentral.definitions;


public class CallRecordingUpdate {
    /**
     * Recording status
     */
    public Boolean active;

    public CallRecordingUpdate active(Boolean active) {
        this.active = active;
        return this;
    }

}
