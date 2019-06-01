package com.ringcentral.definitions;


public class GetCallRecordingResponse {
    /**
     * Internal identifier of a call recording
     */
    public String id;
    /**
     * Link to a call recording binary content
     */
    public String contentUri;
    /**
     * Call recording file format. Supported format is audio/x-wav
     */
    public String contentType;
    /**
     * Recorded call duration
     */
    public Long duration;

    public GetCallRecordingResponse id(String id) {
        this.id = id;
        return this;
    }

    public GetCallRecordingResponse contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public GetCallRecordingResponse contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public GetCallRecordingResponse duration(Long duration) {
        this.duration = duration;
        return this;
    }

}
