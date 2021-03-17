package com.ringcentral.definitions;


public class CreateFaxMessageRequest
{
    /**
         * Resolution of Fax
         * Enum: High, Low
         */
        public String faxResolution;
  public CreateFaxMessageRequest faxResolution(String faxResolution)
  {
    this.faxResolution = faxResolution;
    return this;
  }
  

        /**
         * To Phone Number
         */
        public MessageStoreCalleeInfoRequest[] to;
  public CreateFaxMessageRequest to(MessageStoreCalleeInfoRequest[] to)
  {
    this.to = to;
    return this;
  }
  

        /**
         * Timestamp to send fax at. If not specified (current or the past), the fax is sent immediately
         */
        public String sendTime;
  public CreateFaxMessageRequest sendTime(String sendTime)
  {
    this.sendTime = sendTime;
    return this;
  }
  

        /**
         * ISO Code. e.g UK
         */
        public String isoCode;
  public CreateFaxMessageRequest isoCode(String isoCode)
  {
    this.isoCode = isoCode;
    return this;
  }
  

        /**
         * Cover page identifier. For the list of available cover page identifiers please call the method Fax Cover Pages. If not specified, the default cover page which is configured in 'Outbound Fax Settings' is attached
         */
        public Long coverIndex;
  public CreateFaxMessageRequest coverIndex(Long coverIndex)
  {
    this.coverIndex = coverIndex;
    return this;
  }
  

        /**
         * Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
         */
        public String coverPageText;
  public CreateFaxMessageRequest coverPageText(String coverPageText)
  {
    this.coverPageText = coverPageText;
    return this;
  }
  

        /**
         * File to upload
         */
        public Attachment[] attachments;
  public CreateFaxMessageRequest attachments(Attachment[] attachments)
  {
    this.attachments = attachments;
    return this;
  }
  
}
