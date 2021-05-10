package com.ringcentral.definitions;


public class CreateSipRegistrationResponse {
    /**
     *
     */
    public SipRegistrationDeviceInfo device;
    /**
     * SIP settings for device
     * Required
     */
    public SIPInfoResponse[] sipInfo;
    /**
     * SIP PSTN settings for device
     */
    public SIPInfoResponse[] sipInfoPstn;
    /**
     * Required
     */
    public SIPFlagsResponse sipFlags;
    /**
     *
     */
    public String[] sipErrorCodes;

    public CreateSipRegistrationResponse device(SipRegistrationDeviceInfo device) {
        this.device = device;
        return this;
    }

    public CreateSipRegistrationResponse sipInfo(SIPInfoResponse[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }

    public CreateSipRegistrationResponse sipInfoPstn(SIPInfoResponse[] sipInfoPstn) {
        this.sipInfoPstn = sipInfoPstn;
        return this;
    }

    public CreateSipRegistrationResponse sipFlags(SIPFlagsResponse sipFlags) {
        this.sipFlags = sipFlags;
        return this;
    }

    public CreateSipRegistrationResponse sipErrorCodes(String[] sipErrorCodes) {
        this.sipErrorCodes = sipErrorCodes;
        return this;
    }
}
