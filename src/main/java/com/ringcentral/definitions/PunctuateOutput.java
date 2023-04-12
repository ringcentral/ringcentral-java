package com.ringcentral.definitions;


public class PunctuateOutput {
    /**
     * Required
     */
    public String[] texts;

    public PunctuateOutput texts(String[] texts) {
        this.texts = texts;
        return this;
    }
}
