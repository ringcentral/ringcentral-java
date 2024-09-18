package com.ringcentral.definitions;


public class MetaDataValues {
    /**
     * Unique identifier
     */
    public String id;
    /**
     * Value
     */
    public String value;

    public MetaDataValues id(String id) {
        this.id = id;
        return this;
    }

    public MetaDataValues value(String value) {
        this.value = value;
        return this;
    }
}
