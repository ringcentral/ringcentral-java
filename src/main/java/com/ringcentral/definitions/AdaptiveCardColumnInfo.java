package com.ringcentral.definitions;


public class AdaptiveCardColumnInfo
{
    /**
     */
    public String type;
    public AdaptiveCardColumnInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public String width;
    public AdaptiveCardColumnInfo width(String width)
    {
        this.width = width;
        return this;
    }

    /**
     */
    public AdaptiveCardColumnItemInfo[] items;
    public AdaptiveCardColumnInfo items(AdaptiveCardColumnItemInfo[] items)
    {
        this.items = items;
        return this;
    }
}