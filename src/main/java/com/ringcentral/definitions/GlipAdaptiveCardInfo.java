package com.ringcentral.definitions;


public class GlipAdaptiveCardInfo {
    /**
     * Internal identifier of an adaptive card
     */
    public String id;
    /**
     * Adaptive Card creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Post last modification datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Schema of an adaptive card
     * Format: uri
     */
    public String $schema;
    /**
     * Enum: AdaptiveCard
     */
    public String type;
    /**
     * Version of an adaptive card
     */
    public String version;
    /**
     *
     */
    public AdaptiveCardCreator creator;
    /**
     * Chat IDs where an adaptive card is posted or shared.
     */
    public String[] chatIds;
    /**
     * List of card elements to show in the primary card region
     */
    public AdaptiveCardInfoRequest[] body;
    /**
     *
     */
    public AdaptiveCardAction[] actions;
    /**
     * An action that will be invoked when the card is tapped or selected. `Action.ShowCard` is not supported
     */
    public AdaptiveCardSelectAction selectAction;
    /**
     * Text shown when the client doesn&#039;t support the version specified (may contain markdown)
     */
    public String fallbackText;
    /**
     * Specifies the background image of a card
     */
    public BackgroundImage backgroundImage;
    /**
     * Specifies the minimum height of the card in pixels
     * Example: 50px
     */
    public String minHeight;
    /**
     * Specifies what should be spoken for this entire card. This is simple text or SSML fragment
     */
    public String speak;
    /**
     * The 2-letter ISO-639-1 language used in the card. Used to localize any date/time functions
     * Enum: en, fr, es
     */
    public String lang;
    /**
     * Defines how the content should be aligned vertically within the container. Only relevant for fixed-height cards, or cards with a `minHeight` specified
     * Enum: top, center, bottom
     */
    public String verticalContentAlignment;

    public GlipAdaptiveCardInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipAdaptiveCardInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipAdaptiveCardInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipAdaptiveCardInfo $schema(String $schema) {
        this.$schema = $schema;
        return this;
    }

    public GlipAdaptiveCardInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipAdaptiveCardInfo version(String version) {
        this.version = version;
        return this;
    }

    public GlipAdaptiveCardInfo creator(AdaptiveCardCreator creator) {
        this.creator = creator;
        return this;
    }

    public GlipAdaptiveCardInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }

    public GlipAdaptiveCardInfo body(AdaptiveCardInfoRequest[] body) {
        this.body = body;
        return this;
    }

    public GlipAdaptiveCardInfo actions(AdaptiveCardAction[] actions) {
        this.actions = actions;
        return this;
    }

    public GlipAdaptiveCardInfo selectAction(AdaptiveCardSelectAction selectAction) {
        this.selectAction = selectAction;
        return this;
    }

    public GlipAdaptiveCardInfo fallbackText(String fallbackText) {
        this.fallbackText = fallbackText;
        return this;
    }

    public GlipAdaptiveCardInfo backgroundImage(BackgroundImage backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    public GlipAdaptiveCardInfo minHeight(String minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    public GlipAdaptiveCardInfo speak(String speak) {
        this.speak = speak;
        return this;
    }

    public GlipAdaptiveCardInfo lang(String lang) {
        this.lang = lang;
        return this;
    }

    public GlipAdaptiveCardInfo verticalContentAlignment(String verticalContentAlignment) {
        this.verticalContentAlignment = verticalContentAlignment;
        return this;
    }
}
