package com.ringcentral.definitions;


    /**
* Caller ID settings by device
*/
public class CallerIdByDevice
{
    /**
     */
    public CallerIdDeviceInfo device;
    public CallerIdByDevice device(CallerIdDeviceInfo device)
    {
        this.device = device;
        return this;
    }

    /**
     */
    public CallerIdByDeviceInfo callerId;
    public CallerIdByDevice callerId(CallerIdByDeviceInfo callerId)
    {
        this.callerId = callerId;
        return this;
    }
}