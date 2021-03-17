package com.ringcentral.definitions;


public class ReadUserCallLogParameters
{
    /**
         * Extension number of a user. If specified, returns call log for a particular extension only
         */
        public String extensionNumber;
  public ReadUserCallLogParameters extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * If 'True' then calls from/to blocked numbers are returned
         * Default: true
         */
        public Boolean showBlocked;
  public ReadUserCallLogParameters showBlocked(Boolean showBlocked)
  {
    this.showBlocked = showBlocked;
    return this;
  }
  

        /**
         * Phone number of a caller/callee. If specified, returns all calls (both incoming and outcoming) with the phone number specified
         */
        public String phoneNumber;
  public ReadUserCallLogParameters phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * The direction for the resulting records. If not specified, both inbound and outbound records are returned. Multiple values are accepted
         */
        public String[] direction;
  public ReadUserCallLogParameters direction(String[] direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * Internal identifier of a session
         */
        public String sessionId;
  public ReadUserCallLogParameters sessionId(String sessionId)
  {
    this.sessionId = sessionId;
    return this;
  }
  

        /**
         * Call type of a record. It is allowed to specify more than one type. If not specified, all call types are returned. Multiple values are accepted
         */
        public String[] type;
  public ReadUserCallLogParameters type(String[] type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Call transport type. 'PSTN' specifies that a call leg is initiated from the PSTN network provider; 'VoIP' - from an RC phone. By default this filter is disabled
         */
        public String[] transport;
  public ReadUserCallLogParameters transport(String[] transport)
  {
    this.transport = transport;
    return this;
  }
  

        /**
         * View of call records. The same view parameter specified for FSync will be applied for ISync, the view cannot be changed for ISync
         * Default: Simple
         * Enum: Simple, Detailed
         */
        public String view;
  public ReadUserCallLogParameters view(String view)
  {
    this.view = view;
    return this;
  }
  

        /**
         * **Deprecated**. Supported for compatibility reasons. `True` if only recorded calls are returned. If both `withRecording` and `recordingType` are specified, then `withRecording` is ignored
         */
        public Boolean withRecording;
  public ReadUserCallLogParameters withRecording(Boolean withRecording)
  {
    this.withRecording = withRecording;
    return this;
  }
  

        /**
         * Type of a call recording. If not specified, then calls without recordings are also returned
         * Enum: Automatic, OnDemand, All
         */
        public String recordingType;
  public ReadUserCallLogParameters recordingType(String recordingType)
  {
    this.recordingType = recordingType;
    return this;
  }
  

        /**
         * The end datetime for resulting records in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
         */
        public String dateTo;
  public ReadUserCallLogParameters dateTo(String dateTo)
  {
    this.dateTo = dateTo;
    return this;
  }
  

        /**
         * The start datetime for resulting records in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
         */
        public String dateFrom;
  public ReadUserCallLogParameters dateFrom(String dateFrom)
  {
    this.dateFrom = dateFrom;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are allowed
         * Default: 1
         */
        public Long page;
  public ReadUserCallLogParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public Long perPage;
  public ReadUserCallLogParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * If 'True' then deleted calls are returned
         */
        public Boolean showDeleted;
  public ReadUserCallLogParameters showDeleted(Boolean showDeleted)
  {
    this.showDeleted = showDeleted;
    return this;
  }
  
}
