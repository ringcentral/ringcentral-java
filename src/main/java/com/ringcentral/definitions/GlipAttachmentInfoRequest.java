package com.ringcentral.definitions;


public class GlipAttachmentInfoRequest
{
    /**
         * Internal identifier of an attachment
         */
        public String id;
  public GlipAttachmentInfoRequest id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of an attachment
         * Enum: File, Note, Event, Card
         */
        public String type;
  public GlipAttachmentInfoRequest type(String type)
  {
    this.type = type;
    return this;
  }
  
}
