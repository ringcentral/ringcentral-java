package com.ringcentral.definitions;


public class CreateSipRegistrationRequest {
    /**
     * Device unique description
     */
    public DeviceInfoRequest device;
    /**
     * SIP settings for device
     */
    public SIPInfoRequest[] sipInfo;

    public CreateSipRegistrationRequest device(DeviceInfoRequest device) {
        this.device = device;
        return this;
    }

    public CreateSipRegistrationRequest sipInfo(SIPInfoRequest[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }

}
