package com.ringcentral.definitions;


public class CallerIdByDevice {
    /**
     *
     */
    public CallerIdDeviceInfo device;
    /**
     *
     */
    public CallerIdByDeviceInfo callerId;

    public CallerIdByDevice device(CallerIdDeviceInfo device) {
        this.device = device;
        return this;
    }

    public CallerIdByDevice callerId(CallerIdByDeviceInfo callerId) {
        this.callerId = callerId;
        return this;
    }

}
