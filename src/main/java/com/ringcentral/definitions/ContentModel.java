package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class ContentModel {
    /**
     * Array of attachments to be added to the content
     * Required
     */
    public SocMsgContentAttachment[] attachments;
    /**
     * Identity identifier of the content author. Not mandatory on creation,
     * by default it uses the token&#039;s user first identity on channel
     * Required
     */
    public String authorIdentityId;
    /**
     * Auto submitted content:
     * - won&#039;t reopen tasks or interventions
     * - can be used to send automatic messages like asking an user to follow on twitter, sending a survey, etc,
     * - doesn&#039;t get included in statistics
     * Required
     */
    public Boolean autoSubmitted;
    /**
     * Content body. On creation this field is mandatory except for WhatsApp content
     * using templates. The following are the channels supported and their **max length**
     * restrictions (in brackets):
     * <p>
     * - *Apple Messages For Business* (10000)
     * - *Email* (262144)
     * - *RingCX Digital Messaging* (1024)
     * - *Facebook* (8000)
     * - *Google My Business* (4000)
     * - *Instagram* (950)
     * - *Instagram Messaging* (1000)
     * - *LinkedIn* (3000)
     * - *Messenger* (2000)
     * - *Twitter* (280)
     * - *Viber* (7000)
     * - *WhatsApp* (3800)
     * - *Youtube* (8000)
     * Required
     * Example: Body of the content
     */
    public String body;
    /**
     * Required
     */
    public ContentBodyFormatted bodyFormatted;
    /**
     * Content input format
     * Required
     * Enum: Text, Html
     */
    public String bodyInputFormat;
    /**
     * List of the category identifiers of the content
     * Required
     * Example: 541014e17aa58d8ccf000023,541014e17aa58d8ccf002023
     */
    public String[] categoryIds;
    /**
     * Direction of the content.
     * <p>
     * * Incoming contents are received from a channel.
     * * Outgoing contents are exported to a channel.
     * Example: Incoming
     * Enum: Incoming, Outgoing
     */
    public String contentDirection;
    /**
     *
     */
    public ContentContextData contextData;
    /**
     * Creation time of the resource.
     * Required
     * Format: date-time
     * Example: 2023-02-04T12:43:07Z
     */
    public String creationTime;
    /**
     * Source of content
     * Required
     * Enum: Synchronizer, Interface, Api, AutoSurvey, AutoResponseTrigger, AutoRequestEmail
     */
    public String createdFrom;
    /**
     * RingCentral user identifier of the creator
     * Required
     * Example: 2683222036
     */
    public String creatorId;
    /**
     * True if the content is the first in the thread.
     */
    public Boolean firstInThread;
    /**
     * External categories of the content.
     * Returned only if the content has `foreignCategories`
     * Example: foreign_category_id
     */
    public String[] foreignCategories;
    /**
     * Content identifier
     * Required
     */
    public String id;
    /**
     * Identifier of the content identity to which this content is a reply to.
     * If the channel does not support discussion initiation, this parameter is mandatory
     * Required
     */
    public String inReplyToAuthorIdentityId;
    /**
     * Content identifier to which this content is a reply to. On creation, if omitted,
     * a new discussion will be created. If the channel does not support discussion initiation,
     * this parameter is mandatory
     * Required
     */
    public String inReplyToContentId;
    /**
     * Intervention identifier of the content
     * Required
     */
    public String interventionId;
    /**
     * Language of the content
     * Required
     * Example: En
     */
    public String language;
    /**
     * If set to `true`, then the content is publicly visible on remote channel.
     * Private content is NOT supported on every channel
     * Required
     * Default: true
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * If set to `true`, then the content is published on remote channel
     * Required
     * Example: true
     */
    public Boolean published;
    /**
     * Rating of content. Present only if the content supports rating and rating is filled
     * Required
     * Format: int32
     * Example: 4
     */
    public Long rating;
    /**
     * Set to `true` if content has been deleted on remote channel
     * Required
     */
    public Boolean remotelyDeleted;
    /**
     * Channel identifier.
     * Required
     * Example: 506d9e817aa58d1259000f12
     */
    public String channelId;
    /**
     * Type of a channel
     * Required
     * Enum: AppleMessagesForBusiness, Email, EngageMessaging, Facebook, GoogleMyBusiness, Instagram, InstagramMessaging, Linkedin, Messenger, Twitter, Viber, WhatsApp, Youtube
     */
    public String channelType;
    /**
     * External URI of a content channel
     * Required
     * Format: uri
     */
    public String channelUri;
    /**
     * Content status
     * Required
     * Enum: New, Assigned, Replied, UserReply, UserInitiated, Ignored
     */
    public String status;
    /**
     * Synchronization status
     * Required
     * Example: success
     */
    public String synchronizationStatus;
    /**
     * Synchronization error details
     * Required
     */
    public String synchronizationError;
    /**
     * Content thread identifier
     * Required
     */
    public String threadId;
    /**
     * Applicable to Email channels only. The subject of the email.
     * This field is mandatory when initiating a discussion
     * Required
     * Example: An email title
     */
    public String title;
    /**
     * Type of the content
     * Required
     * Example: Email
     * Enum: Album, AuthenticateMessage, AuthenticateResponse, Carousel, CarouselMessage, Comment, ContactMessage, Content, Email, FormMessage, FormResponse, HsmMessage, Link, ListMessage, Media, Message, OutboundMessage, PaymentMessage, Photo, PostbackMessage, PrivateTweet, PromptMessage, Question, Review, ReviewResponse, RichLinkMessage, SelectMessage, Status, TemplateMessage, TimePickerMessage, Tweet, Video, VideoCallRequestMessage
     */
    public String type;
    /**
     * The time when the last modification was completed.
     * Required
     * Format: date-time
     * Example: 2023-02-04T12:43:07Z
     */
    public String lastModifiedTime;
    /**
     * Types of structured messages that can be used to reply to this type of message
     * Required
     */
    public String[] capabilitiesSupported;

    public ContentModel attachments(SocMsgContentAttachment[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public ContentModel authorIdentityId(String authorIdentityId) {
        this.authorIdentityId = authorIdentityId;
        return this;
    }

    public ContentModel autoSubmitted(Boolean autoSubmitted) {
        this.autoSubmitted = autoSubmitted;
        return this;
    }

    public ContentModel body(String body) {
        this.body = body;
        return this;
    }

    public ContentModel bodyFormatted(ContentBodyFormatted bodyFormatted) {
        this.bodyFormatted = bodyFormatted;
        return this;
    }

    public ContentModel bodyInputFormat(String bodyInputFormat) {
        this.bodyInputFormat = bodyInputFormat;
        return this;
    }

    public ContentModel categoryIds(String[] categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }

    public ContentModel contentDirection(String contentDirection) {
        this.contentDirection = contentDirection;
        return this;
    }

    public ContentModel contextData(ContentContextData contextData) {
        this.contextData = contextData;
        return this;
    }

    public ContentModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public ContentModel createdFrom(String createdFrom) {
        this.createdFrom = createdFrom;
        return this;
    }

    public ContentModel creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public ContentModel firstInThread(Boolean firstInThread) {
        this.firstInThread = firstInThread;
        return this;
    }

    public ContentModel foreignCategories(String[] foreignCategories) {
        this.foreignCategories = foreignCategories;
        return this;
    }

    public ContentModel id(String id) {
        this.id = id;
        return this;
    }

    public ContentModel inReplyToAuthorIdentityId(String inReplyToAuthorIdentityId) {
        this.inReplyToAuthorIdentityId = inReplyToAuthorIdentityId;
        return this;
    }

    public ContentModel inReplyToContentId(String inReplyToContentId) {
        this.inReplyToContentId = inReplyToContentId;
        return this;
    }

    public ContentModel interventionId(String interventionId) {
        this.interventionId = interventionId;
        return this;
    }

    public ContentModel language(String language) {
        this.language = language;
        return this;
    }

    public ContentModel _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public ContentModel published(Boolean published) {
        this.published = published;
        return this;
    }

    public ContentModel rating(Long rating) {
        this.rating = rating;
        return this;
    }

    public ContentModel remotelyDeleted(Boolean remotelyDeleted) {
        this.remotelyDeleted = remotelyDeleted;
        return this;
    }

    public ContentModel channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public ContentModel channelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    public ContentModel channelUri(String channelUri) {
        this.channelUri = channelUri;
        return this;
    }

    public ContentModel status(String status) {
        this.status = status;
        return this;
    }

    public ContentModel synchronizationStatus(String synchronizationStatus) {
        this.synchronizationStatus = synchronizationStatus;
        return this;
    }

    public ContentModel synchronizationError(String synchronizationError) {
        this.synchronizationError = synchronizationError;
        return this;
    }

    public ContentModel threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    public ContentModel title(String title) {
        this.title = title;
        return this;
    }

    public ContentModel type(String type) {
        this.type = type;
        return this;
    }

    public ContentModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public ContentModel capabilitiesSupported(String[] capabilitiesSupported) {
        this.capabilitiesSupported = capabilitiesSupported;
        return this;
    }
}
