package com.ringcentral.definitions;


public class SessionRecordingModel {
    /**
     *
     */
    public RecordingModel recording;

    public SessionRecordingModel recording(RecordingModel recording) {
        this.recording = recording;
        return this;
    }
}
