package com.ringcentral.definitions;


    // Information about the message that failed to be sent
public class RejectedMessageInfo
{
    /**
         * Index of the rejected message in the request
         */
        public Long index;
  public RejectedMessageInfo index(Long index)
  {
    this.index = index;
    return this;
  }
  

        /**
         */
        public String[] to;
  public RejectedMessageInfo to(String[] to)
  {
    this.to = to;
    return this;
  }
  

        /**
         * Standard error code
         */
        public String errorCode;
  public RejectedMessageInfo errorCode(String errorCode)
  {
    this.errorCode = errorCode;
    return this;
  }
  

        /**
         * Standard error description
         */
        public String description;
  public RejectedMessageInfo description(String description)
  {
    this.description = description;
    return this;
  }
  
}
