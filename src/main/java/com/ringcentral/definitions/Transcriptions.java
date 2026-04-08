package com.ringcentral.definitions;

/**
 * This objects denotes availability of transcription of certain type as post meeting artefact. The
 * trancript's content can be accessed via via POST
 * '/rcvideo/v1/history/meetings/{meetingId}/access-materials' or POST '/rcvideo/v1/history/links'
 * APIs
 */
public class Transcriptions {
    /** Required */
    public String id;

    public Transcriptions id(String id) {
        this.id = id;
        return this;
    }

    /** Required Enum: LiveTranscription */
    public String type;

    public Transcriptions type(String type) {
        this.type = type;
        return this;
    }
}
