package com.ringcentral.definitions;


public class CommIntegrationRequest {
    /**
     * Integration type
     * Required
     * Enum: MsTeamsDirectRouting, FmcLite
     */
    public String type;

    public CommIntegrationRequest type(String type) {
        this.type = type;
        return this;
    }
}
