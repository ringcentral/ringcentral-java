package com.ringcentral.definitions;


public class ExtensionPresenceEvent
{
    /**
         * Universally unique identifier of a notification
         */
        public String uuid;
  public ExtensionPresenceEvent uuid(String uuid)
  {
    this.uuid = uuid;
    return this;
  }
  

        /**
         * Event filter URI
         */
        public String event;
  public ExtensionPresenceEvent event(String event)
  {
    this.event = event;
    return this;
  }
  

        /**
         * Datetime of sending a notification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
         */
        public String timestamp;
  public ExtensionPresenceEvent timestamp(String timestamp)
  {
    this.timestamp = timestamp;
    return this;
  }
  

        /**
         * Internal identifier of a subscription
         */
        public String subscriptionId;
  public ExtensionPresenceEvent subscriptionId(String subscriptionId)
  {
    this.subscriptionId = subscriptionId;
    return this;
  }
  

        /**
         */
        public ExtensionPresenceEventBody body;
  public ExtensionPresenceEvent body(ExtensionPresenceEventBody body)
  {
    this.body = body;
    return this;
  }
  
}
