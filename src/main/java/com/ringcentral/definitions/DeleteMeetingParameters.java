package com.ringcentral.definitions;


/**
 * Query parameters for operation deleteMeeting
 */
public class DeleteMeetingParameters {
    /**
     * Internal identifier of a recurrent meeting occurrence
     */
    public String occurrenceId;

    public DeleteMeetingParameters occurrenceId(String occurrenceId) {
        this.occurrenceId = occurrenceId;
        return this;
    }
}
