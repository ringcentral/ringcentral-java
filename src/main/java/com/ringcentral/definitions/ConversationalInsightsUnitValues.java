package com.ringcentral.definitions;


public class ConversationalInsightsUnitValues {
    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    /**
     * Required
     * Example: RingCentral
     */
    public String value;
    /**
     * Required
     * Format: float
     * Example: 4.7
     */
    public Double start;
    /**
     * Required
     * Format: float
     * Example: 5.1
     */
    public Double end;
    /**
     * Paragraph index of the long summary.
     * Example: 0
     */
    public String groupId;
    /**
     * Example: JohnDoe
     */
    public String speakerId;
    /**
     * Example: Speaker
     */
    public String assignee;
    /**
     * Example: NextStep
     */
    public String category;
    /**
     * Example: All right, now let us go down to a CD settings.
     */
    public String text;
    /**
     * Example: So so you want me to add it to the B D as well?
     */
    public String question;
    /**
     * Example: Or or you can add another tab and have it resigned.
     */
    public String answer;

    public ConversationalInsightsUnitValues confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public ConversationalInsightsUnitValues value(String value) {
        this.value = value;
        return this;
    }

    public ConversationalInsightsUnitValues start(Double start) {
        this.start = start;
        return this;
    }

    public ConversationalInsightsUnitValues end(Double end) {
        this.end = end;
        return this;
    }

    public ConversationalInsightsUnitValues groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public ConversationalInsightsUnitValues speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    public ConversationalInsightsUnitValues assignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    public ConversationalInsightsUnitValues category(String category) {
        this.category = category;
        return this;
    }

    public ConversationalInsightsUnitValues text(String text) {
        this.text = text;
        return this;
    }

    public ConversationalInsightsUnitValues question(String question) {
        this.question = question;
        return this;
    }

    public ConversationalInsightsUnitValues answer(String answer) {
        this.answer = answer;
        return this;
    }
}
