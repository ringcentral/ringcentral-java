package com.ringcentral.definitions;


public class DiarizedObject {
    /**
     * Required
     * Format: int32
     * Example: 3
     */
    public Long speakerCount;
    /**
     * Required
     */
    public DiarizeSegment[] utterances;

    public DiarizedObject speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    public DiarizedObject utterances(DiarizeSegment[] utterances) {
        this.utterances = utterances;
        return this;
    }
}
