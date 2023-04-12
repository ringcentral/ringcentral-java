package com.ringcentral.definitions;


public class SpeechContextPhrasesInput {
    /**
     * Words or Phrases to boost
     * Required
     * Example: Mohit,Sushant,RingCentral
     */
    public String[] phrases;

    public SpeechContextPhrasesInput phrases(String[] phrases) {
        this.phrases = phrases;
        return this;
    }
}
