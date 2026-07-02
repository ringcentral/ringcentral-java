package com.ringcentral.definitions;

public class CallRecordingUpdate {
    /** Recording status Required */
    public Boolean active;

    public CallRecordingUpdate active(Boolean active) {
        this.active = active;
        return this;
    }
}
