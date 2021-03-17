package com.ringcentral.definitions;


public class DictionaryGreetingInfo
{
    /**
         * Internal identifier of a greeting
         */
        public String id;
  public DictionaryGreetingInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to a greeting
         */
        public String uri;
  public DictionaryGreetingInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Name of a greeting
         */
        public String name;
  public DictionaryGreetingInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Usage type of a greeting, specifying if the greeting is applied for user extension or department (call queue) extension.
         * Enum: UserExtensionAnsweringRule, ExtensionAnsweringRule, DepartmentExtensionAnsweringRule, BlockedCalls, CallRecording, CompanyAnsweringRule, CompanyAfterHoursAnsweringRule, LimitedExtensionAnsweringRule, VoicemailExtensionAnsweringRule, AnnouncementExtensionAnsweringRule, SharedLinesGroupAnsweringRule
         */
        public String usageType;
  public DictionaryGreetingInfo usageType(String usageType)
  {
    this.usageType = usageType;
    return this;
  }
  

        /**
         * Text of a greeting, if any
         */
        public String text;
  public DictionaryGreetingInfo text(String text)
  {
    this.text = text;
    return this;
  }
  

        /**
         * Link to a greeting content (audio file), if any
         */
        public String contentUri;
  public DictionaryGreetingInfo contentUri(String contentUri)
  {
    this.contentUri = contentUri;
    return this;
  }
  

        /**
         * Type of a greeting, specifying the case when the greeting is played.
         * Enum: Introductory, Announcement, AutomaticRecording, BlockedCallersAll, BlockedCallersSpecific, BlockedNoCallerId, BlockedPayPhones, ConnectingMessage, ConnectingAudio, StartRecording, StopRecording, Voicemail, Unavailable, InterruptPrompt, HoldMusic, Company
         */
        public String type;
  public DictionaryGreetingInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Category of a greeting, specifying data form. The category value 'None' specifies that greetings of a certain type ('Introductory', 'ConnectingAudio', etc.) are switched off for an extension = ['Music', 'Message', 'RingTones', 'None']
         * Enum: Music, Message, RingTones, None
         */
        public String category;
  public DictionaryGreetingInfo category(String category)
  {
    this.category = category;
    return this;
  }
  

        /**
         */
        public CallHandlingNavigationInfo navigation;
  public DictionaryGreetingInfo navigation(CallHandlingNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public CallHandlingPagingInfo paging;
  public DictionaryGreetingInfo paging(CallHandlingPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
