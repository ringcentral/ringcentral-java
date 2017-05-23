package com.ringcentral.definitions;

public class IncomingCallNotification {
    // Event filter URI
    public String event;
    // Universally unique identifier of a notification
    public String uuid;
    // Internal identifier of a subscription
    public String subscriptionId;
    // The datetime of a call action in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String timestamp;
    // Internal identifier of an extension
    public String extensionId;
    // Calling action, for example 'StartRing'
    public String action;
    // Identifier of a call session
    public String sessionId;
    // Identifier of a server
    public String serverId;
    // Phone number of a caller
    public String from;
    // Caller name
    public String fromName;
    // Phone number of a callee
    public String to;
    // Callee name
    public String toName;
    // Unique identifier of a session
    public String sid;
    // SIP proxy registration name
    public String toUrl;
    // User data
    public String srvLvl;
    // User data
    public String srvLvlExt;
    // File containing recorded caller name
    public String recUrl;

    public IncomingCallNotification event(String event) {
        this.event = event;
        return this;
    }

    public IncomingCallNotification uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public IncomingCallNotification subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public IncomingCallNotification timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public IncomingCallNotification extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public IncomingCallNotification action(String action) {
        this.action = action;
        return this;
    }

    public IncomingCallNotification sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public IncomingCallNotification serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public IncomingCallNotification from(String from) {
        this.from = from;
        return this;
    }

    public IncomingCallNotification fromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public IncomingCallNotification to(String to) {
        this.to = to;
        return this;
    }

    public IncomingCallNotification toName(String toName) {
        this.toName = toName;
        return this;
    }

    public IncomingCallNotification sid(String sid) {
        this.sid = sid;
        return this;
    }

    public IncomingCallNotification toUrl(String toUrl) {
        this.toUrl = toUrl;
        return this;
    }

    public IncomingCallNotification srvLvl(String srvLvl) {
        this.srvLvl = srvLvl;
        return this;
    }

    public IncomingCallNotification srvLvlExt(String srvLvlExt) {
        this.srvLvlExt = srvLvlExt;
        return this;
    }

    public IncomingCallNotification recUrl(String recUrl) {
        this.recUrl = recUrl;
        return this;
    }
}
