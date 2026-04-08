package com.ringcentral.definitions;


public class AdaptiveCardAction
{
    /**
     * Enum: Action.ShowCard, Action.Submit, Action.OpenUrl, Action.ToggleVisibility
     */
    public String type;
    public AdaptiveCardAction type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public String title;
    public AdaptiveCardAction title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     */
    public ActionAdaptiveCardInfo card;
    public AdaptiveCardAction card(ActionAdaptiveCardInfo card)
    {
        this.card = card;
        return this;
    }

    /**
     * Format: uri
     */
    public String url;
    public AdaptiveCardAction url(String url)
    {
        this.url = url;
        return this;
    }
}