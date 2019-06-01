package com.ringcentral.definitions;


public class MissedCallEvent {
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    /**
     * APNS service info
     */
    public APNSInfo pn_apns;
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

    public MissedCallEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public MissedCallEvent pn_apns(APNSInfo pn_apns) {
        this.pn_apns = pn_apns;
        return this;
    }

    public MissedCallEvent event(String event) {
        this.event = event;
        return this;
    }

    public MissedCallEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public MissedCallEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public MissedCallEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public MissedCallEvent action(String action) {
        this.action = action;
        return this;
    }

    public MissedCallEvent sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public MissedCallEvent serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public MissedCallEvent from(String from) {
        this.from = from;
        return this;
    }

    public MissedCallEvent fromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public MissedCallEvent to(String to) {
        this.to = to;
        return this;
    }

    public MissedCallEvent toName(String toName) {
        this.toName = toName;
        return this;
    }

    public MissedCallEvent sid(String sid) {
        this.sid = sid;
        return this;
    }

    public MissedCallEvent toUrl(String toUrl) {
        this.toUrl = toUrl;
        return this;
    }

    public MissedCallEvent srvLvl(String srvLvl) {
        this.srvLvl = srvLvl;
        return this;
    }

    public MissedCallEvent srvLvlExt(String srvLvlExt) {
        this.srvLvlExt = srvLvlExt;
        return this;
    }

    public MissedCallEvent recUrl(String recUrl) {
        this.recUrl = recUrl;
        return this;
    }

    public MissedCallEvent pn_ttl(Long pn_ttl) {
        this.pn_ttl = pn_ttl;
        return this;
    }

    public MissedCallEvent ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
