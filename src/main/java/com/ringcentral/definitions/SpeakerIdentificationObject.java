package com.ringcentral.definitions;


public class SpeakerIdentificationObject {
    /**
     * Required
     */
    public DiarizeSegment[] utterances;

    public SpeakerIdentificationObject utterances(DiarizeSegment[] utterances) {
        this.utterances = utterances;
        return this;
    }
}
