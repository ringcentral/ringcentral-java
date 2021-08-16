package com.ringcentral.definitions;


// Caller ID settings by device
public class CallerIdByDeviceRequest {
    /**
     *
     */
    public CallerIdDeviceInfoRequest device;
    /**
     *
     */
    public CallerIdByDeviceInfoRequest callerId;

    public CallerIdByDeviceRequest device(CallerIdDeviceInfoRequest device) {
        this.device = device;
        return this;
    }

    public CallerIdByDeviceRequest callerId(CallerIdByDeviceInfoRequest callerId) {
        this.callerId = callerId;
        return this;
    }
}
