package com.ringcentral.definitions;


/**
 * Query parameters for operation readUserCallRecord
 */
public class ReadUserCallRecordParameters {
    /**
     * Defines the level of details for returned call records
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;

    public ReadUserCallRecordParameters view(String view) {
        this.view = view;
        return this;
    }
}
