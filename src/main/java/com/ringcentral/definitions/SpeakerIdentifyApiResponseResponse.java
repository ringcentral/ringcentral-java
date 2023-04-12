package com.ringcentral.definitions;


public class SpeakerIdentifyApiResponseResponse {
    /**
     *
     */
    public DiarizeSegment[] utterances;

    public SpeakerIdentifyApiResponseResponse utterances(DiarizeSegment[] utterances) {
        this.utterances = utterances;
        return this;
    }
}
