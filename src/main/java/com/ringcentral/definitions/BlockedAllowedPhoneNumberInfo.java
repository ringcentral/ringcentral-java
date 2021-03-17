package com.ringcentral.definitions;


    // Information on a blocked/allowed phone number
public class BlockedAllowedPhoneNumberInfo
{
    /**
         * Link to a blocked/allowed phone number
         */
        public String uri;
  public BlockedAllowedPhoneNumberInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a blocked/allowed phone number
         */
        public String id;
  public BlockedAllowedPhoneNumberInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * A blocked/allowed phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
         */
        public String phoneNumber;
  public BlockedAllowedPhoneNumberInfo phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Custom name of a blocked/allowed phone number
         */
        public String label;
  public BlockedAllowedPhoneNumberInfo label(String label)
  {
    this.label = label;
    return this;
  }
  

        /**
         * Status of a phone number
         * Enum: Blocked, Allowed
         */
        public String status;
  public BlockedAllowedPhoneNumberInfo status(String status)
  {
    this.status = status;
    return this;
  }
  
}
