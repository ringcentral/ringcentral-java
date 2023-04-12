package com.ringcentral.definitions;


public class RecordingSharingModel {
    /**
     * Shared URI of the recording. If a password was required to join a webinar, the URI should contain the password encoded
     * Required
     * Format: uri
     * Example: https://v.ringcentral.com/w/a/recording/de7yd8ew7yfsdfjh899843rgj?pw=a1b2c3d4
     */
    public String recordingSharedUri;

    public RecordingSharingModel recordingSharedUri(String recordingSharedUri) {
        this.recordingSharedUri = recordingSharedUri;
        return this;
    }
}
