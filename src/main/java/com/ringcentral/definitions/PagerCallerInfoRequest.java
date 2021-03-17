package com.ringcentral.definitions;


    // Sender of a pager message.
public class PagerCallerInfoRequest
{
    /**
         * Extension identifier
         */
        public String extensionId;
  public PagerCallerInfoRequest extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  

        /**
         * Extension number
         */
        public String extensionNumber;
  public PagerCallerInfoRequest extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  
}
