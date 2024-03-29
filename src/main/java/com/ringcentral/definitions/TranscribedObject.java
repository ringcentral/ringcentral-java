package com.ringcentral.definitions;


public class TranscribedObject {
    /**
     * The number of speakers detected. Field is set only when enableSpeakerDiarization is true.
     * Format: int32
     * Example: 2
     */
    public Long speakerCount;
    /**
     * Speaker wise utterances. Field is set only when enableSpeakerDiarization is true.
     */
    public UtteranceObject[] utterances;
    /**
     * Required
     */
    public WordSegment[] words;
    /**
     * Overall transcription confidence.
     * Format: float
     */
    public Double confidence;
    /**
     * The entire transcript with/without punctuations according to the input.
     * Required
     */
    public String transcript;

    public TranscribedObject speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    public TranscribedObject utterances(UtteranceObject[] utterances) {
        this.utterances = utterances;
        return this;
    }

    public TranscribedObject words(WordSegment[] words) {
        this.words = words;
        return this;
    }

    public TranscribedObject confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public TranscribedObject transcript(String transcript) {
        this.transcript = transcript;
        return this;
    }
}
