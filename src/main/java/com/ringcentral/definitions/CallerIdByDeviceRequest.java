package com.ringcentral.definitions;


    /**
* Caller ID settings by device
*/
public class CallerIdByDeviceRequest
{
    /**
     */
    public CallerIdDeviceInfoRequest device;
    public CallerIdByDeviceRequest device(CallerIdDeviceInfoRequest device)
    {
        this.device = device;
        return this;
    }

    /**
     */
    public CallerIdByDeviceInfoRequest callerId;
    public CallerIdByDeviceRequest callerId(CallerIdByDeviceInfoRequest callerId)
    {
        this.callerId = callerId;
        return this;
    }
}