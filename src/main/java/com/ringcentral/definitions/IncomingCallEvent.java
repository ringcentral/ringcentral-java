package com.ringcentral.definitions;


public class IncomingCallEvent {
    /**
     * Apple Push Notification Service Info
     */
    public APSInfo aps;
    /**
     * Event filter URI
     */
    public String event;
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    /**
     * The datetime of a call action in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String timestamp;
    /**
     * Internal identifier of an extension
     * Default: ~
     */
    public String extensionId;
    /**
     * Calling action, for example 'StartRing'
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
     * Phone number of a caller. For GCM transport type '_from' property should be used
     */
    public String from;
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
    /**
     * File containing recorded caller name
     */
    public String recUrl;
    /**
     * Notification lifetime value in seconds, the default value is 30 seconds
     */
    public Long pn_ttl;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public IncomingCallEvent aps(APSInfo aps) {
        this.aps = aps;
        return this;
    }

    public IncomingCallEvent event(String event) {
        this.event = event;
        return this;
    }

    public IncomingCallEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public IncomingCallEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public IncomingCallEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public IncomingCallEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public IncomingCallEvent action(String action) {
        this.action = action;
        return this;
    }

    public IncomingCallEvent sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public IncomingCallEvent serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public IncomingCallEvent from(String from) {
        this.from = from;
        return this;
    }

    public IncomingCallEvent fromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public IncomingCallEvent to(String to) {
        this.to = to;
        return this;
    }

    public IncomingCallEvent toName(String toName) {
        this.toName = toName;
        return this;
    }

    public IncomingCallEvent sid(String sid) {
        this.sid = sid;
        return this;
    }

    public IncomingCallEvent toUrl(String toUrl) {
        this.toUrl = toUrl;
        return this;
    }

    public IncomingCallEvent srvLvl(String srvLvl) {
        this.srvLvl = srvLvl;
        return this;
    }

    public IncomingCallEvent srvLvlExt(String srvLvlExt) {
        this.srvLvlExt = srvLvlExt;
        return this;
    }

    public IncomingCallEvent recUrl(String recUrl) {
        this.recUrl = recUrl;
        return this;
    }

    public IncomingCallEvent pn_ttl(Long pn_ttl) {
        this.pn_ttl = pn_ttl;
        return this;
    }

    public IncomingCallEvent ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
