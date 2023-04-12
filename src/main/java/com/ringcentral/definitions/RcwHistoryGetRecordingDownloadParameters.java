package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwHistoryGetRecordingDownload
 */
public class RcwHistoryGetRecordingDownloadParameters {
    /**
     * Recording file media type. &#039;Video&#039; implies multiplexed audio and video. &#039;Audio&#039; refers to audio only.
     * Example: Video
     * Default: Video
     * Enum: Video, Audio
     */
    public String recordingMediaType;

    public RcwHistoryGetRecordingDownloadParameters recordingMediaType(String recordingMediaType) {
        this.recordingMediaType = recordingMediaType;
        return this;
    }
}
