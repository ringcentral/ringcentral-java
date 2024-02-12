package com.ringcentral.definitions;


public class BridgeResponse {
    /**
     * Unique bridge identifier
     * Example: iad41-c04-ndb256065cf14ae6a1832389d9c2e
     */
    public String id;
    /**
     * Custom name of a bridge
     * Example: Weekly Meeting with Joseph
     */
    public String name;
    /**
     * Type of bridge. It specifies bridge life cycle.
     * 1) Instant - The bridge will be used for a meeting only once immediately after creation. Then it will be deleted.
     * 2) Scheduled - The bridge will be used for scheduled one or more meetings. If the bridge is not used for a long
     * time after the last meeting, then it will be deleted.
     * 3) PMI - The bridge will contain Personal Meeting Identifier owned by a user. It is the default user bridge.
     * Each user may have only one default (PMI) bridge. Such bridge will be deleted only in case the user is deleted
     * from the system.
     * Example: Instant
     * Enum: Instant, Scheduled, PMI
     */
    public String type;
    /**
     *
     */
    public User host;
    /**
     *
     */
    public BridgePinsWithAliases pins;
    /**
     *
     */
    public BridgeResponseSecurity security;
    /**
     *
     */
    public BridgePreferences preferences;
    /**
     *
     */
    public BridgeDiscovery discovery;

    public BridgeResponse id(String id) {
        this.id = id;
        return this;
    }

    public BridgeResponse name(String name) {
        this.name = name;
        return this;
    }

    public BridgeResponse type(String type) {
        this.type = type;
        return this;
    }

    public BridgeResponse host(User host) {
        this.host = host;
        return this;
    }

    public BridgeResponse pins(BridgePinsWithAliases pins) {
        this.pins = pins;
        return this;
    }

    public BridgeResponse security(BridgeResponseSecurity security) {
        this.security = security;
        return this;
    }

    public BridgeResponse preferences(BridgePreferences preferences) {
        this.preferences = preferences;
        return this;
    }

    public BridgeResponse discovery(BridgeDiscovery discovery) {
        this.discovery = discovery;
        return this;
    }
}
