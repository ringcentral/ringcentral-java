package com.ringcentral.definitions;


    /**
* Information on phone lines added to a device
*/
public class DeviceUpdatePhoneLinesInfo
{
    /**
     * Information on phone lines added to a device
     */
    public UpdateDevicePhoneInfo[] phoneLines;
    public DeviceUpdatePhoneLinesInfo phoneLines(UpdateDevicePhoneInfo[] phoneLines)
    {
        this.phoneLines = phoneLines;
        return this;
    }
}