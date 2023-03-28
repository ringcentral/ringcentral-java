package com.ringcentral.definitions;


public class GreetingInfo {
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Enum: Introductory, Announcement, AutomaticRecording, BlockedCallersAll, BlockedCallersSpecific, BlockedNoCallerId, BlockedPayPhones, ConnectingMessage, ConnectingAudio, StartRecording, StopRecording, Voicemail, Unavailable, InterruptPrompt, HoldMusic, Company
     */
    public String type;
    /**
     *
     */
    public PresetInfo preset;
    /**
     *
     */
    public CustomGreetingInfoRequest custom;

    public GreetingInfo type(String type) {
        this.type = type;
        return this;
    }

    public GreetingInfo preset(PresetInfo preset) {
        this.preset = preset;
        return this;
    }

    public GreetingInfo custom(CustomGreetingInfoRequest custom) {
        this.custom = custom;
        return this;
    }
}
