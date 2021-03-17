package com.ringcentral.definitions;


public class ListA2PsmsParameters
{
    /**
         * Internal identifier of a message batch used for filtering records
         */
        public String batchId;
  public ListA2PsmsParameters batchId(String batchId)
  {
    this.batchId = batchId;
    return this;
  }
  

        /**
         * Direction of a message to filter the message list result. By default there is no filter applied - both Inbound and Outbound messages are returned
         * Enum: Inbound, Outbound
         */
        public String direction;
  public ListA2PsmsParameters direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * Indicates if the response has to be detailed, includes text in the response if detailed
         * Default: Simple
         * Enum: Simple, Detailed
         */
        public String view;
  public ListA2PsmsParameters view(String view)
  {
    this.view = view;
    return this;
  }
  

        /**
         * Date to filter message list result. Messages with `creationTime` later than or equal to `dateFrom` value are returned. The default value is 1 day before the current datetime
         */
        public String dateFrom;
  public ListA2PsmsParameters dateFrom(String dateFrom)
  {
    this.dateFrom = dateFrom;
    return this;
  }
  

        /**
         * Date to filter message list result. Messages with `creationTime` earlier than `dateTo` value are returned. The default is the current datetime
         */
        public String dateTo;
  public ListA2PsmsParameters dateTo(String dateTo)
  {
    this.dateTo = dateTo;
    return this;
  }
  

        /**
         * List of phone numbers (specified in 'to' or 'from' fields of a message) to filter the results. Maximum number of phone numbers allowed to be specified as filters is 15
         */
        public String[] phoneNumber;
  public ListA2PsmsParameters phoneNumber(String[] phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Token of a page to be retrieved
         */
        public String pageToken;
  public ListA2PsmsParameters pageToken(String pageToken)
  {
    this.pageToken = pageToken;
    return this;
  }
  

        /**
         * Number of messages to be returned per request
         * Default: 1000
         */
        public Long perPage;
  public ListA2PsmsParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
