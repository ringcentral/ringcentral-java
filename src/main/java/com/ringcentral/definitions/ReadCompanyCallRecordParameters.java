package com.ringcentral.definitions;


// Query parameters for operation readCompanyCallRecord
public class ReadCompanyCallRecordParameters {
    /**
     * View of call records. The view value specified for &#039;FSync&#039; will also be applied for &#039;ISync&#039; by default, since it cannot be changed for ISync
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;

    public ReadCompanyCallRecordParameters view(String view) {
        this.view = view;
        return this;
    }
}
