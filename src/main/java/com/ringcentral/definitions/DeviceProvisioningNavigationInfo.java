package com.ringcentral.definitions;


    // Information on navigation
public class DeviceProvisioningNavigationInfo
{
    /**
         */
        public DeviceProvisioningNavigationInfoUri firstPage;
  public DeviceProvisioningNavigationInfo firstPage(DeviceProvisioningNavigationInfoUri firstPage)
  {
    this.firstPage = firstPage;
    return this;
  }
  

        /**
         */
        public DeviceProvisioningNavigationInfoUri nextPage;
  public DeviceProvisioningNavigationInfo nextPage(DeviceProvisioningNavigationInfoUri nextPage)
  {
    this.nextPage = nextPage;
    return this;
  }
  

        /**
         */
        public DeviceProvisioningNavigationInfoUri previousPage;
  public DeviceProvisioningNavigationInfo previousPage(DeviceProvisioningNavigationInfoUri previousPage)
  {
    this.previousPage = previousPage;
    return this;
  }
  

        /**
         */
        public DeviceProvisioningNavigationInfoUri lastPage;
  public DeviceProvisioningNavigationInfo lastPage(DeviceProvisioningNavigationInfoUri lastPage)
  {
    this.lastPage = lastPage;
    return this;
  }
  
}
