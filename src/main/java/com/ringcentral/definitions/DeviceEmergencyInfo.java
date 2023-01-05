package com.ringcentral.definitions;


    /**
* Device emergency settings
*/
public class DeviceEmergencyInfo
{
    /**
     */
    public DeviceEmergencyAddress address;
    public DeviceEmergencyInfo address(DeviceEmergencyAddress address)
    {
        this.address = address;
        return this;
    }

    /**
     */
    public DeviceEmergencyLocationInfo location;
    public DeviceEmergencyInfo location(DeviceEmergencyLocationInfo location)
    {
        this.location = location;
        return this;
    }

    /**
     * Specifies if emergency address is out of country
     */
    public Boolean outOfCountry;
    public DeviceEmergencyInfo outOfCountry(Boolean outOfCountry)
    {
        this.outOfCountry = outOfCountry;
        return this;
    }

    /**
     * Emergency address status
     * Enum: Valid, Invalid, Provisioning
     */
    public String addressStatus;
    public DeviceEmergencyInfo addressStatus(String addressStatus)
    {
        this.addressStatus = addressStatus;
        return this;
    }

    /**
     * Visibility of an emergency response location. If `Private` is set, then location is visible only for the restricted number of users, specified in `owners` array
     * Enum: Private, Public
     */
    public String visibility;
    public DeviceEmergencyInfo visibility(String visibility)
    {
        this.visibility = visibility;
        return this;
    }

    /**
     * Resulting status of emergency address synchronization. Returned if `syncEmergencyAddress` parameter is set to &#039;True&#039;
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    public DeviceEmergencyInfo syncStatus(String syncStatus)
    {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * Ability to register new emergency address for a phone line using devices sharing this line or only main device (line owner)
     * Enum: MainDevice, AnyDevice
     */
    public String addressEditableStatus;
    public DeviceEmergencyInfo addressEditableStatus(String addressEditableStatus)
    {
        this.addressEditableStatus = addressEditableStatus;
        return this;
    }
}