package com.ringcentral.definitions;


/**
 * Query parameters for operation listCallRecordingCustomGreetings
 */
public class ListCallRecordingCustomGreetingsParameters {
    /**
     * Type of custom greetings to filter results
     * Enum: StartRecording, StopRecording, AutomaticRecording
     */
    public String type;

    public ListCallRecordingCustomGreetingsParameters type(String type) {
        this.type = type;
        return this;
    }
}
