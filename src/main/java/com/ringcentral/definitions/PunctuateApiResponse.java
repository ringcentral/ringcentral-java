package com.ringcentral.definitions;


public class PunctuateApiResponse {
    /**
     * Required
     */
    public String[] texts;

    public PunctuateApiResponse texts(String[] texts) {
        this.texts = texts;
        return this;
    }
}
