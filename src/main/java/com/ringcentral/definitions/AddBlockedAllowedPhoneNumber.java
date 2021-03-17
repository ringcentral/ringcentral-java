package com.ringcentral.definitions;


    // Updates either blocked or allowed phone number list with a new phone number.
public class AddBlockedAllowedPhoneNumber
{
    /**
         * A blocked/allowed phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
         */
        public String phoneNumber;
  public AddBlockedAllowedPhoneNumber phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Custom name of a blocked/allowed phone number
         */
        public String label;
  public AddBlockedAllowedPhoneNumber label(String label)
  {
    this.label = label;
    return this;
  }
  

        /**
         * Status of a phone number
         * Default: Blocked
         * Enum: Blocked, Allowed
         */
        public String status;
  public AddBlockedAllowedPhoneNumber status(String status)
  {
    this.status = status;
    return this;
  }
  
}
