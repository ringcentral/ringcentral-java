package com.ringcentral.definitions;


public class UnifiedPresenceListEntry
{
    /**
         * Internal identifier of the resource
         */
        public String resourceId;
  public UnifiedPresenceListEntry resourceId(String resourceId)
  {
    this.resourceId = resourceId;
    return this;
  }
  

        /**
         * Status code of resource retrieval
         */
        public Long status;
  public UnifiedPresenceListEntry status(Long status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public UnifiedPresence body;
  public UnifiedPresenceListEntry body(UnifiedPresence body)
  {
    this.body = body;
    return this;
  }
  
}
