package com.ringcentral.definitions;


public class DeviceProvisioningNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public DeviceProvisioningNavigationInfoUri firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public DeviceProvisioningNavigationInfoUri nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public DeviceProvisioningNavigationInfoUri previousPage;
    /**
     * Canonical URI for the last page of the list
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
