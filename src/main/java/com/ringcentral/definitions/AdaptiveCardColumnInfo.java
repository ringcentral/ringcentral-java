package com.ringcentral.definitions;


public class AdaptiveCardColumnInfo {
    /**
     *
     */
    public String type;
    /**
     *
     */
    public String width;
    /**
     *
     */
    public AdaptiveCardColumnItemInfo[] items;

    public AdaptiveCardColumnInfo type(String type) {
        this.type = type;
        return this;
    }

    public AdaptiveCardColumnInfo width(String width) {
        this.width = width;
        return this;
    }

    public AdaptiveCardColumnInfo items(AdaptiveCardColumnItemInfo[] items) {
        this.items = items;
        return this;
    }
}
