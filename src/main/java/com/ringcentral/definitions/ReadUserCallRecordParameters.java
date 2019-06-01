package com.ringcentral.definitions;


public class ReadUserCallRecordParameters {
    /**
     * View of call records. The same view parameter specified for FSync will be applied for ISync, the view cannot be changed for ISync
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;

    public ReadUserCallRecordParameters view(String view) {
        this.view = view;
        return this;
    }

}
