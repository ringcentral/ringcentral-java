package com.ringcentral.definitions;


public class EmotionSegment {
    /**
     * Required
     * Format: float
     * Example: 0.3
     */
    public Double start;
    /**
     * Required
     * Format: float
     * Example: 5.1
     */
    public Double end;
    /**
     * Required
     * Example: Neutral
     * Enum: Anger, Excitement, Frustration, Joy, Sadness, Neutral
     */
    public String emotion;
    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;

    public EmotionSegment start(Double start) {
        this.start = start;
        return this;
    }

    public EmotionSegment end(Double end) {
        this.end = end;
        return this;
    }

    public EmotionSegment emotion(String emotion) {
        this.emotion = emotion;
        return this;
    }

    public EmotionSegment confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
}
