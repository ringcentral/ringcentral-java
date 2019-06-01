package com.ringcentral.definitions;


public class ProvisioningNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public ProvisioningNavigationInfoUri firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public ProvisioningNavigationInfoUri nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public ProvisioningNavigationInfoUri previousPage;
    /**
     * Canonical URI for the last page of the list
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
