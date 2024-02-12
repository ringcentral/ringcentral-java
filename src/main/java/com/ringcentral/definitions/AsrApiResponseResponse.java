package com.ringcentral.definitions;


public class AsrApiResponseResponse {
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
     *
     */
    public WordSegment[] words;
    /**
     * Overall transcription confidence.
     * Format: float
     */
    public Double confidence;
    /**
     * The entire transcript with/without punctuations according to the input.
     */
    public String transcript;

    public AsrApiResponseResponse speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    public AsrApiResponseResponse utterances(UtteranceObject[] utterances) {
        this.utterances = utterances;
        return this;
    }

    public AsrApiResponseResponse words(WordSegment[] words) {
        this.words = words;
        return this;
    }

    public AsrApiResponseResponse confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public AsrApiResponseResponse transcript(String transcript) {
        this.transcript = transcript;
        return this;
    }
}
