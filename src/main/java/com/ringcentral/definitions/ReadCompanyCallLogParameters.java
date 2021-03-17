package com.ringcentral.definitions;


public class ReadCompanyCallLogParameters
{
    /**
         * Extension number of a user. If specified, returns call log for a particular extension only
         */
        public String extensionNumber;
  public ReadCompanyCallLogParameters extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * Phone number of a caller/call recipient. If specified, returns all calls (both incoming and outcoming) with the phone number specified. Cannot be specified together with the extensionNumber filter
         */
        public String phoneNumber;
  public ReadCompanyCallLogParameters phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * The direction for the result records. If not specified, both inbound and outbound records are returned. Multiple values are accepted
         */
        public String[] direction;
  public ReadCompanyCallLogParameters direction(String[] direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * Call type of a record. If not specified, all call types are returned. Multiple values are accepted
         */
        public String[] type;
  public ReadCompanyCallLogParameters type(String[] type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * View of call records. The same view parameter specified for FSync will be applied for ISync, the view cannot be changed for ISync
         * Default: Simple
         * Enum: Simple, Detailed
         */
        public String view;
  public ReadCompanyCallLogParameters view(String view)
  {
    this.view = view;
    return this;
  }
  

        /**
         * **Deprecated**. Supported for compatibility reasons only. `true` if only recorded calls are returned. The default value is `false`. If both `withRecording` and `recordingType` are specified, `withRecording` is ignored
         */
        public Boolean withRecording;
  public ReadCompanyCallLogParameters withRecording(Boolean withRecording)
  {
    this.withRecording = withRecording;
    return this;
  }
  

        /**
         * Type of a call recording. If not specified, then calls without recordings are also returned
         * Enum: Automatic, OnDemand, All
         */
        public String recordingType;
  public ReadCompanyCallLogParameters recordingType(String recordingType)
  {
    this.recordingType = recordingType;
    return this;
  }
  

        /**
         * The start datetime for resulting records in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601]  format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
         */
        public String dateFrom;
  public ReadCompanyCallLogParameters dateFrom(String dateFrom)
  {
    this.dateFrom = dateFrom;
    return this;
  }
  

        /**
         * The end datetime for resulting records in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601]  format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
         */
        public String dateTo;
  public ReadCompanyCallLogParameters dateTo(String dateTo)
  {
    this.dateTo = dateTo;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are accepted
         * Default: 1
         */
        public Long page;
  public ReadCompanyCallLogParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public Long perPage;
  public ReadCompanyCallLogParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * Internal identifier of a call session
         */
        public String sessionId;
  public ReadCompanyCallLogParameters sessionId(String sessionId)
  {
    this.sessionId = sessionId;
    return this;
  }
  
}
