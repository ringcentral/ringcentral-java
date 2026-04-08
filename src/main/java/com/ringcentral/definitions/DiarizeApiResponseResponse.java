package com.ringcentral.definitions;

public class DiarizeApiResponseResponse {
    /** Format: int32 Example: 2 */
    public Long speakerCount;

    public DiarizeApiResponseResponse speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    /** */
    public DiarizeSegment[] utterances;

    public DiarizeApiResponseResponse utterances(DiarizeSegment[] utterances) {
        this.utterances = utterances;
        return this;
    }
}
