package com.ringcentral.definitions;


public class AccountDeviceUpdate {
    /**
     *
     */
    public EmergencyServiceAddressResourceRequest emergencyServiceAddress;
    /**
     *
     */
    public DeviceEmergencyInfo emergency;
    /**
     *
     */
    public DeviceUpdateExtensionInfo extension;
    /**
     *
     */
    public DeviceUpdatePhoneLinesInfo phoneLines;
    /**
     * Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
     */
    public Boolean useAsCommonPhone;

    public AccountDeviceUpdate emergencyServiceAddress(EmergencyServiceAddressResourceRequest emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }

    public AccountDeviceUpdate emergency(DeviceEmergencyInfo emergency) {
        this.emergency = emergency;
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
