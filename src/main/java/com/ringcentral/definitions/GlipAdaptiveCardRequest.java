package com.ringcentral.definitions;


public class GlipAdaptiveCardRequest {
    /**
     * Type of atttachment. This field is mandatory and filled on server side - will be ignored if set in request body
     * Required
     * Enum: AdaptiveCard
     */
    public String type;
    /**
     * Version. This field is mandatory and filled on server side - will be ignored if set in request body
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
     * An action that will be invoked when the card is tapped or selected. `Action.ShowCard` is not supported
     */
    public AdaptiveCardSelectAction selectAction;
    /**
     *
     */
    public String fallbackText;
    /**
     * Specifies the background image of a card
     */
    public BackgroundImage backgroundImage;
    /**
     * Specifies the minimum height of the card in pxls
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

    public GlipAdaptiveCardRequest type(String type) {
        this.type = type;
        return this;
    }

    public GlipAdaptiveCardRequest version(String version) {
        this.version = version;
        return this;
    }

    public GlipAdaptiveCardRequest body(AdaptiveCardInfoRequest[] body) {
        this.body = body;
        return this;
    }

    public GlipAdaptiveCardRequest actions(AdaptiveCardAction[] actions) {
        this.actions = actions;
        return this;
    }

    public GlipAdaptiveCardRequest selectAction(AdaptiveCardSelectAction selectAction) {
        this.selectAction = selectAction;
        return this;
    }

    public GlipAdaptiveCardRequest fallbackText(String fallbackText) {
        this.fallbackText = fallbackText;
        return this;
    }

    public GlipAdaptiveCardRequest backgroundImage(BackgroundImage backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    public GlipAdaptiveCardRequest minHeight(String minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    public GlipAdaptiveCardRequest speak(String speak) {
        this.speak = speak;
        return this;
    }

    public GlipAdaptiveCardRequest lang(String lang) {
        this.lang = lang;
        return this;
    }

    public GlipAdaptiveCardRequest verticalContentAlignment(String verticalContentAlignment) {
        this.verticalContentAlignment = verticalContentAlignment;
        return this;
    }
}
