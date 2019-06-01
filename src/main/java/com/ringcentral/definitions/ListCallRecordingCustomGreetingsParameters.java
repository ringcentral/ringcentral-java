package com.ringcentral.definitions;


public class ListCallRecordingCustomGreetingsParameters {
    /**
     * Enum: StartRecording, StopRecording, AutomaticRecording
     */
    public String type;

    public ListCallRecordingCustomGreetingsParameters type(String type) {
        this.type = type;
        return this;
    }

}
