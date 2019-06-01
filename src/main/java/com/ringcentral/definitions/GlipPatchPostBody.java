package com.ringcentral.definitions;


public class GlipPatchPostBody {
    /**
     * Post text.
     */
    public String text;

    public GlipPatchPostBody text(String text) {
        this.text = text;
        return this;
    }

}
