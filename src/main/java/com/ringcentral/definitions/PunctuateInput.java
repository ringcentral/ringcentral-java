package com.ringcentral.definitions;


public class PunctuateInput {
    /**
     * Required
     */
    public String[] texts;

    public PunctuateInput texts(String[] texts) {
        this.texts = texts;
        return this;
    }
}
