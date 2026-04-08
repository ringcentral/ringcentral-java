package com.ringcentral.definitions;

public class RSConversationalInsightsUnit {
    /** Participant ID Required Example: p-32423 */
    public String speakerId;

    public RSConversationalInsightsUnit speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    /** Value of the insight Required Example: conversational insights text */
    public String value;

    public RSConversationalInsightsUnit value(String value) {
        this.value = value;
        return this;
    }

    /** Start time of the insight (in sec) Required Format: float Example: 1.2 */
    public Double start;

    public RSConversationalInsightsUnit start(Double start) {
        this.start = start;
        return this;
    }

    /** End time of the insight (in sec) Required Format: float Example: 4.2 */
    public Double end;

    public RSConversationalInsightsUnit end(Double end) {
        this.end = end;
        return this;
    }
}
