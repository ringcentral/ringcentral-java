package com.ringcentral.definitions;


public class CreateSipRegistrationResponse
{
    /**
         */
        public SipRegistrationDeviceInfo device;
  public CreateSipRegistrationResponse device(SipRegistrationDeviceInfo device)
  {
    this.device = device;
    return this;
  }
  

        /**
         * SIP settings for device
         * Required
         */
        public SIPInfoResponse[] sipInfo;
  public CreateSipRegistrationResponse sipInfo(SIPInfoResponse[] sipInfo)
  {
    this.sipInfo = sipInfo;
    return this;
  }
  

        /**
         * SIP PSTN settings for device
         */
        public SIPInfoResponse[] sipInfoPstn;
  public CreateSipRegistrationResponse sipInfoPstn(SIPInfoResponse[] sipInfoPstn)
  {
    this.sipInfoPstn = sipInfoPstn;
    return this;
  }
  

        /**
         * Required
         */
        public SIPFlagsResponse sipFlags;
  public CreateSipRegistrationResponse sipFlags(SIPFlagsResponse sipFlags)
  {
    this.sipFlags = sipFlags;
    return this;
  }
  

        /**
         */
        public String[] sipErrorCodes;
  public CreateSipRegistrationResponse sipErrorCodes(String[] sipErrorCodes)
  {
    this.sipErrorCodes = sipErrorCodes;
    return this;
  }
  
}
