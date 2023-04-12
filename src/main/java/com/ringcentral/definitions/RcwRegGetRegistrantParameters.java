package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwRegGetRegistrant
 */
public class RcwRegGetRegistrantParameters {
    /**
     * Indicates if registrant&#039;s &quot;questionnaire&quot; should be returned
     */
    public Boolean includeQuestionnaire;

    public RcwRegGetRegistrantParameters includeQuestionnaire(Boolean includeQuestionnaire) {
        this.includeQuestionnaire = includeQuestionnaire;
        return this;
    }
}
