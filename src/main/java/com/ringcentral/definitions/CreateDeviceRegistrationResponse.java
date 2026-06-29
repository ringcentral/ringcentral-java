package com.ringcentral.definitions;

public class CreateDeviceRegistrationResponse {
    /** Required */
    public SipRegistrationDeviceInfo device;

    public CreateDeviceRegistrationResponse device(SipRegistrationDeviceInfo device) {
        this.device = device;
        return this;
    }

    /** SIP settings for device Required */
    public SipInfoResponse[] sipInfo;

    public CreateDeviceRegistrationResponse sipInfo(SipInfoResponse[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }

    /** SIP PSTN settings for device */
    public SipInfoResponse[] sipInfoPstn;

    public CreateDeviceRegistrationResponse sipInfoPstn(SipInfoResponse[] sipInfoPstn) {
        this.sipInfoPstn = sipInfoPstn;
        return this;
    }

    /** Required */
    public SipFlagsResponse sipFlags;

    public CreateDeviceRegistrationResponse sipFlags(SipFlagsResponse sipFlags) {
        this.sipFlags = sipFlags;
        return this;
    }

    /** */
    public String[] sipErrorCodes;

    public CreateDeviceRegistrationResponse sipErrorCodes(String[] sipErrorCodes) {
        this.sipErrorCodes = sipErrorCodes;
        return this;
    }

    /**
     * Suggested interval in seconds to periodically call SIP-provision API and update the local
     * cache Format: int32
     */
    public Long pollingInterval;

    public CreateDeviceRegistrationResponse pollingInterval(Long pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }
}
