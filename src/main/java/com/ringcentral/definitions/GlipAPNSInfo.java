package com.ringcentral.definitions;


    // Apple notification data
public class GlipAPNSInfo
{
    /**
         */
        public APSInfo aps;
  public GlipAPNSInfo aps(APSInfo aps)
  {
    this.aps = aps;
    return this;
  }
  

        /**
         * Datetime of a call action in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
         */
        public String timestamp;
  public GlipAPNSInfo timestamp(String timestamp)
  {
    this.timestamp = timestamp;
    return this;
  }
  

        /**
         * Universally unique identifier of a notification
         */
        public String uuid;
  public GlipAPNSInfo uuid(String uuid)
  {
    this.uuid = uuid;
    return this;
  }
  

        /**
         * Event filter URI
         */
        public String event;
  public GlipAPNSInfo event(String event)
  {
    this.event = event;
    return this;
  }
  

        /**
         * Internal identifier of a subscription
         */
        public String subscriptionId;
  public GlipAPNSInfo subscriptionId(String subscriptionId)
  {
    this.subscriptionId = subscriptionId;
    return this;
  }
  

        /**
         */
        public GlipUnreadMessageCountInfo body;
  public GlipAPNSInfo body(GlipUnreadMessageCountInfo body)
  {
    this.body = body;
    return this;
  }
  
}
