package com.ringcentral.definitions;


    // Notification payload body
public class ExtensionListEventBody
{
    /**
         * Internal identifier of an extension
         */
        public String extensionId;
  public ExtensionListEventBody extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  

        /**
         * Type of extension info change
         * Enum: Create, Update, Delete
         */
        public String eventType;
  public ExtensionListEventBody eventType(String eventType)
  {
    this.eventType = eventType;
    return this;
  }
  

        /**
         * Internal identifier of a subscription owner extension
         */
        public String ownerId;
  public ExtensionListEventBody ownerId(String ownerId)
  {
    this.ownerId = ownerId;
    return this;
  }
  
}
