package com.ringcentral.definitions;


public class AdaptiveCardInfoBackgroundImage {
    /**
     * Must be `BackgroundImage`
     * Enum: BackgroundImage
     */
    public String type;
    /**
     * The URL/data URL of an image to be used as a background of a card. Acceptable formats are PNG, JPEG, and GIF
     * Format: uri
     */
    public String url;
    /**
     * Describes how the image should fill the area
     * Enum: cover, repeatHorizontally, repeatVertically, repeat
     */
    public String fillMode;
    /**
     * Describes how the image should be aligned if it must be cropped or if using repeat fill mode
     * Enum: left, center, right
     */
    public String horizontalAlignment;
    /**
     * Describes how the image should be aligned if it must be cropped or if using repeat fill mode
     * Enum: top, center, bottom
     */
    public String verticalAlignment;

    public AdaptiveCardInfoBackgroundImage type(String type) {
        this.type = type;
        return this;
    }

    public AdaptiveCardInfoBackgroundImage url(String url) {
        this.url = url;
        return this;
    }

    public AdaptiveCardInfoBackgroundImage fillMode(String fillMode) {
        this.fillMode = fillMode;
        return this;
    }

    public AdaptiveCardInfoBackgroundImage horizontalAlignment(String horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
        return this;
    }

    public AdaptiveCardInfoBackgroundImage verticalAlignment(String verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
        return this;
    }
}
