package com.ringcentral.definitions;


public class CommCallTypesResource {
    /**
     * Required
     */
    public Boolean queueCallsIncluded;

    public CommCallTypesResource queueCallsIncluded(Boolean queueCallsIncluded) {
        this.queueCallsIncluded = queueCallsIncluded;
        return this;
    }
}
