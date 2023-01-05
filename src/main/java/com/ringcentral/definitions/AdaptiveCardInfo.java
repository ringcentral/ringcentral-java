package com.ringcentral.definitions;


public class AdaptiveCardInfo
{
    /**
     * Internal identifier of an adaptive card
     */
    public String id;
    public AdaptiveCardInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Adaptive Card creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    public AdaptiveCardInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Post last modification datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;
    public AdaptiveCardInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Schema of an adaptive card
     * Format: uri
     */
    public String $schema;
    public AdaptiveCardInfo $schema(String $schema)
    {
        this.$schema = $schema;
        return this;
    }

    /**
     * Enum: AdaptiveCard
     */
    public String type;
    public AdaptiveCardInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Version of an adaptive card
     */
    public String version;
    public AdaptiveCardInfo version(String version)
    {
        this.version = version;
        return this;
    }

    /**
     */
    public AdaptiveCardCreator creator;
    public AdaptiveCardInfo creator(AdaptiveCardCreator creator)
    {
        this.creator = creator;
        return this;
    }

    /**
     * Chat IDs where an adaptive card is posted or shared.
     */
    public String[] chatIds;
    public AdaptiveCardInfo chatIds(String[] chatIds)
    {
        this.chatIds = chatIds;
        return this;
    }

    /**
     * List of card elements to show in the primary card region
     */
    public AdaptiveCardInfoRequest[] body;
    public AdaptiveCardInfo body(AdaptiveCardInfoRequest[] body)
    {
        this.body = body;
        return this;
    }

    /**
     */
    public AdaptiveCardAction[] actions;
    public AdaptiveCardInfo actions(AdaptiveCardAction[] actions)
    {
        this.actions = actions;
        return this;
    }

    /**
     */
    public AdaptiveCardSelectAction selectAction;
    public AdaptiveCardInfo selectAction(AdaptiveCardSelectAction selectAction)
    {
        this.selectAction = selectAction;
        return this;
    }

    /**
     * Text shown when the client doesn&#039;t support the version specified (may contain markdown)
     */
    public String fallbackText;
    public AdaptiveCardInfo fallbackText(String fallbackText)
    {
        this.fallbackText = fallbackText;
        return this;
    }

    /**
     * Specifies the background image of a card
     */
    public BackgroundImage backgroundImage;
    public AdaptiveCardInfo backgroundImage(BackgroundImage backgroundImage)
    {
        this.backgroundImage = backgroundImage;
        return this;
    }

    /**
     * Specifies the minimum height of the card in pixels
     * Example: 50px
     */
    public String minHeight;
    public AdaptiveCardInfo minHeight(String minHeight)
    {
        this.minHeight = minHeight;
        return this;
    }

    /**
     * Specifies what should be spoken for this entire card. This is simple text or SSML fragment
     */
    public String speak;
    public AdaptiveCardInfo speak(String speak)
    {
        this.speak = speak;
        return this;
    }

    /**
     * The 2-letter ISO-639-1 language used in the card. Used to localize any date/time functions
     * Enum: en, fr, es
     */
    public String lang;
    public AdaptiveCardInfo lang(String lang)
    {
        this.lang = lang;
        return this;
    }

    /**
     * Defines how the content should be aligned vertically within the container. Only relevant for fixed-height cards, or cards with a `minHeight` specified
     * Enum: top, center, bottom
     */
    public String verticalContentAlignment;
    public AdaptiveCardInfo verticalContentAlignment(String verticalContentAlignment)
    {
        this.verticalContentAlignment = verticalContentAlignment;
        return this;
    }
}