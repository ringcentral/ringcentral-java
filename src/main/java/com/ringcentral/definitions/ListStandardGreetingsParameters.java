package com.ringcentral.definitions;


/**
 * Query parameters for operation listStandardGreetings
 */
public class ListStandardGreetingsParameters {
    /**
     * Type of a greeting, specifying the case when the greeting is played
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, HoldMusic, Company
     */
    public String type;
    /**
     * Usage type of a greeting, specifying if the greeting is applied for user extension or department (call queue) extension
     * Enum: UserExtensionAnsweringRule, ExtensionAnsweringRule, DepartmentExtensionAnsweringRule, CompanyAnsweringRule, CompanyAfterHoursAnsweringRule, VoicemailExtensionAnsweringRule, AnnouncementExtensionAnsweringRule, SharedLinesGroupAnsweringRule
     */
    public String usageType;

    public ListStandardGreetingsParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListStandardGreetingsParameters usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
