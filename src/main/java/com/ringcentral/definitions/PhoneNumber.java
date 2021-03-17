package com.ringcentral.definitions;


public class PhoneNumber
{
    /**
         * Required
         * Enum: work, mobile, other
         */
        public String type;
  public PhoneNumber type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Required
         */
        public String value;
  public PhoneNumber value(String value)
  {
    this.value = value;
    return this;
  }
  
}
