package com.ringcentral.definitions;


public class AIInsights
{
    /**
     */
    public TranscriptInsightUnit[] Transcript;
    public AIInsights Transcript(TranscriptInsightUnit[] Transcript)
    {
        this.Transcript = Transcript;
        return this;
    }

    /**
     */
    public SummaryInsightUnit[] Summary;
    public AIInsights Summary(SummaryInsightUnit[] Summary)
    {
        this.Summary = Summary;
        return this;
    }

    /**
     */
    public HighlightsInsightUnit[] Highlights;
    public AIInsights Highlights(HighlightsInsightUnit[] Highlights)
    {
        this.Highlights = Highlights;
        return this;
    }

    /**
     */
    public NextStepsInsightUnit[] NextSteps;
    public AIInsights NextSteps(NextStepsInsightUnit[] NextSteps)
    {
        this.NextSteps = NextSteps;
        return this;
    }

    /**
     */
    public BulletedSummaryInsightUnit[] BulletedSummary;
    public AIInsights BulletedSummary(BulletedSummaryInsightUnit[] BulletedSummary)
    {
        this.BulletedSummary = BulletedSummary;
        return this;
    }

    /**
     */
    public AIScoreInsightUnit[] AIScore;
    public AIInsights AIScore(AIScoreInsightUnit[] AIScore)
    {
        this.AIScore = AIScore;
        return this;
    }

    /**
     */
    public CallNotesInsightUnit[] CallNotes;
    public AIInsights CallNotes(CallNotesInsightUnit[] CallNotes)
    {
        this.CallNotes = CallNotes;
        return this;
    }

    /**
     */
    public SentimentInsightUnit[] Sentiment;
    public AIInsights Sentiment(SentimentInsightUnit[] Sentiment)
    {
        this.Sentiment = Sentiment;
        return this;
    }
}