package com.ringcentral.definitions;


public class GetCallRecordingResponse
{
    /**
     * Internal identifier of a call recording
     */
    public String id;
    public GetCallRecordingResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link to a call recording binary content. Has to be retrieved with proper authorization
    * (access token must be passed via `Authorization` header or query parameter)
     * Format: uri
     */
    public String contentUri;
    public GetCallRecordingResponse contentUri(String contentUri)
    {
        this.contentUri = contentUri;
        return this;
    }

    /**
     * Call recording file format. Supported format is audio/x-wav
     */
    public String contentType;
    public GetCallRecordingResponse contentType(String contentType)
    {
        this.contentType = contentType;
        return this;
    }

    /**
     * Recorded call duration
     * Format: int32
     */
    public Long duration;
    public GetCallRecordingResponse duration(Long duration)
    {
        this.duration = duration;
        return this;
    }
}