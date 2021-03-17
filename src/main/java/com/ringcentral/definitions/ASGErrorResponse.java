package com.ringcentral.definitions;


    // Error response
public class ASGErrorResponse
{
    /**
         * Error code
         */
        public String errorCode;
  public ASGErrorResponse errorCode(String errorCode)
  {
    this.errorCode = errorCode;
    return this;
  }
  

        /**
         * Human-readable description of an error. Not suitable for end users
         */
        public String description;
  public ASGErrorResponse description(String description)
  {
    this.description = description;
    return this;
  }
  
}
