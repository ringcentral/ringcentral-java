package com.ringcentral.definitions;


public class DiarizedObject
{
    /**
     * Required
     * Format: int32
     * Example: 2
     */
    public Long speakerCount;
    public DiarizedObject speakerCount(Long speakerCount)
    {
        this.speakerCount = speakerCount;
        return this;
    }

    /**
     * Required
     */
    public DiarizeSegment[] utterances;
    public DiarizedObject utterances(DiarizeSegment[] utterances)
    {
        this.utterances = utterances;
        return this;
    }
}