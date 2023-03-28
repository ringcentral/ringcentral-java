package com.ringcentral.definitions;


/**
 * Meeting recording settings locked on account level
 */
public class UserMeetingRecordingSetting {
    /**
     * Allows hosts and participants to record a meeting to a local file
     */
    public Boolean localRecording;
    /**
     * Allows hosts to record and save a meeting/webinar in the cloud
     */
    public Boolean cloudRecording;
    /**
     * Allows to record active speaker with the shared screen
     */
    public Boolean recordSpeakerView;
    /**
     * Allows to record gallery view with the shared screen
     */
    public Boolean recordGalleryView;
    /**
     * Allows to record an audio-only file
     */
    public Boolean recordAudioFile;
    /**
     * Allows to save chat text from a meeting
     */
    public Boolean saveChatText;
    /**
     * Allows to show timestamp on video
     */
    public Boolean showTimestamp;
    /**
     * Automatic recording (local/cloud/none) of meetings as they start
     * Default: local
     * Enum: local, cloud, none
     */
    public String autoRecording;
    /**
     * Automatic deletion of cloud recordings
     * Default: false
     */
    public String autoDeleteCmr;
    /**
     * A specified number of days for automatic deletion of cloud recordings, the value range is 1-60
     * Format: int32
     */
    public Long autoDeleteCmrDays;

    public UserMeetingRecordingSetting localRecording(Boolean localRecording) {
        this.localRecording = localRecording;
        return this;
    }

    public UserMeetingRecordingSetting cloudRecording(Boolean cloudRecording) {
        this.cloudRecording = cloudRecording;
        return this;
    }

    public UserMeetingRecordingSetting recordSpeakerView(Boolean recordSpeakerView) {
        this.recordSpeakerView = recordSpeakerView;
        return this;
    }

    public UserMeetingRecordingSetting recordGalleryView(Boolean recordGalleryView) {
        this.recordGalleryView = recordGalleryView;
        return this;
    }

    public UserMeetingRecordingSetting recordAudioFile(Boolean recordAudioFile) {
        this.recordAudioFile = recordAudioFile;
        return this;
    }

    public UserMeetingRecordingSetting saveChatText(Boolean saveChatText) {
        this.saveChatText = saveChatText;
        return this;
    }

    public UserMeetingRecordingSetting showTimestamp(Boolean showTimestamp) {
        this.showTimestamp = showTimestamp;
        return this;
    }

    public UserMeetingRecordingSetting autoRecording(String autoRecording) {
        this.autoRecording = autoRecording;
        return this;
    }

    public UserMeetingRecordingSetting autoDeleteCmr(String autoDeleteCmr) {
        this.autoDeleteCmr = autoDeleteCmr;
        return this;
    }

    public UserMeetingRecordingSetting autoDeleteCmrDays(Long autoDeleteCmrDays) {
        this.autoDeleteCmrDays = autoDeleteCmrDays;
        return this;
    }
}
