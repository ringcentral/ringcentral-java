package com.ringcentral.definitions;


    // Notification payload body
public class ExtensionInfoEventBody
{
    /**
         * Internal identifier of an extension
         */
        public String extensionId;
  public ExtensionInfoEventBody extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  

        /**
         * Type of extension info change
         * Enum: Update, Delete
         */
        public String eventType;
  public ExtensionInfoEventBody eventType(String eventType)
  {
    this.eventType = eventType;
    return this;
  }
  

        /**
         * Returned for 'Update' event type only
         */
        public String[] hints;
  public ExtensionInfoEventBody hints(String[] hints)
  {
    this.hints = hints;
    return this;
  }
  

        /**
         * Internal identifier of a subscription owner extension
         */
        public String ownerId;
  public ExtensionInfoEventBody ownerId(String ownerId)
  {
    this.ownerId = ownerId;
    return this;
  }
  
}
