package com.ringcentral.definitions;


public class DiarizeApiResponseResponse {
    /**
     * Format: int32
     * Example: 3
     */
    public Long speakerCount;
    /**
     *
     */
    public DiarizeSegment[] utterances;

    public DiarizeApiResponseResponse speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    public DiarizeApiResponseResponse utterances(DiarizeSegment[] utterances) {
        this.utterances = utterances;
        return this;
    }
}
