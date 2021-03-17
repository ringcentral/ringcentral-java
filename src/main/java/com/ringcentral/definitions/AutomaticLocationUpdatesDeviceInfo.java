package com.ringcentral.definitions;


public class AutomaticLocationUpdatesDeviceInfo
{
    /**
         * Internal identifier of a device
         */
        public String id;
  public AutomaticLocationUpdatesDeviceInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Device type
         * Default: HardPhone
         * Enum: HardPhone, SoftPhone, OtherPhone
         */
        public String type;
  public AutomaticLocationUpdatesDeviceInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Serial number for HardPhone (is returned only when the phone is shipped and provisioned)
         */
        public String serial;
  public AutomaticLocationUpdatesDeviceInfo serial(String serial)
  {
    this.serial = serial;
    return this;
  }
  

        /**
         * Specifies if Automatic Location Updates feature is enabled
         */
        public Boolean featureEnabled;
  public AutomaticLocationUpdatesDeviceInfo featureEnabled(Boolean featureEnabled)
  {
    this.featureEnabled = featureEnabled;
    return this;
  }
  

        /**
         * Device name
         */
        public String name;
  public AutomaticLocationUpdatesDeviceInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesModelInfo model;
  public AutomaticLocationUpdatesDeviceInfo model(AutomaticLocationUpdatesModelInfo model)
  {
    this.model = model;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public AutomaticLocationUpdatesDeviceInfo site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         * Phone lines information
         */
        public AutomaticLocationUpdatesPhoneLine[] phoneLines;
  public AutomaticLocationUpdatesDeviceInfo phoneLines(AutomaticLocationUpdatesPhoneLine[] phoneLines)
  {
    this.phoneLines = phoneLines;
    return this;
  }
  
}
