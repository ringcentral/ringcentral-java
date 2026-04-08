package com.ringcentral.definitions;


public class JobStatusResponseResponse
{
    /**
     * The number of speakers detected. Field is set only when enableSpeakerDiarization is true.
     * Format: int32
     * Example: 2
     */
    public Long speakerCount;
    public JobStatusResponseResponse speakerCount(Long speakerCount)
    {
        this.speakerCount = speakerCount;
        return this;
    }

    /**
     * Speaker wise utterances. Field is set only when enableSpeakerDiarization is true.
     */
    public UtteranceObject[] utterances;
    public JobStatusResponseResponse utterances(UtteranceObject[] utterances)
    {
        this.utterances = utterances;
        return this;
    }

    /**
     */
    public WordSegment[] words;
    public JobStatusResponseResponse words(WordSegment[] words)
    {
        this.words = words;
        return this;
    }

    /**
     * Overall transcription confidence.
     * Format: float
     */
    public Double confidence;
    public JobStatusResponseResponse confidence(Double confidence)
    {
        this.confidence = confidence;
        return this;
    }

    /**
     * The entire transcript with/without punctuations according to the input.
     */
    public String transcript;
    public JobStatusResponseResponse transcript(String transcript)
    {
        this.transcript = transcript;
        return this;
    }

    /**
     */
    public UtteranceInsightsObject[] utteranceInsights;
    public JobStatusResponseResponse utteranceInsights(UtteranceInsightsObject[] utteranceInsights)
    {
        this.utteranceInsights = utteranceInsights;
        return this;
    }

    /**
     */
    public SpeakerInsightsObject speakerInsights;
    public JobStatusResponseResponse speakerInsights(SpeakerInsightsObject speakerInsights)
    {
        this.speakerInsights = speakerInsights;
        return this;
    }

    /**
     */
    public ConversationalInsightsUnit[] conversationalInsights;
    public JobStatusResponseResponse conversationalInsights(ConversationalInsightsUnit[] conversationalInsights)
    {
        this.conversationalInsights = conversationalInsights;
        return this;
    }
}