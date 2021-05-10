package com.ringcentral.definitions;


// Query parameters for operation readUserCallRecord
public class ReadUserCallRecordParameters {
    /**
     * View of call records. The view value specified for 'FSync' will also be applied for 'ISync' by default, since it cannot be changed for ISync
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;

    public ReadUserCallRecordParameters view(String view) {
        this.view = view;
        return this;
    }
}
