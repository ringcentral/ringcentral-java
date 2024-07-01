package com.ringcentral.definitions;


public class JobStatusResponseResponse {
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
    /**
     *
     */
    public UtteranceInsightsObject[] utteranceInsights;
    /**
     *
     */
    public SpeakerInsightsObject speakerInsights;
    /**
     *
     */
    public ConversationalInsightsUnit[] conversationalInsights;

    public JobStatusResponseResponse speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    public JobStatusResponseResponse utterances(UtteranceObject[] utterances) {
        this.utterances = utterances;
        return this;
    }

    public JobStatusResponseResponse words(WordSegment[] words) {
        this.words = words;
        return this;
    }

    public JobStatusResponseResponse confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public JobStatusResponseResponse transcript(String transcript) {
        this.transcript = transcript;
        return this;
    }

    public JobStatusResponseResponse utteranceInsights(UtteranceInsightsObject[] utteranceInsights) {
        this.utteranceInsights = utteranceInsights;
        return this;
    }

    public JobStatusResponseResponse speakerInsights(SpeakerInsightsObject speakerInsights) {
        this.speakerInsights = speakerInsights;
        return this;
    }

    public JobStatusResponseResponse conversationalInsights(ConversationalInsightsUnit[] conversationalInsights) {
        this.conversationalInsights = conversationalInsights;
        return this;
    }
}
