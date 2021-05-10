package com.ringcentral.definitions;


// Information on navigation
public class ProvisioningNavigationInfo {
    /**
     *
     */
    public ProvisioningNavigationInfoUri firstPage;
    /**
     *
     */
    public ProvisioningNavigationInfoUri nextPage;
    /**
     *
     */
    public ProvisioningNavigationInfoUri previousPage;
    /**
     *
     */
    public ProvisioningNavigationInfoUri lastPage;

    public ProvisioningNavigationInfo firstPage(ProvisioningNavigationInfoUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public ProvisioningNavigationInfo nextPage(ProvisioningNavigationInfoUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public ProvisioningNavigationInfo previousPage(ProvisioningNavigationInfoUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public ProvisioningNavigationInfo lastPage(ProvisioningNavigationInfoUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
