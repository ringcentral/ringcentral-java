package com.ringcentral.definitions;


/**
 * Query parameters for operation listStandardGreetings
 */
public class ListStandardGreetingsParameters {
    /**
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
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

    public ListStandardGreetingsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListStandardGreetingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListStandardGreetingsParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListStandardGreetingsParameters usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
