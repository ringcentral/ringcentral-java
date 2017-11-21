package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallerIdByDevice
{
    //
    public CallerIdDeviceInfo device;
    public CallerIdByDevice device(CallerIdDeviceInfo device) {
        this.device = device;
        return this;
    }
    //
    public CallerIdByDeviceInfo callerId;
    public CallerIdByDevice callerId(CallerIdByDeviceInfo callerId) {
        this.callerId = callerId;
        return this;
    }
}
