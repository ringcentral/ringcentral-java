package com.ringcentral.definitions;


// GCM data
public class GCMData {
    /**
     * Event filter URI
     */
    public String event;
    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    /**
     * The datetime of a call action in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String timestamp;
    /**
     * Internal identifier of an extension
     * Default: ~
     */
    public String extensionId;
    /**
     * Calling action, for example &#039;StartRing&#039;
     */
    public String action;
    /**
     * Identifier of a call session
     */
    public String sessionId;
    /**
     * Identifier of a server
     */
    public String serverId;
    /**
     * Phone number of a caller
     */
    public String _from;
    /**
     * Caller name
     */
    public String fromName;
    /**
     * Phone number of a callee
     */
    public String to;
    /**
     * Callee name
     */
    public String toName;
    /**
     * Unique identifier of a session
     */
    public String sid;
    /**
     * SIP proxy registration name
     */
    public String toUrl;
    /**
     * User data
     */
    public String srvLvl;
    /**
     * User data
     */
    public String srvLvlExt;

    public GCMData event(String event) {
        this.event = event;
        return this;
    }

    public GCMData subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public GCMData timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public GCMData extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public GCMData action(String action) {
        this.action = action;
        return this;
    }

    public GCMData sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public GCMData serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public GCMData _from(String _from) {
        this._from = _from;
        return this;
    }

    public GCMData fromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public GCMData to(String to) {
        this.to = to;
        return this;
    }

    public GCMData toName(String toName) {
        this.toName = toName;
        return this;
    }

    public GCMData sid(String sid) {
        this.sid = sid;
        return this;
    }

    public GCMData toUrl(String toUrl) {
        this.toUrl = toUrl;
        return this;
    }

    public GCMData srvLvl(String srvLvl) {
        this.srvLvl = srvLvl;
        return this;
    }

    public GCMData srvLvlExt(String srvLvlExt) {
        this.srvLvlExt = srvLvlExt;
        return this;
    }
}
