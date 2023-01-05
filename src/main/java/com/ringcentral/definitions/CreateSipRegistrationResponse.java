package com.ringcentral.definitions;


public class CreateSipRegistrationResponse
{
    /**
     * Required
     */
    public SipRegistrationDeviceInfo device;
    public CreateSipRegistrationResponse device(SipRegistrationDeviceInfo device)
    {
        this.device = device;
        return this;
    }

    /**
     * SIP settings for device
     * Required
     */
    public SipInfoResponse[] sipInfo;
    public CreateSipRegistrationResponse sipInfo(SipInfoResponse[] sipInfo)
    {
        this.sipInfo = sipInfo;
        return this;
    }

    /**
     * SIP PSTN settings for device
     */
    public SipInfoResponse[] sipInfoPstn;
    public CreateSipRegistrationResponse sipInfoPstn(SipInfoResponse[] sipInfoPstn)
    {
        this.sipInfoPstn = sipInfoPstn;
        return this;
    }

    /**
     * Required
     */
    public SipFlagsResponse sipFlags;
    public CreateSipRegistrationResponse sipFlags(SipFlagsResponse sipFlags)
    {
        this.sipFlags = sipFlags;
        return this;
    }

    /**
     */
    public String[] sipErrorCodes;
    public CreateSipRegistrationResponse sipErrorCodes(String[] sipErrorCodes)
    {
        this.sipErrorCodes = sipErrorCodes;
        return this;
    }

    /**
     * Suggested interval in seconds to periodically call SIP-provision API and update the local cache
     * Format: int32
     */
    public Long pollingInterval;
    public CreateSipRegistrationResponse pollingInterval(Long pollingInterval)
    {
        this.pollingInterval = pollingInterval;
        return this;
    }
}