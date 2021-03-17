package com.ringcentral.definitions;


public class DisabledFilterInfo
{
    /**
         * Event filter that is disabled for the user
         */
        public String filter;
  public DisabledFilterInfo filter(String filter)
  {
    this.filter = filter;
    return this;
  }
  

        /**
         * Reason why the filter is disabled for the user
         */
        public String reason;
  public DisabledFilterInfo reason(String reason)
  {
    this.reason = reason;
    return this;
  }
  

        /**
         * Error message
         */
        public String message;
  public DisabledFilterInfo message(String message)
  {
    this.message = message;
    return this;
  }
  
}
