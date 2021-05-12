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
     * Usage type of a greeting, specifying if the greeting is applied for user extension or department (call queue) extension.
     * Enum: UserExtensionAnsweringRule, ExtensionAnsweringRule, DepartmentExtensionAnsweringRule, BlockedCalls, CallRecording, CompanyAnsweringRule, CompanyAfterHoursAnsweringRule, LimitedExtensionAnsweringRule, VoicemailExtensionAnsweringRule, AnnouncementExtensionAnsweringRule, SharedLinesGroupAnsweringRule
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
     * Enum: Introductory, Announcement, AutomaticRecording, BlockedCallersAll, BlockedCallersSpecific, BlockedNoCallerId, BlockedPayPhones, ConnectingMessage, ConnectingAudio, StartRecording, StopRecording, Voicemail, Unavailable, InterruptPrompt, HoldMusic, Company
     */
    public String type;
    /**
     * Category of a greeting, specifying data form. The category value &#039;None&#039; specifies that greetings of a certain type (&#039;Introductory&#039;, &#039;ConnectingAudio&#039;, etc.) are switched off for an extension = [&#039;Music&#039;, &#039;Message&#039;, &#039;RingTones&#039;, &#039;None&#039;]
     * Enum: Music, Message, RingTones, None
     */
    public String category;
    /**
     *
     */
    public CallHandlingNavigationInfo navigation;
    /**
     *
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
