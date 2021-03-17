package com.ringcentral.definitions;


public class DeleteMessageByFilterParameters
{
    /**
         */
        public String[] conversationId;
  public DeleteMessageByFilterParameters conversationId(String[] conversationId)
  {
    this.conversationId = conversationId;
    return this;
  }
  

        /**
         * Messages received earlier then the date specified will be deleted. The default value is current datetime
         */
        public String dateTo;
  public DeleteMessageByFilterParameters dateTo(String dateTo)
  {
    this.dateTo = dateTo;
    return this;
  }
  

        /**
         * Type of messages to be deleted
         * Default: All
         * Enum: Fax, SMS, VoiceMail, Pager, Text, All
         */
        public String type;
  public DeleteMessageByFilterParameters type(String type)
  {
    this.type = type;
    return this;
  }
  
}
