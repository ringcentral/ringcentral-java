package com.ringcentral.definitions;


/**
 * Call metadata.
 */
public class MetaData {
    /**
     * Identifier of metadata category
     * Required
     */
    public MetaDataValues[] values;

    public MetaData values(MetaDataValues[] values) {
        this.values = values;
        return this;
    }
}
