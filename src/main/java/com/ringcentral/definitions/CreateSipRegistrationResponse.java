package com.ringcentral.definitions;


public class CreateSipRegistrationResponse {
    /**
     * Suggested interval in seconds to periodically call SIP-provision API and update the local cache
     */
    public Long pollingInterval;
    /**
     *
     */
    public String[] sipErrorCodes;
    /**
     * SIP settings for device
     * Required
     */
    public SIPInfoResponse[] sipInfo;
    /**
     * SIP flags data
     * Required
     */
    public SIPFlagsResponse[] sipFlags;

    public CreateSipRegistrationResponse pollingInterval(Long pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }

    public CreateSipRegistrationResponse sipErrorCodes(String[] sipErrorCodes) {
        this.sipErrorCodes = sipErrorCodes;
        return this;
    }

    public CreateSipRegistrationResponse sipInfo(SIPInfoResponse[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }

    public CreateSipRegistrationResponse sipFlags(SIPFlagsResponse[] sipFlags) {
        this.sipFlags = sipFlags;
        return this;
    }

}
