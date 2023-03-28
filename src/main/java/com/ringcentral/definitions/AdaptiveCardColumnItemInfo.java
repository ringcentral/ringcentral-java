package com.ringcentral.definitions;


public class AdaptiveCardColumnItemInfo {
    /**
     *
     */
    public String type;
    /**
     * Format: uri
     */
    public String url;
    /**
     *
     */
    public String size;
    /**
     *
     */
    public String style;
    /**
     *
     */
    public Boolean wrap;
    /**
     *
     */
    public String spacing;
    /**
     *
     */
    public String text;
    /**
     *
     */
    public Boolean isSubtle;

    public AdaptiveCardColumnItemInfo type(String type) {
        this.type = type;
        return this;
    }

    public AdaptiveCardColumnItemInfo url(String url) {
        this.url = url;
        return this;
    }

    public AdaptiveCardColumnItemInfo size(String size) {
        this.size = size;
        return this;
    }

    public AdaptiveCardColumnItemInfo style(String style) {
        this.style = style;
        return this;
    }

    public AdaptiveCardColumnItemInfo wrap(Boolean wrap) {
        this.wrap = wrap;
        return this;
    }

    public AdaptiveCardColumnItemInfo spacing(String spacing) {
        this.spacing = spacing;
        return this;
    }

    public AdaptiveCardColumnItemInfo text(String text) {
        this.text = text;
        return this;
    }

    public AdaptiveCardColumnItemInfo isSubtle(Boolean isSubtle) {
        this.isSubtle = isSubtle;
        return this;
    }
}
