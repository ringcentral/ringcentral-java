package com.ringcentral.definitions;


public class CallPartyInfo
{
    /**
         * Call party phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)(with '+' sign) format
         */
        public String phoneNumber;
  public CallPartyInfo phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Call party name
         */
        public String name;
  public CallPartyInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Internal identifier of a call party extensionId
         */
        public String extensionId;
  public CallPartyInfo extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  
}
