package com.ringcentral.definitions;


public class UpdateBridgeRequest
{
    /**
     * Custom name of a bridge
     * Example: Weekly Meeting with Joseph
     */
    public String name;
    public UpdateBridgeRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public BridgePinsWithoutPstn pins;
    public UpdateBridgeRequest pins(BridgePinsWithoutPstn pins)
    {
        this.pins = pins;
        return this;
    }

    /**
     */
    public BridgeRequestSecurity security;
    public UpdateBridgeRequest security(BridgeRequestSecurity security)
    {
        this.security = security;
        return this;
    }

    /**
     */
    public BridgePreferences preferences;
    public UpdateBridgeRequest preferences(BridgePreferences preferences)
    {
        this.preferences = preferences;
        return this;
    }
}