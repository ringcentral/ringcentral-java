package com.ringcentral.definitions;


public class CustomFieldList {
    /**
     *
     */
    public CustomFieldModel[] records;

    public CustomFieldList records(CustomFieldModel[] records) {
        this.records = records;
        return this;
    }
}
