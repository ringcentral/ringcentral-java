package com.ringcentral.definitions;

public class AsrApiResponseResponse {
    /**
     * The number of speakers detected. Field is set only when enableSpeakerDiarization is true.
     * Format: int32 Example: 2
     */
    public Long speakerCount;

    public AsrApiResponseResponse speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    /** Speaker wise utterances. Field is set only when enableSpeakerDiarization is true. */
    public UtteranceObject[] utterances;

    public AsrApiResponseResponse utterances(UtteranceObject[] utterances) {
        this.utterances = utterances;
        return this;
    }

    /** */
    public WordSegment[] words;

    public AsrApiResponseResponse words(WordSegment[] words) {
        this.words = words;
        return this;
    }

    /** Overall transcription confidence. Format: float */
    public Double confidence;

    public AsrApiResponseResponse confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /** The entire transcript with/without punctuations according to the input. */
    public String transcript;

    public AsrApiResponseResponse transcript(String transcript) {
        this.transcript = transcript;
        return this;
    }
}
