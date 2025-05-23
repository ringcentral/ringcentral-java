package com.ringcentral.definitions;


public class CommReferenceStateResource {
    /**
     * Id/Type of a state the rule is based on
     * Required
     * Enum: work-hours, after-hours
     */
    public String id;

    public CommReferenceStateResource id(String id) {
        this.id = id;
        return this;
    }
}
