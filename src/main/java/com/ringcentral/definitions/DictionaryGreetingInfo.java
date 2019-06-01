package com.ringcentral.definitions;


public class DictionaryGreetingInfo {
    /**
     * Internal identifier of a greeting
     */
    public String id;
    /**
     * Link to a greeting
     */
    public String uri;
    /**
     * Name of a greeting
     */
    public String name;
    /**
     * Usage type of a greeting, specifying if the greeting is applied for user extension or department extension.
     * Enum: UserExtensionAnsweringRule, ExtensionAnsweringRule, DepartmentExtensionAnsweringRule, CompanyAnsweringRule, CompanyAfterHoursAnsweringRule, VoicemailExtensionAnsweringRule, AnnouncementExtensionAnsweringRule
     */
    public String usageType;
    /**
     * Text of a greeting, if any
     */
    public String text;
    /**
     * Link to a greeting content (audio file), if any
     */
    public String contentUri;
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, InterruptPrompt, HoldMusic, Company
     */
    public String type;
    /**
     * Category of a greeting, specifying data form. The category value 'None' specifies that greetings of a certain type ('Introductory', 'ConnectingAudio', etc.) are switched off for an extension = ['Music', 'Message', 'RingTones', 'None']
     * Enum: Music, Message, RingTones, None
     */
    public String category;
    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;
    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;

    public DictionaryGreetingInfo id(String id) {
        this.id = id;
        return this;
    }

    public DictionaryGreetingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DictionaryGreetingInfo name(String name) {
        this.name = name;
        return this;
    }

    public DictionaryGreetingInfo usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public DictionaryGreetingInfo text(String text) {
        this.text = text;
        return this;
    }

    public DictionaryGreetingInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public DictionaryGreetingInfo type(String type) {
        this.type = type;
        return this;
    }

    public DictionaryGreetingInfo category(String category) {
        this.category = category;
        return this;
    }

    public DictionaryGreetingInfo navigation(CallHandlingNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public DictionaryGreetingInfo paging(CallHandlingPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
