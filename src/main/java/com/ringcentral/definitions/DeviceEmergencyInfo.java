package com.ringcentral.definitions;


public class DeviceEmergencyInfo {
    /**
     *
     */
    public DeviceEmergencyAddress address;
    /**
     * Company emergency response location details
     */
    public DeviceEmergencyLocationInfo location;
    /**
     * Specifies if emergency address is out of country
     */
    public Boolean outOfCountry;
    /**
     * Emergency address status
     * Enum: Valid, Invalid
     */
    public String addressStatus;
    /**
     * Resulting status of emergency address synchronization. Returned if `syncEmergencyAddress` parameter is set to 'True'
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    /**
     * Ability to register new emergency address for a phone line using devices sharing this line or only main device (line owner)
     * Enum: MainDevice, AnyDevice
     */
    public String addressEditableStatus;

    public DeviceEmergencyInfo address(DeviceEmergencyAddress address) {
        this.address = address;
        return this;
    }

    public DeviceEmergencyInfo location(DeviceEmergencyLocationInfo location) {
        this.location = location;
        return this;
    }

    public DeviceEmergencyInfo outOfCountry(Boolean outOfCountry) {
        this.outOfCountry = outOfCountry;
        return this;
    }

    public DeviceEmergencyInfo addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    public DeviceEmergencyInfo syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public DeviceEmergencyInfo addressEditableStatus(String addressEditableStatus) {
        this.addressEditableStatus = addressEditableStatus;
        return this;
    }

}
