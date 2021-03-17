package com.ringcentral.definitions;


public class CallersInfoRequest
{
    /**
         * Phone number of a caller
         */
        public String callerId;
  public CallersInfoRequest callerId(String callerId)
  {
    this.callerId = callerId;
    return this;
  }
  

        /**
         * Contact name of a caller
         */
        public String name;
  public CallersInfoRequest name(String name)
  {
    this.name = name;
    return this;
  }
  
}
