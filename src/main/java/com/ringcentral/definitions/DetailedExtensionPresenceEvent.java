package com.ringcentral.definitions;


public class DetailedExtensionPresenceEvent
{
    /**
         * Universally unique identifier of a notification
         */
        public String uuid;
  public DetailedExtensionPresenceEvent uuid(String uuid)
  {
    this.uuid = uuid;
    return this;
  }
  

        /**
         * Event filter URI
         */
        public String event;
  public DetailedExtensionPresenceEvent event(String event)
  {
    this.event = event;
    return this;
  }
  

        /**
         * Datetime of sending a notification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
         */
        public String timestamp;
  public DetailedExtensionPresenceEvent timestamp(String timestamp)
  {
    this.timestamp = timestamp;
    return this;
  }
  

        /**
         * Internal identifier of a subscription
         */
        public String subscriptionId;
  public DetailedExtensionPresenceEvent subscriptionId(String subscriptionId)
  {
    this.subscriptionId = subscriptionId;
    return this;
  }
  

        /**
         */
        public DetailedExtensionPresenceEventBody body;
  public DetailedExtensionPresenceEvent body(DetailedExtensionPresenceEventBody body)
  {
    this.body = body;
    return this;
  }
  
}
