package com.ringcentral.definitions;


/**
 * Query parameters for operation getRecordingInsights
 */
public class GetRecordingInsightsParameters {
    /**
     * AI Insight Types
     * Enum: NextSteps, Transcript, Summary, Highlights, BulletedSummary, AIScore, CallNotes
     */
    public String[] insightTypes;

    public GetRecordingInsightsParameters insightTypes(String[] insightTypes) {
        this.insightTypes = insightTypes;
        return this;
    }
}
