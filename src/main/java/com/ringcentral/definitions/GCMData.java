package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GCMData
{
    // Event filter URI
    public String event;
    public GCMData event(String event) {
        this.event = event;
        return this;
    }
    // Internal identifier of a subscription
    public String subscriptionId;
    public GCMData subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    // The datetime of a call action in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String timestamp;
    public GCMData timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    // Internal identifier of an extension
    public String extensionId;
    public GCMData extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    // Calling action, for example 'StartRing'
    public String action;
    public GCMData action(String action) {
        this.action = action;
        return this;
    }
    // Identifier of a call session
    public String sessionId;
    public GCMData sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    // Identifier of a server
    public String serverId;
    public GCMData serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    // Phone number of a caller
    public String _from;
    public GCMData _from(String _from) {
        this._from = _from;
        return this;
    }
    // Caller name
    public String fromName;
    public GCMData fromName(String fromName) {
        this.fromName = fromName;
        return this;
    }
    // Phone number of a callee
    public String to;
    public GCMData to(String to) {
        this.to = to;
        return this;
    }
    // Callee name
    public String toName;
    public GCMData toName(String toName) {
        this.toName = toName;
        return this;
    }
    // Unique identifier of a session
    public String sid;
    public GCMData sid(String sid) {
        this.sid = sid;
        return this;
    }
    // SIP proxy registration name
    public String toUrl;
    public GCMData toUrl(String toUrl) {
        this.toUrl = toUrl;
        return this;
    }
    // User data
    public String srvLvl;
    public GCMData srvLvl(String srvLvl) {
        this.srvLvl = srvLvl;
        return this;
    }
    // User data
    public String srvLvlExt;
    public GCMData srvLvlExt(String srvLvlExt) {
        this.srvLvlExt = srvLvlExt;
        return this;
    }
}
