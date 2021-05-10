package com.ringcentral.definitions;


// Information on navigation
public class DeviceProvisioningNavigationInfo {
    /**
     *
     */
    public DeviceProvisioningNavigationInfoUri firstPage;
    /**
     *
     */
    public DeviceProvisioningNavigationInfoUri nextPage;
    /**
     *
     */
    public DeviceProvisioningNavigationInfoUri previousPage;
    /**
     *
     */
    public DeviceProvisioningNavigationInfoUri lastPage;

    public DeviceProvisioningNavigationInfo firstPage(DeviceProvisioningNavigationInfoUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public DeviceProvisioningNavigationInfo nextPage(DeviceProvisioningNavigationInfoUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public DeviceProvisioningNavigationInfo previousPage(DeviceProvisioningNavigationInfoUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public DeviceProvisioningNavigationInfo lastPage(DeviceProvisioningNavigationInfoUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
