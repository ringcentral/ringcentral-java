package com.ringcentral.definitions;

public class CustomGreetingInfo {
    // Link to an extension custom greeting
    public String uri;
    // Internal identifier of an answering rule
    public String id;
    // Type of a greeting, specifying the case when the greeting is played. See also Greeting Types
    public String type;
    // Content media type in WAV/MP3 format
    public String contentType;
    // Link to a greeting content (audio file)
    public String contentUri;
}
