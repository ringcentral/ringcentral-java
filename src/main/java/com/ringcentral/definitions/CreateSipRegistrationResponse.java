package com.ringcentral.definitions;


public class CreateSipRegistrationResponse {
    /**
     * Required
     */
    public SipRegistrationDeviceInfo device;
    /**
     * SIP settings for device
     * Required
     */
    public SipInfoResponse[] sipInfo;
    /**
     * SIP PSTN settings for device
     */
    public SipInfoResponse[] sipInfoPstn;
    /**
     * Required
     */
    public SipFlagsResponse sipFlags;
    /**
     *
     */
    public String[] sipErrorCodes;
    /**
     * Suggested interval in seconds to periodically call SIP-provision API and update the local cache
     * Format: int32
     */
    public Long pollingInterval;

    public CreateSipRegistrationResponse device(SipRegistrationDeviceInfo device) {
        this.device = device;
        return this;
    }

    public CreateSipRegistrationResponse sipInfo(SipInfoResponse[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }

    public CreateSipRegistrationResponse sipInfoPstn(SipInfoResponse[] sipInfoPstn) {
        this.sipInfoPstn = sipInfoPstn;
        return this;
    }

    public CreateSipRegistrationResponse sipFlags(SipFlagsResponse sipFlags) {
        this.sipFlags = sipFlags;
        return this;
    }

    public CreateSipRegistrationResponse sipErrorCodes(String[] sipErrorCodes) {
        this.sipErrorCodes = sipErrorCodes;
        return this;
    }

    public CreateSipRegistrationResponse pollingInterval(Long pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }
}
