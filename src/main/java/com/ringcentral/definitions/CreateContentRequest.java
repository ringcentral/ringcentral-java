package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class CreateContentRequest {
    /**
     * Identity identifier of the author of content.
     * <p>
     * Not mandatory on creation, by default it uses the token&#039;s user first identity on channel.
     * Example: 541014e17aa58d8ccf000023
     */
    public String authorIdentityId;
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
     * Example: Body of the content
     */
    public String body;
    /**
     * The content identifier to which this content is a reply to.
     * <p>
     * On creation, if omitted, a new discussion will be created. If the channel does not support to initiate discussion this parameter is mandatory.
     * Example: 123414e17asdd8ccf000023
     */
    public String inReplyToContentId;
    /**
     * True if the content is publicly visible on the remote channel (default).
     * <p>
     * Private content is NOT supported on every channel.
     * Default: true
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * Identifier of the channel.
     * <p>
     * On creation if `inReplyToContentId` is specified, the channel will be determined from it. Otherwise, this parameter is mandatory.
     * Example: fff415437asdd8ccf000023
     */
    public String sourceId;
    /**
     * An array containing the attachment identifiers that need to be attached to the content.
     * Example: 541014e17aa58d8ccf000023,541014e17aa58d8ccf000023
     */
    public String[] attachmentIds;
    /**
     * Applicable to Email channels only.
     * <p>
     * The subject of the email.
     * <p>
     * This field is mandatory when initiating a discussion.
     * Example: An email title
     */
    public String title;
    /**
     * Applicable on Email channels only.
     * <p>
     * An array containing the email addresses used in sections of the email.
     * <p>
     * This parameter is mandatory when initiating a discussion.
     */
    public String[] to;
    /**
     * Applicable on Email channels only.
     * <p>
     * An array containing the email addresses used in sections of the email.
     * <p>
     * This parameter is mandatory when initiating a discussion.
     */
    public String[] cc;
    /**
     * Applicable on Email channels only.
     * <p>
     * An array containing the email addresses used in sections of the email.
     * <p>
     * This parameter is mandatory when initiating a discussion.
     */
    public String[] bcc;
    /**
     * Applicable to WhatsApp channels only.
     * <p>
     * Name of the Whatsapp template to use for the content.
     * <p>
     * All available template names are visible on the Whatsapp Business Manager interface.
     * Example: customer_order_shipment_template
     */
    public String templateName;
    /**
     * Applicable to WhatsApp channels only.
     * <p>
     * Language of the Whatsapp template to use for the content. All available template languages are visible on the Whatsapp Business Manager interface.
     * <p>
     * Language specified must conform to the ISO 639-1 alpha-2 codes for representing the names of languages.
     * Example: fr
     */
    public String templateLanguage;
    /**
     * Applicable to WhatsApp channels only.
     * <p>
     * Component configuration of the Whatsapp template to use for the content.
     * <p>
     * All available components are visible on the Whatsapp Business Manager interface.
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

    public CreateContentRequest authorIdentityId(String authorIdentityId) {
        this.authorIdentityId = authorIdentityId;
        return this;
    }

    public CreateContentRequest body(String body) {
        this.body = body;
        return this;
    }

    public CreateContentRequest inReplyToContentId(String inReplyToContentId) {
        this.inReplyToContentId = inReplyToContentId;
        return this;
    }

    public CreateContentRequest _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public CreateContentRequest sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public CreateContentRequest attachmentIds(String[] attachmentIds) {
        this.attachmentIds = attachmentIds;
        return this;
    }

    public CreateContentRequest title(String title) {
        this.title = title;
        return this;
    }

    public CreateContentRequest to(String[] to) {
        this.to = to;
        return this;
    }

    public CreateContentRequest cc(String[] cc) {
        this.cc = cc;
        return this;
    }

    public CreateContentRequest bcc(String[] bcc) {
        this.bcc = bcc;
        return this;
    }

    public CreateContentRequest templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public CreateContentRequest templateLanguage(String templateLanguage) {
        this.templateLanguage = templateLanguage;
        return this;
    }

    public CreateContentRequest components(Object[] components) {
        this.components = components;
        return this;
    }

    public CreateContentRequest contextData(ContentContextData contextData) {
        this.contextData = contextData;
        return this;
    }

    public CreateContentRequest autoSubmitted(Boolean autoSubmitted) {
        this.autoSubmitted = autoSubmitted;
        return this;
    }
}
