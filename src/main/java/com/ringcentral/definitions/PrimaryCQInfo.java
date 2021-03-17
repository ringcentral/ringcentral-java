package com.ringcentral.definitions;


    // Primary call session information. Supported for Call Queues only
public class PrimaryCQInfo
{
    /**
         * Call information to be displayed as 'Line 1' for a call queue call session
         * Enum: PhoneNumberLabel, PhoneNumber, QueueExtension, QueueName, CallerIdName, CallerIdNumber, None
         */
        public String type;
  public PrimaryCQInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Call information value
         */
        public String value;
  public PrimaryCQInfo value(String value)
  {
    this.value = value;
    return this;
  }
  
}
