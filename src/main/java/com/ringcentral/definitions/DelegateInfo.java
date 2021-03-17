package com.ringcentral.definitions;


public class DelegateInfo
{
    /**
         */
        public DelegateExtensionInfo extension;
  public DelegateInfo extension(DelegateExtensionInfo extension)
  {
    this.extension = extension;
    return this;
  }
  

        /**
         * Specifies whether secretary user is permitted to pickup calls on behalf of boss user role
         */
        public Boolean callPickup;
  public DelegateInfo callPickup(Boolean callPickup)
  {
    this.callPickup = callPickup;
    return this;
  }
  

        /**
         * Specifies whether secretary user is permitted to organize conference on behalf of boss user role
         */
        public Boolean conferencing;
  public DelegateInfo conferencing(Boolean conferencing)
  {
    this.conferencing = conferencing;
    return this;
  }
  

        /**
         */
        public ConferencingSettingsInfo conferencingSettings;
  public DelegateInfo conferencingSettings(ConferencingSettingsInfo conferencingSettings)
  {
    this.conferencingSettings = conferencingSettings;
    return this;
  }
  

        /**
         * List of the delegate users for the current boss user
         */
        public String[] delegateIds;
  public DelegateInfo delegateIds(String[] delegateIds)
  {
    this.delegateIds = delegateIds;
    return this;
  }
  
}
