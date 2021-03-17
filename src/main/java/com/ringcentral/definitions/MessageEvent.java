package com.ringcentral.definitions;


public class MessageEvent
{
    /**
         * Universally unique identifier of a notification
         */
        public String uuid;
  public MessageEvent uuid(String uuid)
  {
    this.uuid = uuid;
    return this;
  }
  

        /**
         * Event filter URI
         */
        public String event;
  public MessageEvent event(String event)
  {
    this.event = event;
    return this;
  }
  

        /**
         * Datetime of sending a notification in [ISO 8601](shttps://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
         */
        public String timestamp;
  public MessageEvent timestamp(String timestamp)
  {
    this.timestamp = timestamp;
    return this;
  }
  

        /**
         * Internal identifier of a subscription
         */
        public String subscriptionId;
  public MessageEvent subscriptionId(String subscriptionId)
  {
    this.subscriptionId = subscriptionId;
    return this;
  }
  

        /**
         */
        public MessageEventBody body;
  public MessageEvent body(MessageEventBody body)
  {
    this.body = body;
    return this;
  }
  
}
