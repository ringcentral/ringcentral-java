package com.ringcentral.definitions;


public class FaxMessageAttachment
{
    /**
         * Internal identifier of a message attachment
         */
        public String id;
  public FaxMessageAttachment id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of a message attachment
         */
        public String uri;
  public FaxMessageAttachment uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Type of message attachment
         * Enum: AudioRecording, AudioTranscription, Text, SourceDocument, RenderedDocument, MmsAttachment
         */
        public String type;
  public FaxMessageAttachment type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * MIME type for a given attachment, for instance 'audio/wav'
         */
        public String contentType;
  public FaxMessageAttachment contentType(String contentType)
  {
    this.contentType = contentType;
    return this;
  }
  

        /**
         * Name of a file attached
         */
        public String filename;
  public FaxMessageAttachment filename(String filename)
  {
    this.filename = filename;
    return this;
  }
  

        /**
         * Size of attachment in bytes
         */
        public Long size;
  public FaxMessageAttachment size(Long size)
  {
    this.size = size;
    return this;
  }
  
}
