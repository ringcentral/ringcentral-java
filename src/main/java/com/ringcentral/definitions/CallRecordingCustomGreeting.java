package com.ringcentral.definitions;


public class CallRecordingCustomGreeting {
    /**
     * Enum: StartRecording, StopRecording, AutomaticRecording
     */
    public String type;
    /**
     * Custom greeting data
     */
    public CallRecordingCustomGreetingData custom;
    /**
     * Custom greeting language
     */
    public CallRecordingCustomGreetingLanguage language;

    public CallRecordingCustomGreeting type(String type) {
        this.type = type;
        return this;
    }

    public CallRecordingCustomGreeting custom(CallRecordingCustomGreetingData custom) {
        this.custom = custom;
        return this;
    }

    public CallRecordingCustomGreeting language(CallRecordingCustomGreetingLanguage language) {
        this.language = language;
        return this;
    }

}
