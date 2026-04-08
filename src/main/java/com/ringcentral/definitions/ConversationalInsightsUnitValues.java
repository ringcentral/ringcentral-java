package com.ringcentral.definitions;

public class ConversationalInsightsUnitValues {
    /** Format: float Example: 0.97 */
    public Double confidence;

    public ConversationalInsightsUnitValues confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /** Required Example: RingCentral */
    public String value;

    public ConversationalInsightsUnitValues value(String value) {
        this.value = value;
        return this;
    }

    /** Required Format: float Example: 4.7 */
    public Double start;

    public ConversationalInsightsUnitValues start(Double start) {
        this.start = start;
        return this;
    }

    /** Required Format: float Example: 5.1 */
    public Double end;

    public ConversationalInsightsUnitValues end(Double end) {
        this.end = end;
        return this;
    }

    /** Paragraph index of the long summary. Example: 0 */
    public String groupId;

    public ConversationalInsightsUnitValues groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** Example: JohnDoe */
    public String speakerId;

    public ConversationalInsightsUnitValues speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    /** Example: Speaker */
    public String assignee;

    public ConversationalInsightsUnitValues assignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /** Example: NextStep */
    public String category;

    public ConversationalInsightsUnitValues category(String category) {
        this.category = category;
        return this;
    }

    /** Example: All right, now let us go down to a CD settings. */
    public String text;

    public ConversationalInsightsUnitValues text(String text) {
        this.text = text;
        return this;
    }

    /** Example: So so you want me to add it to the B D as well? */
    public String question;

    public ConversationalInsightsUnitValues question(String question) {
        this.question = question;
        return this;
    }

    /** Example: Or or you can add another tab and have it resigned. */
    public String answer;

    public ConversationalInsightsUnitValues answer(String answer) {
        this.answer = answer;
        return this;
    }
}
