package com.ringcentral.definitions;


    // Sender information
public class CallerInfoFrom
{
    /**
         */
        public String phoneNumber;
  public CallerInfoFrom phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         */
        public String name;
  public CallerInfoFrom name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public String location;
  public CallerInfoFrom location(String location)
  {
    this.location = location;
    return this;
  }
  
}
