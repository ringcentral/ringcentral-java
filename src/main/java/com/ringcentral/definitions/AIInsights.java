package com.ringcentral.definitions;


public class AIInsights {
    /**
     *
     */
    public TranscriptInsightUnit[] Transcript;
    /**
     *
     */
    public SummaryInsightUnit[] Summary;
    /**
     *
     */
    public HighlightsInsightUnit[] Highlights;
    /**
     *
     */
    public NextStepsInsightUnit[] NextSteps;
    /**
     *
     */
    public BulletedSummaryInsightUnit[] BulletedSummary;
    /**
     *
     */
    public AIScoreInsightUnit[] AIScore;

    public AIInsights Transcript(TranscriptInsightUnit[] Transcript) {
        this.Transcript = Transcript;
        return this;
    }

    public AIInsights Summary(SummaryInsightUnit[] Summary) {
        this.Summary = Summary;
        return this;
    }

    public AIInsights Highlights(HighlightsInsightUnit[] Highlights) {
        this.Highlights = Highlights;
        return this;
    }

    public AIInsights NextSteps(NextStepsInsightUnit[] NextSteps) {
        this.NextSteps = NextSteps;
        return this;
    }

    public AIInsights BulletedSummary(BulletedSummaryInsightUnit[] BulletedSummary) {
        this.BulletedSummary = BulletedSummary;
        return this;
    }

    public AIInsights AIScore(AIScoreInsightUnit[] AIScore) {
        this.AIScore = AIScore;
        return this;
    }
}
