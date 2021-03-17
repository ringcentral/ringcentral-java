package com.ringcentral.definitions;


public class Email
{
    /**
         * Required
         * Enum: work
         */
        public String type;
  public Email type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Required
         */
        public String value;
  public Email value(String value)
  {
    this.value = value;
    return this;
  }
  
}
