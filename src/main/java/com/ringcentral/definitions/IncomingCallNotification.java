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
}
