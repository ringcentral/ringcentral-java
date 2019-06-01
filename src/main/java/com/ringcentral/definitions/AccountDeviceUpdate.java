package com.ringcentral.definitions;


public class AccountDeviceUpdate {
    /**
     * Address for emergency cases. The same emergency address is assigned to all numbers of a single device
     */
    public EmergencyAddressInfoRequest emergencyServiceAddress;
    /**
     * Information on extension that the device is assigned to
     */
    public DeviceUpdateExtensionInfo extension;
    /**
     * Information on phone lines added to a device
     */
    public DeviceUpdatePhoneLinesInfo phoneLines;
    /**
     * Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;

    public AccountDeviceUpdate emergencyServiceAddress(EmergencyAddressInfoRequest emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    public AccountDeviceUpdate extension(DeviceUpdateExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public AccountDeviceUpdate phoneLines(DeviceUpdatePhoneLinesInfo phoneLines) {
        this.phoneLines = phoneLines;
        return this;
    }

    public AccountDeviceUpdate useAsCommonPhone(Boolean useAsCommonPhone) {
        this.useAsCommonPhone = useAsCommonPhone;
        return this;
    }

}
