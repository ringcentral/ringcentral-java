package com.ringcentral.definitions;


public class MessageStoreCalleeInfoRequest
{
    /**
         * Phone number in E.164 format
         */
        public String phoneNumber;
  public MessageStoreCalleeInfoRequest phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Name of the callee
         */
        public String name;
  public MessageStoreCalleeInfoRequest name(String name)
  {
    this.name = name;
    return this;
  }
  
}
