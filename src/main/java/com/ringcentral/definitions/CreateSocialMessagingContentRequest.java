package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


/**
 * Request body for operation createSocialMessagingContent
 */
public class CreateSocialMessagingContentRequest {
    /**
     * Identity identifier of the content author. Not mandatory on creation,
     * by default it uses the token&#039;s user first identity on channel
     */
    public String authorIdentityId;
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
     * Example: Body of the content
     */
    public String body;
    /**
     * Content identifier to which this content is a reply to. On creation, if omitted,
     * a new discussion will be created. If the channel does not support discussion initiation,
     * this parameter is mandatory
     */
    public String inReplyToContentId;
    /**
     * If set to `true`, then the content is publicly visible on remote channel.
     * Private content is NOT supported on every channel
     * Default: true
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * Channel identifier.
     * Example: 506d9e817aa58d1259000f12
     */
    public String channelId;
    /**
     * List of attachment identifiers to be added to the content
     * Example: 541014e17aa58d8ccf000023,541014e17aa58d8ccf000023
     */
    public String[] attachmentIds;
    /**
     * Applicable to Email channels only. The subject of the email.
     * This field is mandatory when initiating a discussion
     * Example: An email title
     */
    public String title;
    /**
     * Applicable to Email channels only.
     * An array containing the email addresses used in sections of the email.
     * This parameter is mandatory when initiating a discussion
     */
    public String[] to;
    /**
     * Applicable to Email channels only.
     * An array containing the email addresses used in sections of the email.
     * This parameter is mandatory when initiating a discussion
     */
    public String[] cc;
    /**
     * Applicable to Email channels only.
     * An array containing the email addresses used in sections of the email.
     * This parameter is mandatory when initiating a discussion
     */
    public String[] bcc;
    /**
     * Applicable to WhatsApp channels only. Name of the WhatsApp template to use for the content.
     * All available template names are visible on the WhatsApp Business Manager interface
     * Example: customer_order_shipment_template
     */
    public String templateName;
    /**
     * Applicable to WhatsApp channels only. Language of the WhatsApp template
     * to use for the content. All available template languages are visible on
     * the WhatsApp Business Manager interface. Language specified must conform
     * to the ISO 639-1 alpha-2 codes for representing the names of languages
     * Example: fr
     */
    public String templateLanguage;
    /**
     * Applicable to WhatsApp channels only. Component configuration of the WhatsApp
     * template to use for the content. All available components are visible on
     * the WhatsApp Business Manager interface
     * Example: [object Object],[object Object]
     */
    public Object[] components;
    /**
     *
     */
    public ContentContextData contextData;
    /**
     * Auto submitted content:
     * - won&#039;t reopen tasks or interventions
     * - can be used to send automatic messages like asking an user to follow on twitter, sending a survey, etc,
     * - doesn&#039;t get included in statistics
     */
    public Boolean autoSubmitted;

    public CreateSocialMessagingContentRequest authorIdentityId(String authorIdentityId) {
        this.authorIdentityId = authorIdentityId;
        return this;
    }

    public CreateSocialMessagingContentRequest body(String body) {
        this.body = body;
        return this;
    }

    public CreateSocialMessagingContentRequest inReplyToContentId(String inReplyToContentId) {
        this.inReplyToContentId = inReplyToContentId;
        return this;
    }

    public CreateSocialMessagingContentRequest _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public CreateSocialMessagingContentRequest channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public CreateSocialMessagingContentRequest attachmentIds(String[] attachmentIds) {
        this.attachmentIds = attachmentIds;
        return this;
    }

    public CreateSocialMessagingContentRequest title(String title) {
        this.title = title;
        return this;
    }

    public CreateSocialMessagingContentRequest to(String[] to) {
        this.to = to;
        return this;
    }

    public CreateSocialMessagingContentRequest cc(String[] cc) {
        this.cc = cc;
        return this;
    }

    public CreateSocialMessagingContentRequest bcc(String[] bcc) {
        this.bcc = bcc;
        return this;
    }

    public CreateSocialMessagingContentRequest templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public CreateSocialMessagingContentRequest templateLanguage(String templateLanguage) {
        this.templateLanguage = templateLanguage;
        return this;
    }

    public CreateSocialMessagingContentRequest components(Object[] components) {
        this.components = components;
        return this;
    }

    public CreateSocialMessagingContentRequest contextData(ContentContextData contextData) {
        this.contextData = contextData;
        return this;
    }

    public CreateSocialMessagingContentRequest autoSubmitted(Boolean autoSubmitted) {
        this.autoSubmitted = autoSubmitted;
        return this;
    }
}
