package com.ringcentral.definitions;

/**
 * This objects denotes availability of AI generated meeting notes of certain type as post meeting
 * artefact. The note's content can be accessed via POST
 * '/rcvideo/v1/history/meetings/{meetingId}/access-materials' or POST '/rcvideo/v1/history/links'
 * APIs
 */
public class MeetingNotes {
    /** Required */
    public String id;

    public MeetingNotes id(String id) {
        this.id = id;
        return this;
    }

    /** Required Enum: GeneratedNotes */
    public String type;

    public MeetingNotes type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Generated notes processing status `Processing` - meeting is finished and generated notes
     * haven&#039;t been processed yet `Processed` - generated notes successfully processed `Failed`
     * - generated notes processing finished with error `Purged` - generated notes were removed
     * Required Enum: Processing, Processed, Purged, Failed
     */
    public String status;

    public MeetingNotes status(String status) {
        this.status = status;
        return this;
    }
}
