package com.ringcentral.definitions;


public class CallRecordingCustomGreeting
{
    /**
     * Enum: StartRecording, StopRecording, AutomaticRecording
     */
    public String type;
    public CallRecordingCustomGreeting type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CallRecordingCustomGreetingData custom;
    public CallRecordingCustomGreeting custom(CallRecordingCustomGreetingData custom)
    {
        this.custom = custom;
        return this;
    }

    /**
     */
    public CallRecordingCustomGreetingLanguage language;
    public CallRecordingCustomGreeting language(CallRecordingCustomGreetingLanguage language)
    {
        this.language = language;
        return this;
    }
}