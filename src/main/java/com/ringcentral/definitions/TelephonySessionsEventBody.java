package com.ringcentral.definitions;


/**
 * Notification payload body
 */
public class TelephonySessionsEventBody {
    /**
     * Order number of a notification to state the chronology
     * Format: int64
     */
    public Long sequence;
    /**
     * Legacy identifier of a call session
     */
    public String sessionId;
    /**
     * Call session identifier, required for Telephony API
     */
    public String telephonySessionId;
    /**
     * Identifier of a server
     */
    public String serverId;
    /**
     * The call start datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String eventTime;
    /**
     *
     */
    public OriginInfo origin;
    /**
     * Call participants details
     */
    public TelephonySessionsEventPartyInfo[] parties;

    public TelephonySessionsEventBody sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    public TelephonySessionsEventBody sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public TelephonySessionsEventBody telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public TelephonySessionsEventBody serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public TelephonySessionsEventBody eventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public TelephonySessionsEventBody origin(OriginInfo origin) {
        this.origin = origin;
        return this;
    }

    public TelephonySessionsEventBody parties(TelephonySessionsEventPartyInfo[] parties) {
        this.parties = parties;
        return this;
    }
}
