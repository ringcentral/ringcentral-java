package com.ringcentral.definitions;


public class AdaptiveCardInfoRequest
{
    /**
     * Enum: Container
     */
    public String type;
    public AdaptiveCardInfoRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public AdaptiveCardInfoRequestItem[] items;
    public AdaptiveCardInfoRequest items(AdaptiveCardInfoRequestItem[] items)
    {
        this.items = items;
        return this;
    }
}