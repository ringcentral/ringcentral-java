package com.ringcentral.definitions;


    /**
* One utterance of a call. Each utterance is a speakerId, text, start and end time
*/
public class TranscriptInsightUnit
{
    /**
     * Participant ID
     * Required
     * Example: p-32423
     */
    public String speakerId;
    public TranscriptInsightUnit speakerId(String speakerId)
    {
        this.speakerId = speakerId;
        return this;
    }

    /**
     * Text of the utterance
     * Required
     * Example: Hello user!
     */
    public String text;
    public TranscriptInsightUnit text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * Start time of the utterance (in sec)
     * Required
     * Format: float
     * Example: 1.2
     */
    public Double start;
    public TranscriptInsightUnit start(Double start)
    {
        this.start = start;
        return this;
    }

    /**
     * End time of the utterance (in sec)
     * Required
     * Format: float
     * Example: 4.2
     */
    public Double end;
    public TranscriptInsightUnit end(Double end)
    {
        this.end = end;
        return this;
    }
}