package com.ringcentral.definitions;


public class AdaptiveCardRequest
{
    /**
     * Type of attachment. This field is mandatory and filled on server side -
    * will be ignored if set in request body
     * Required
     * Enum: AdaptiveCard
     */
    public String type;
    public AdaptiveCardRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Version. This field is mandatory and filled on server side -
    * will be ignored if set in request body
     * Required
     */
    public String version;
    public AdaptiveCardRequest version(String version)
    {
        this.version = version;
        return this;
    }

    /**
     * List of adaptive cards with the detailed information
     */
    public AdaptiveCardInfoRequest[] body;
    public AdaptiveCardRequest body(AdaptiveCardInfoRequest[] body)
    {
        this.body = body;
        return this;
    }

    /**
     */
    public AdaptiveCardAction[] actions;
    public AdaptiveCardRequest actions(AdaptiveCardAction[] actions)
    {
        this.actions = actions;
        return this;
    }

    /**
     */
    public AdaptiveCardSelectAction selectAction;
    public AdaptiveCardRequest selectAction(AdaptiveCardSelectAction selectAction)
    {
        this.selectAction = selectAction;
        return this;
    }

    /**
     */
    public String fallbackText;
    public AdaptiveCardRequest fallbackText(String fallbackText)
    {
        this.fallbackText = fallbackText;
        return this;
    }

    /**
     * Specifies the background image of a card
     */
    public BackgroundImage backgroundImage;
    public AdaptiveCardRequest backgroundImage(BackgroundImage backgroundImage)
    {
        this.backgroundImage = backgroundImage;
        return this;
    }

    /**
     * Specifies the minimum height of the card in pixels
     * Example: 50px
     */
    public String minHeight;
    public AdaptiveCardRequest minHeight(String minHeight)
    {
        this.minHeight = minHeight;
        return this;
    }

    /**
     * Specifies what should be spoken for this entire card. This is simple text or SSML fragment
     */
    public String speak;
    public AdaptiveCardRequest speak(String speak)
    {
        this.speak = speak;
        return this;
    }

    /**
     * The 2-letter ISO-639-1 language used in the card. Used to localize any date/time functions
     * Enum: en, fr, es
     */
    public String lang;
    public AdaptiveCardRequest lang(String lang)
    {
        this.lang = lang;
        return this;
    }

    /**
     * Defines how the content should be aligned vertically within the container. Only relevant for fixed-height cards, or cards with a `minHeight` specified
     * Enum: top, center, bottom
     */
    public String verticalContentAlignment;
    public AdaptiveCardRequest verticalContentAlignment(String verticalContentAlignment)
    {
        this.verticalContentAlignment = verticalContentAlignment;
        return this;
    }
}