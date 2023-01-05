package com.ringcentral.definitions;


public class MissedCallEvent
{
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    public MissedCallEvent uuid(String uuid)
    {
        this.uuid = uuid;
        return this;
    }

    /**
     */
    public APNSInfo pn_apns;
    public MissedCallEvent pn_apns(APNSInfo pn_apns)
    {
        this.pn_apns = pn_apns;
        return this;
    }

    /**
     * Event filter name
     */
    public String event;
    public MissedCallEvent event(String event)
    {
        this.event = event;
        return this;
    }

    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    public MissedCallEvent subscriptionId(String subscriptionId)
    {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * The timestamp of a call action in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String timestamp;
    public MissedCallEvent timestamp(String timestamp)
    {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    public MissedCallEvent extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Calling action, for example &#039;StartRing&#039;
     */
    public String action;
    public MissedCallEvent action(String action)
    {
        this.action = action;
        return this;
    }

    /**
     * Identifier of a call session
     */
    public String sessionId;
    public MissedCallEvent sessionId(String sessionId)
    {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Identifier of a server
     */
    public String serverId;
    public MissedCallEvent serverId(String serverId)
    {
        this.serverId = serverId;
        return this;
    }

    /**
     * Phone number of a caller. For GCM transport type &#039;_from&#039; property should be used
     */
    public String from;
    public MissedCallEvent from(String from)
    {
        this.from = from;
        return this;
    }

    /**
     * Caller name
     */
    public String fromName;
    public MissedCallEvent fromName(String fromName)
    {
        this.fromName = fromName;
        return this;
    }

    /**
     * Phone number of a callee
     */
    public String to;
    public MissedCallEvent to(String to)
    {
        this.to = to;
        return this;
    }

    /**
     * Callee name
     */
    public String toName;
    public MissedCallEvent toName(String toName)
    {
        this.toName = toName;
        return this;
    }

    /**
     * Unique identifier of a session
     */
    public String sid;
    public MissedCallEvent sid(String sid)
    {
        this.sid = sid;
        return this;
    }

    /**
     * SIP proxy registration name
     */
    public String toUrl;
    public MissedCallEvent toUrl(String toUrl)
    {
        this.toUrl = toUrl;
        return this;
    }

    /**
     * User data
     */
    public String srvLvl;
    public MissedCallEvent srvLvl(String srvLvl)
    {
        this.srvLvl = srvLvl;
        return this;
    }

    /**
     * User data
     */
    public String srvLvlExt;
    public MissedCallEvent srvLvlExt(String srvLvlExt)
    {
        this.srvLvlExt = srvLvlExt;
        return this;
    }

    /**
     * File containing recorded caller name
     */
    public String recUrl;
    public MissedCallEvent recUrl(String recUrl)
    {
        this.recUrl = recUrl;
        return this;
    }

    /**
     * Notification lifetime value in seconds, the default value is 30 seconds
     * Format: int32
     */
    public Long pn_ttl;
    public MissedCallEvent pn_ttl(Long pn_ttl)
    {
        this.pn_ttl = pn_ttl;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    public MissedCallEvent ownerId(String ownerId)
    {
        this.ownerId = ownerId;
        return this;
    }
}