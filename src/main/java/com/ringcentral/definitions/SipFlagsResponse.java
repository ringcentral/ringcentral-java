package com.ringcentral.definitions;


    /**
* SIP flags information
*/
public class SipFlagsResponse
{
    /**
     * Indicates that VoIP calling feature is enabled
     */
    public Boolean voipFeatureEnabled;
    public SipFlagsResponse voipFeatureEnabled(Boolean voipFeatureEnabled)
    {
        this.voipFeatureEnabled = voipFeatureEnabled;
        return this;
    }

    /**
     * Indicates that the request is sent from IP address of a country where VoIP calling is disallowed
     */
    public Boolean voipCountryBlocked;
    public SipFlagsResponse voipCountryBlocked(Boolean voipCountryBlocked)
    {
        this.voipCountryBlocked = voipCountryBlocked;
        return this;
    }

    /**
     * Indicates that outbound calls are enabled
     */
    public Boolean outboundCallsEnabled;
    public SipFlagsResponse outboundCallsEnabled(Boolean outboundCallsEnabled)
    {
        this.outboundCallsEnabled = outboundCallsEnabled;
        return this;
    }

    /**
     */
    public Boolean dscpEnabled;
    public SipFlagsResponse dscpEnabled(Boolean dscpEnabled)
    {
        this.dscpEnabled = dscpEnabled;
        return this;
    }

    /**
     * Format: int32
     */
    public Long dscpSignaling;
    public SipFlagsResponse dscpSignaling(Long dscpSignaling)
    {
        this.dscpSignaling = dscpSignaling;
        return this;
    }

    /**
     * Format: int32
     */
    public Long dscpVoice;
    public SipFlagsResponse dscpVoice(Long dscpVoice)
    {
        this.dscpVoice = dscpVoice;
        return this;
    }

    /**
     * Format: int32
     */
    public Long dscpVideo;
    public SipFlagsResponse dscpVideo(Long dscpVideo)
    {
        this.dscpVideo = dscpVideo;
        return this;
    }
}