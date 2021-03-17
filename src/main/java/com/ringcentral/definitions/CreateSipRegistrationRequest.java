package com.ringcentral.definitions;


public class CreateSipRegistrationRequest
{
    /**
         */
        public DeviceInfoRequest device;
  public CreateSipRegistrationRequest device(DeviceInfoRequest device)
  {
    this.device = device;
    return this;
  }
  

        /**
         * SIP settings for device
         */
        public SIPInfoRequest[] sipInfo;
  public CreateSipRegistrationRequest sipInfo(SIPInfoRequest[] sipInfo)
  {
    this.sipInfo = sipInfo;
    return this;
  }
  
}
