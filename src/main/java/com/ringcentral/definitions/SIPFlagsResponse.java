package com.ringcentral.definitions;


/**
 * SIP flags information
 */
public class SipFlagsResponse {
    /**
     * Indicates that VoIP calling feature is enabled
     */
    public Boolean voipFeatureEnabled;
    /**
     * Indicates that the request is sent from IP address of a country where VoIP calling is disallowed
     */
    public Boolean voipCountryBlocked;
    /**
     * Indicates that outbound calls are enabled
     */
    public Boolean outboundCallsEnabled;
    /**
     *
     */
    public Boolean dscpEnabled;
    /**
     * Format: int32
     */
    public Long dscpSignaling;
    /**
     * Format: int32
     */
    public Long dscpVoice;
    /**
     * Format: int32
     */
    public Long dscpVideo;

    public SipFlagsResponse voipFeatureEnabled(Boolean voipFeatureEnabled) {
        this.voipFeatureEnabled = voipFeatureEnabled;
        return this;
    }

    public SipFlagsResponse voipCountryBlocked(Boolean voipCountryBlocked) {
        this.voipCountryBlocked = voipCountryBlocked;
        return this;
    }

    public SipFlagsResponse outboundCallsEnabled(Boolean outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
        return this;
    }

    public SipFlagsResponse dscpEnabled(Boolean dscpEnabled) {
        this.dscpEnabled = dscpEnabled;
        return this;
    }

    public SipFlagsResponse dscpSignaling(Long dscpSignaling) {
        this.dscpSignaling = dscpSignaling;
        return this;
    }

    public SipFlagsResponse dscpVoice(Long dscpVoice) {
        this.dscpVoice = dscpVoice;
        return this;
    }

    public SipFlagsResponse dscpVideo(Long dscpVideo) {
        this.dscpVideo = dscpVideo;
        return this;
    }
}
