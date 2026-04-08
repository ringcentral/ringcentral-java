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
    public CallerIdData callerId;
    public CallerIdByDevice callerId(CallerIdData callerId)
    {
        this.callerId = callerId;
        return this;
    }
}