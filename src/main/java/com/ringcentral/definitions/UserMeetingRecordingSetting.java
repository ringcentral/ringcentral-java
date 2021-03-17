package com.ringcentral.definitions;


    // Meeting recording settings locked on account level
public class UserMeetingRecordingSetting
{
    /**
         * Allows hosts and participants to record a meeting to a local file
         */
        public Boolean localRecording;
  public UserMeetingRecordingSetting localRecording(Boolean localRecording)
  {
    this.localRecording = localRecording;
    return this;
  }
  

        /**
         * Allows hosts to record and save a meeting/webinar in the cloud
         */
        public Boolean cloudRecording;
  public UserMeetingRecordingSetting cloudRecording(Boolean cloudRecording)
  {
    this.cloudRecording = cloudRecording;
    return this;
  }
  

        /**
         * Allows to record active speaker with the shared screen
         */
        public Boolean recordSpeakerView;
  public UserMeetingRecordingSetting recordSpeakerView(Boolean recordSpeakerView)
  {
    this.recordSpeakerView = recordSpeakerView;
    return this;
  }
  

        /**
         * Allows to record gallery view with the shared screen
         */
        public Boolean recordGalleryView;
  public UserMeetingRecordingSetting recordGalleryView(Boolean recordGalleryView)
  {
    this.recordGalleryView = recordGalleryView;
    return this;
  }
  

        /**
         * Allows to record an audio-only file
         */
        public Boolean recordAudioFile;
  public UserMeetingRecordingSetting recordAudioFile(Boolean recordAudioFile)
  {
    this.recordAudioFile = recordAudioFile;
    return this;
  }
  

        /**
         * Allows to save chat text from a meeting
         */
        public Boolean saveChatText;
  public UserMeetingRecordingSetting saveChatText(Boolean saveChatText)
  {
    this.saveChatText = saveChatText;
    return this;
  }
  

        /**
         * Allows to show timestamp on video
         */
        public Boolean showTimestamp;
  public UserMeetingRecordingSetting showTimestamp(Boolean showTimestamp)
  {
    this.showTimestamp = showTimestamp;
    return this;
  }
  

        /**
         * Automatical recording (local/cloud/none) of meetings as they start
         * Default: local
         * Enum: local, cloud, none
         */
        public String autoRecording;
  public UserMeetingRecordingSetting autoRecording(String autoRecording)
  {
    this.autoRecording = autoRecording;
    return this;
  }
  

        /**
         * Automatical deletion of cloud recordings
         * Default: false
         */
        public String autoDeleteCmr;
  public UserMeetingRecordingSetting autoDeleteCmr(String autoDeleteCmr)
  {
    this.autoDeleteCmr = autoDeleteCmr;
    return this;
  }
  

        /**
         * A specified number of days for automatical deletion of cloud recordings, the value range is 1-60
         */
        public Long autoDeleteCmrDays;
  public UserMeetingRecordingSetting autoDeleteCmrDays(Long autoDeleteCmrDays)
  {
    this.autoDeleteCmrDays = autoDeleteCmrDays;
    return this;
  }
  
}
