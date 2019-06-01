package com.ringcentral.definitions;


// Instance id of the caller. It corresponds to the 1st leg of the CallOut call.
public class MakeCallOutCallerInfoRequestFrom {
    /**
     * Internal identifier of a device
     */
    public String deviceId;

    public MakeCallOutCallerInfoRequestFrom deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

}
