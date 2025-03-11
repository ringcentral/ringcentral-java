package com.ringcentral.definitions;


/**
 * Query parameters for operation getSessionInsights
 */
public class GetSessionInsightsParameters {
    /**
     * AI Insight Types
     * Enum: NextSteps, Transcript, Summary, Highlights, BulletedSummary, AIScore, CallNotes
     */
    public String[] insightTypes;

    public GetSessionInsightsParameters insightTypes(String[] insightTypes) {
        this.insightTypes = insightTypes;
        return this;
    }
}
