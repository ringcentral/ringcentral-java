package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class ContentModel {
    /**
     * An array containing the attachments that are attached to the content.
     * Required
     */
    public ContentAttachment[] attachments;
    /**
     * Identity identifier of the author of content.
     * <p>
     * Not mandatory on creation, by default it uses the token&#039;s user first identity on channel.
     * Required
     * Example: 541014e17aa58d8ccf000023
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
     * The content&#039;s body.
     * <p>
     * On creation this field is mandatory except for WhatsApp content using templates.
     * <p>
     * The following are the max length restrictions for the different channels supported.
     * Channel and max length
     * * Apple Messages For Business (max length 10000)
     * * Email (max length 262144)
     * * RingCX Digital Messaging (max length 1024)
     * * Facebook (max length 8000)
     * * GoogleBusinessMessages (max length 3000)
     * * Google My Business (max length 4000)
     * * Instagram (max length 950)
     * * Instagram Messaging (max length 1000)
     * * LinkedIn (max length 3000)
     * * Messenger (max length 2000)
     * * Twitter (max length 280)
     * * Viber (max length 7000)
     * * WhatsApp (max length 3800)
     * * Youtube (max length 8000)
     * Required
     * Example: Body of the content
     */
    public String body;
    /**
     * Required
     */
    public ContentBodyFormatted bodyFormatted;
    /**
     * Values can be Text or Html.
     * Required
     * Enum: Text, Html
     */
    public String bodyInputFormat;
    /**
     * List of the category identifiers of the content.
     * Required
     * Example: 541014e17aa58d8ccf000023,541014e17aa58d8ccf002023
     */
    public String[] categoryIds;
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
     * Created from of the content.
     * Required
     * Enum: Synchronizer, Interface, Api, AutoSurvey, AutoResponseTrigger, AutoRequestEmail
     */
    public String createdFrom;
    /**
     * RC user id of the creator
     * Required
     * Example: 2683222036
     */
    public String creatorId;
    /**
     * External categories of the content.
     * <p>
     * Present only if the content has foreignCategories.
     * Example: foreign_category_id
     */
    public String[] foreignCategories;
    /**
     * Identifier of the content.
     * Required
     * Example: 541014e17aa58d8ccf000023
     */
    public String id;
    /**
     * The identity identifier of the content to which this content is a reply to.
     * Required
     * Example: 541014e17asdd8ccf000023
     */
    public String inReplyToAuthorIdentityId;
    /**
     * The content identifier to which this content is a reply to.
     * <p>
     * On creation, if omitted, a new discussion will be created. If the channel does not support to initiate discussion this parameter is mandatory.
     * Required
     * Example: 123414e17asdd8ccf000023
     */
    public String inReplyToContentId;
    /**
     * The intervention identifier of the content.
     * Required
     * Example: 123415437asdd8ccf000023
     */
    public String interventionId;
    /**
     * Language of the content.
     * Required
     * Example: En
     */
    public String language;
    /**
     * True if the content is publicly visible on the remote channel (default).
     * <p>
     * Private content is NOT supported on every channel.
     * Required
     * Default: true
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * True if the content is published on the remote channel.
     * Required
     * Example: true
     */
    public Boolean published;
    /**
     * Rating of the content.
     * <p>
     * Present only if the content supports rating and rating is filled.
     * Required
     * Format: int32
     * Example: 4
     */
    public Long rating;
    /**
     * True if the content has been deleted on the remote channel.
     * Required
     */
    public Boolean remotelyDeleted;
    /**
     * Identifier of the channel.
     * <p>
     * On creation if `inReplyToContentId` is specified, the channel will be determined from it. Otherwise, this parameter is mandatory.
     * Required
     * Example: fff415437asdd8ccf000023
     */
    public String sourceId;
    /**
     * Type of the channel.
     * Required
     * Enum: AppleMessagesForBusiness, Email, EngageMessaging, Facebook, GoogleBusinessMessages, GoogleMyBusiness, Instagram, InstagramMessaging, Linkedin, Messenger, Twitter, Viber, WhatsApp, Youtube
     */
    public String sourceType;
    /**
     * External Uri of the content channel.
     * Required
     * Format: uri
     */
    public String sourceUri;
    /**
     * Content status.
     * Required
     * Enum: New, Assigned, Replied, UserReply, UserInitiated, Ignored
     */
    public String status;
    /**
     * Synchronization status.
     * Required
     * Example: success
     */
    public String synchronizationStatus;
    /**
     * Synchronization error details.
     * Required
     */
    public String synchronizationError;
    /**
     * Content thread identifier of the content.
     * Required
     */
    public String threadId;
    /**
     * Applicable to Email channels only.
     * <p>
     * The subject of the email.
     * <p>
     * This field is mandatory when initiating a discussion.
     * Required
     * Example: An email title
     */
    public String title;
    /**
     * Type of the content.
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
     * Types of structured messages that can be used to reply to this type of message.
     * Required
     */
    public String[] capabilitiesSupported;

    public ContentModel attachments(ContentAttachment[] attachments) {
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

    public ContentModel sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public ContentModel sourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public ContentModel sourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
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
