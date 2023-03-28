package com.ringcentral.definitions;


public class UpdateBridgeRequest {
    /**
     * Custom name of a bridge
     * Example: Weekly Meeting with Joseph
     */
    public String name;
    /**
     *
     */
    public BridgePinsWithoutPstn pins;
    /**
     *
     */
    public BridgeRequestSecurity security;
    /**
     *
     */
    public BridgePreferences preferences;

    public UpdateBridgeRequest name(String name) {
        this.name = name;
        return this;
    }

    public UpdateBridgeRequest pins(BridgePinsWithoutPstn pins) {
        this.pins = pins;
        return this;
    }

    public UpdateBridgeRequest security(BridgeRequestSecurity security) {
        this.security = security;
        return this;
    }

    public UpdateBridgeRequest preferences(BridgePreferences preferences) {
        this.preferences = preferences;
        return this;
    }
}
