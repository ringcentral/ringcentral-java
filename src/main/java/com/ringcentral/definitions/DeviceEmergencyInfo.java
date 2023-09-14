package com.ringcentral.definitions;


/**
 * Device emergency settings
 */
public class DeviceEmergencyInfo {
    /**
     * Automatically determined emergency address. If `emergencyAddressState`
     * value is &#039;Assigned&#039;, then this address is assigned to the current device.
     * If `emergencyAddressState` value is &#039;Unconfirmed&#039;, then the specified address
     * must be confirmed by the user before being registered as emergency address
     * for the current device. In all other cases the value is null
     */
    public DeviceEmergencyInfoAddress address;
    /**
     *
     */
    public DeviceEmergencyLocationInfo location;
    /**
     * Specifies if emergency address is out of country
     */
    public Boolean outOfCountry;
    /**
     * Emergency address status
     * Enum: Valid, Invalid, Provisioning
     */
    public String addressStatus;
    /**
     * Visibility of an emergency response location. If `Private`
     * is set, then location is visible only for the restricted number of users,
     * specified in `owners` array
     * Enum: Private, Public
     */
    public String visibility;
    /**
     * Resulting status of the emergency address synchronization. Returned
     * if `syncEmergencyAddress` parameter is set to &#039;True&#039;
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    /**
     * Ability to register new emergency address for a phone line
     * using devices sharing this line or only main device (line owner)
     * Enum: MainDevice, AnyDevice
     */
    public String addressEditableStatus;

    public DeviceEmergencyInfo address(DeviceEmergencyInfoAddress address) {
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

    public DeviceEmergencyInfo visibility(String visibility) {
        this.visibility = visibility;
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
