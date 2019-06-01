package com.ringcentral.definitions;


public class AssistantsResource {
    /**
     *
     */
    public AssistantResource[] records;

    public AssistantsResource records(AssistantResource[] records) {
        this.records = records;
        return this;
    }

}
