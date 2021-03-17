package com.ringcentral.definitions;


public class GlipWebhookInfo
{
    /**
         * Internal identifier of a webhook
         */
        public String id;
  public GlipWebhookInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Internal identifier of the user who created a webhook
         */
        public String creatorId;
  public GlipWebhookInfo creatorId(String creatorId)
  {
    this.creatorId = creatorId;
    return this;
  }
  

        /**
         * Internal identifiers of groups where a webhook has been created
         */
        public String[] groupIds;
  public GlipWebhookInfo groupIds(String[] groupIds)
  {
    this.groupIds = groupIds;
    return this;
  }
  

        /**
         * Webhook creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
         */
        public String creationTime;
  public GlipWebhookInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Webhook last update time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
         */
        public String lastModifiedTime;
  public GlipWebhookInfo lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Public link to send a webhook payload
         */
        public String uri;
  public GlipWebhookInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Current status of a webhook
         * Enum: Active, Suspended, Deleted
         */
        public String status;
  public GlipWebhookInfo status(String status)
  {
    this.status = status;
    return this;
  }
  
}
