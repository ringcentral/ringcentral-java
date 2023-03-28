package com.ringcentral.definitions;


public class CustomFieldsResource {
    /**
     *
     */
    public CustomFieldResource[] records;

    public CustomFieldsResource records(CustomFieldResource[] records) {
        this.records = records;
        return this;
    }
}
