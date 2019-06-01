package com.ringcentral.definitions;


public class GreetingInfo {
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, InterruptPrompt, HoldMusic, Custom, Company, BlockedCallersSpecific, BlockedCallersAll, BlockedNoCallerId, BlockedPayPhones, StartRecording, StopRecording, AutomaticRecording
     */
    public String type;
    /**
     * Usage type of a greeting, specifying if the greeting is applied to user extension or department extension.
     * Enum: UserExtensionAnsweringRule, ExtensionAnsweringRule, DepartmentExtensionAnsweringRule, CompanyAnsweringRule, CompanyAfterHoursAnsweringRule, VoicemailExtensionAnsweringRule, AnnouncementExtensionAnsweringRule
     */
    public String usageType;
    /**
     *
     */
    public PresetInfo preset;

    public GreetingInfo type(String type) {
        this.type = type;
        return this;
    }

    public GreetingInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public GreetingInfo preset(PresetInfo preset) {
        this.preset = preset;
        return this;
    }

}
