package com.ringcentral.definitions;


    /**
* Information on navigation
*/
public class ProvisioningNavigationInfo
{
    /**
     */
    public ProvisioningNavigationInfoUri firstPage;
    public ProvisioningNavigationInfo firstPage(ProvisioningNavigationInfoUri firstPage)
    {
        this.firstPage = firstPage;
        return this;
    }

    /**
     */
    public ProvisioningNavigationInfoUri nextPage;
    public ProvisioningNavigationInfo nextPage(ProvisioningNavigationInfoUri nextPage)
    {
        this.nextPage = nextPage;
        return this;
    }

    /**
     */
    public ProvisioningNavigationInfoUri previousPage;
    public ProvisioningNavigationInfo previousPage(ProvisioningNavigationInfoUri previousPage)
    {
        this.previousPage = previousPage;
        return this;
    }

    /**
     */
    public ProvisioningNavigationInfoUri lastPage;
    public ProvisioningNavigationInfo lastPage(ProvisioningNavigationInfoUri lastPage)
    {
        this.lastPage = lastPage;
        return this;
    }
}