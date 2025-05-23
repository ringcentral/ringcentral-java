package com.ringcentral.definitions;


public class CreateBridgeRequest {
    /**
     * Custom name of a bridge
     * Example: Weekly Meeting with Joseph
     */
    public String name;
    /**
     * Type of a bridge. It specifies the bridge life cycle.
     * 1) `Instant` - The bridge will be used for a meeting only once immediately after creation. Then it will be deleted.
     * 2) `Scheduled` - The bridge will be used for one or more scheduled meetings. If the bridge is not used for a long
     * time after the last meeting, then it will be deleted.
     * 3) `PMI` - The bridge will contain Personal Meeting Identifier owned by a user. It is the default user bridge.
     * Each user may have only one default (PMI) bridge. Such bridge will be deleted only in case the user is deleted
     * from the system.
     * Example: Instant
     * Enum: Instant, Scheduled, PMI
     */
    public String type;
    /**
     *
     */
    public BridgePins pins;
    /**
     *
     */
    public BridgeRequestSecurity security;
    /**
     *
     */
    public BridgePreferences preferences;

    public CreateBridgeRequest name(String name) {
        this.name = name;
        return this;
    }

    public CreateBridgeRequest type(String type) {
        this.type = type;
        return this;
    }

    public CreateBridgeRequest pins(BridgePins pins) {
        this.pins = pins;
        return this;
    }

    public CreateBridgeRequest security(BridgeRequestSecurity security) {
        this.security = security;
        return this;
    }

    public CreateBridgeRequest preferences(BridgePreferences preferences) {
        this.preferences = preferences;
        return this;
    }
}
