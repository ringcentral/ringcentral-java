package com.ringcentral.definitions;


public class GreetingInfo
{
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, InterruptPrompt, HoldMusic, Custom, Company, BlockedCallersSpecific, BlockedCallersAll, BlockedNoCallerId, BlockedPayPhones, StartRecording, StopRecording, AutomaticRecording
     */
    public String type;
    public GreetingInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public PresetInfo preset;
    public GreetingInfo preset(PresetInfo preset)
    {
        this.preset = preset;
        return this;
    }

    /**
     */
    public CustomGreetingInfoRequest custom;
    public GreetingInfo custom(CustomGreetingInfoRequest custom)
    {
        this.custom = custom;
        return this;
    }
}