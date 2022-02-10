package com.ringcentral.definitions;


/**
 * SIP flags data
 */
public class SIPFlagsResponse {
    /**
     * If &#039;True&#039; VoIP calling feature is enabled
     * Enum: True, False
     */
    public String voipFeatureEnabled;
    /**
     * If &#039;True&#039; the request is sent from IP address of a country blocked for VoIP calling
     * Enum: True, False
     */
    public String voipCountryBlocked;
    /**
     * If &#039;True&#039; outbound calls are enabled
     * Enum: True, False
     */
    public String outboundCallsEnabled;
    /**
     *
     */
    public Boolean dscpEnabled;
    /**
     *
     */
    public Long dscpSignaling;
    /**
     *
     */
    public Long dscpVoice;
    /**
     *
     */
    public Long dscpVideo;

    public SIPFlagsResponse voipFeatureEnabled(String voipFeatureEnabled) {
        this.voipFeatureEnabled = voipFeatureEnabled;
        return this;
    }

    public SIPFlagsResponse voipCountryBlocked(String voipCountryBlocked) {
        this.voipCountryBlocked = voipCountryBlocked;
        return this;
    }

    public SIPFlagsResponse outboundCallsEnabled(String outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
        return this;
    }

    public SIPFlagsResponse dscpEnabled(Boolean dscpEnabled) {
        this.dscpEnabled = dscpEnabled;
        return this;
    }

    public SIPFlagsResponse dscpSignaling(Long dscpSignaling) {
        this.dscpSignaling = dscpSignaling;
        return this;
    }

    public SIPFlagsResponse dscpVoice(Long dscpVoice) {
        this.dscpVoice = dscpVoice;
        return this;
    }

    public SIPFlagsResponse dscpVideo(Long dscpVideo) {
        this.dscpVideo = dscpVideo;
        return this;
    }
}
