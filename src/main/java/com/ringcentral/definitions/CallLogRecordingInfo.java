package com.ringcentral.definitions;


    // Call recording data. Returned if the call is recorded - `withRecording` parameter is set to 'True' in this case
public class CallLogRecordingInfo
{
    /**
         * Internal identifier of the call recording
         */
        public String id;
  public CallLogRecordingInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to the call recording metadata resource
         */
        public String uri;
  public CallLogRecordingInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Indicates recording mode used
         * Enum: Automatic, OnDemand
         */
        public String type;
  public CallLogRecordingInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Link to the call recording binary content
         */
        public String contentUri;
  public CallLogRecordingInfo contentUri(String contentUri)
  {
    this.contentUri = contentUri;
    return this;
  }
  
}
