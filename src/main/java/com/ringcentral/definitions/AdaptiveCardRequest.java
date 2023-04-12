package com.ringcentral.definitions;


public class AdaptiveCardRequest {
    /**
     * Type of attachment. This field is mandatory and filled on server side -
     * will be ignored if set in request body
     * Required
     * Enum: AdaptiveCard
     */
    public String type;
    /**
     * Version. This field is mandatory and filled on server side -
     * will be ignored if set in request body
     * Required
     */
    public String version;
    /**
     * List of adaptive cards with the detailed information
     */
    public AdaptiveCardInfoRequest[] body;
    /**
     *
     */
    public AdaptiveCardAction[] actions;
    /**
     *
     */
    public AdaptiveCardSelectAction selectAction;
    /**
     *
     */
    public String fallbackText;
    /**
     * Specifies a background image oa a card. Acceptable formats are PNG, JPEG, and GIF
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

    public AdaptiveCardRequest type(String type) {
        this.type = type;
        return this;
    }

    public AdaptiveCardRequest version(String version) {
        this.version = version;
        return this;
    }

    public AdaptiveCardRequest body(AdaptiveCardInfoRequest[] body) {
        this.body = body;
        return this;
    }

    public AdaptiveCardRequest actions(AdaptiveCardAction[] actions) {
        this.actions = actions;
        return this;
    }

    public AdaptiveCardRequest selectAction(AdaptiveCardSelectAction selectAction) {
        this.selectAction = selectAction;
        return this;
    }

    public AdaptiveCardRequest fallbackText(String fallbackText) {
        this.fallbackText = fallbackText;
        return this;
    }

    public AdaptiveCardRequest backgroundImage(BackgroundImage backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    public AdaptiveCardRequest minHeight(String minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    public AdaptiveCardRequest speak(String speak) {
        this.speak = speak;
        return this;
    }

    public AdaptiveCardRequest lang(String lang) {
        this.lang = lang;
        return this;
    }

    public AdaptiveCardRequest verticalContentAlignment(String verticalContentAlignment) {
        this.verticalContentAlignment = verticalContentAlignment;
        return this;
    }
}
