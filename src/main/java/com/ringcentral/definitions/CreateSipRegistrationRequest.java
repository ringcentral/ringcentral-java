package com.ringcentral.definitions;


public class CreateSipRegistrationRequest {
    /**
     *
     */
    public DeviceInfoRequest device;
    /**
     * SIP settings for device
     */
    public SIPInfoRequest[] sipInfo;
    /**
     * Supported for Softphone clients only. If &#039;SoftphoneLineReassignment&#039; feature is enabled
     * the reassignment process can be initialized, however if there is no DL for the given user&#039;s device
     * then SPR-131 error code will be returned.
     * Default: None
     * Enum: None, Initialize, Reassign
     */
    public String softPhoneLineReassignment;

    public CreateSipRegistrationRequest device(DeviceInfoRequest device) {
        this.device = device;
        return this;
    }

    public CreateSipRegistrationRequest sipInfo(SIPInfoRequest[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }

    public CreateSipRegistrationRequest softPhoneLineReassignment(String softPhoneLineReassignment) {
        this.softPhoneLineReassignment = softPhoneLineReassignment;
        return this;
    }
}
