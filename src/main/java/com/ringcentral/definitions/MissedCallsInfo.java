package com.ringcentral.definitions;


public class MissedCallsInfo
{
    /**
         * Email notification flag
         */
        public Boolean notifyByEmail;
  public MissedCallsInfo notifyByEmail(Boolean notifyByEmail)
  {
    this.notifyByEmail = notifyByEmail;
    return this;
  }
  

        /**
         * SMS notification flag
         */
        public Boolean notifyBySms;
  public MissedCallsInfo notifyBySms(Boolean notifyBySms)
  {
    this.notifyBySms = notifyBySms;
    return this;
  }
  

        /**
         * List of recipient email addresses for missed call notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
         */
        public String[] advancedEmailAddresses;
  public MissedCallsInfo advancedEmailAddresses(String[] advancedEmailAddresses)
  {
    this.advancedEmailAddresses = advancedEmailAddresses;
    return this;
  }
  

        /**
         * List of recipient phone numbers for missed call notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
         */
        public String[] advancedSmsEmailAddresses;
  public MissedCallsInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses)
  {
    this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
    return this;
  }
  
}
