package com.ringcentral.definitions;

public class TranscribedObject {
    /**
     * The number of speakers detected. Field is set only when enableSpeakerDiarization is true.
     * Format: int32 Example: 2
     */
    public Long speakerCount;

    public TranscribedObject speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    /** Speaker wise utterances. Field is set only when enableSpeakerDiarization is true. */
    public UtteranceObject[] utterances;

    public TranscribedObject utterances(UtteranceObject[] utterances) {
        this.utterances = utterances;
        return this;
    }

    /** Required */
    public WordSegment[] words;

    public TranscribedObject words(WordSegment[] words) {
        this.words = words;
        return this;
    }

    /** Overall transcription confidence. Format: float */
    public Double confidence;

    public TranscribedObject confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /** The entire transcript with/without punctuations according to the input. Required */
    public String transcript;

    public TranscribedObject transcript(String transcript) {
        this.transcript = transcript;
        return this;
    }
}
