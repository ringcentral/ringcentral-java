package com.ringcentral.definitions;


    // Batch of A2P SMS messages. This object provides specification to send message(s) to many recipients. It contains top-level attributes, such as `text` which apply to all `messages`. In addition to that, it is possible to override this attribute for each message. This way a single API call may be used to send individual messages to many recipients.
public class CreateSMSMessageBatchRequest
{
    /**
         * Sender's phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format.
         * Required
         */
        public String from;
  public CreateSMSMessageBatchRequest from(String from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Text to send to `messages.to` phone numbers. Can be overridden on a per-message basis
         */
        public String text;
  public CreateSMSMessageBatchRequest text(String text)
  {
    this.text = text;
    return this;
  }
  

        /**
         * Individual messages
         * Required
         */
        public MessageCreateRequest[] messages;
  public CreateSMSMessageBatchRequest messages(MessageCreateRequest[] messages)
  {
    this.messages = messages;
    return this;
  }
  
}
