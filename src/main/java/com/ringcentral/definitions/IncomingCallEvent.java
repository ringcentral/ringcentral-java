package com.ringcentral.definitions;


public class IncomingCallEvent
{
    /**
     */
    public APSInfo aps;
    public IncomingCallEvent aps(APSInfo aps)
    {
        this.aps = aps;
        return this;
    }

    /**
     * Event filter name
     */
    public String event;
    public IncomingCallEvent event(String event)
    {
        this.event = event;
        return this;
    }

    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    public IncomingCallEvent uuid(String uuid)
    {
        this.uuid = uuid;
        return this;
    }

    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    public IncomingCallEvent subscriptionId(String subscriptionId)
    {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * The timestamp of a call action in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String timestamp;
    public IncomingCallEvent timestamp(String timestamp)
    {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    public IncomingCallEvent extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Calling action, for example &#039;StartRing&#039;
     */
    public String action;
    public IncomingCallEvent action(String action)
    {
        this.action = action;
        return this;
    }

    /**
     * Identifier of a call session
     */
    public String sessionId;
    public IncomingCallEvent sessionId(String sessionId)
    {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Identifier of a server
     */
    public String serverId;
    public IncomingCallEvent serverId(String serverId)
    {
        this.serverId = serverId;
        return this;
    }

    /**
     * Phone number of a caller. For GCM transport type &#039;_from&#039; property should be used
     */
    public String from;
    public IncomingCallEvent from(String from)
    {
        this.from = from;
        return this;
    }

    /**
     * Caller name
     */
    public String fromName;
    public IncomingCallEvent fromName(String fromName)
    {
        this.fromName = fromName;
        return this;
    }

    /**
     * Phone number of a callee
     */
    public String to;
    public IncomingCallEvent to(String to)
    {
        this.to = to;
        return this;
    }

    /**
     * Callee name
     */
    public String toName;
    public IncomingCallEvent toName(String toName)
    {
        this.toName = toName;
        return this;
    }

    /**
     * Unique identifier of a session
     */
    public String sid;
    public IncomingCallEvent sid(String sid)
    {
        this.sid = sid;
        return this;
    }

    /**
     * SIP proxy registration name
     */
    public String toUrl;
    public IncomingCallEvent toUrl(String toUrl)
    {
        this.toUrl = toUrl;
        return this;
    }

    /**
     * User data
     */
    public String srvLvl;
    public IncomingCallEvent srvLvl(String srvLvl)
    {
        this.srvLvl = srvLvl;
        return this;
    }

    /**
     * User data
     */
    public String srvLvlExt;
    public IncomingCallEvent srvLvlExt(String srvLvlExt)
    {
        this.srvLvlExt = srvLvlExt;
        return this;
    }

    /**
     * File containing recorded caller name
     */
    public String recUrl;
    public IncomingCallEvent recUrl(String recUrl)
    {
        this.recUrl = recUrl;
        return this;
    }

    /**
     * Notification lifetime value in seconds, the default value is 30 seconds
     * Format: int32
     */
    public Long pn_ttl;
    public IncomingCallEvent pn_ttl(Long pn_ttl)
    {
        this.pn_ttl = pn_ttl;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    public IncomingCallEvent ownerId(String ownerId)
    {
        this.ownerId = ownerId;
        return this;
    }
}