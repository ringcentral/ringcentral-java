package com.ringcentral.definitions;


public class VoicemailsInfo
{
    /**
         * Email notification flag
         */
        public Boolean notifyByEmail;
  public VoicemailsInfo notifyByEmail(Boolean notifyByEmail)
  {
    this.notifyByEmail = notifyByEmail;
    return this;
  }
  

        /**
         * SMS notification flag
         */
        public Boolean notifyBySms;
  public VoicemailsInfo notifyBySms(Boolean notifyBySms)
  {
    this.notifyBySms = notifyBySms;
    return this;
  }
  

        /**
         * List of recipient email addresses for voicemail notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
         */
        public String[] advancedEmailAddresses;
  public VoicemailsInfo advancedEmailAddresses(String[] advancedEmailAddresses)
  {
    this.advancedEmailAddresses = advancedEmailAddresses;
    return this;
  }
  

        /**
         * List of recipient phone numbers for voicemail notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
         */
        public String[] advancedSmsEmailAddresses;
  public VoicemailsInfo advancedSmsEmailAddresses(String[] advancedSmsEmailAddresses)
  {
    this.advancedSmsEmailAddresses = advancedSmsEmailAddresses;
    return this;
  }
  

        /**
         * Indicates whether voicemail should be attached to email
         */
        public Boolean includeAttachment;
  public VoicemailsInfo includeAttachment(Boolean includeAttachment)
  {
    this.includeAttachment = includeAttachment;
    return this;
  }
  

        /**
         * Specifies whether to add voicemail transcription or not
         */
        public Boolean includeTranscription;
  public VoicemailsInfo includeTranscription(Boolean includeTranscription)
  {
    this.includeTranscription = includeTranscription;
    return this;
  }
  

        /**
         * Indicates whether a voicemail should be automatically marked as read
         */
        public Boolean markAsRead;
  public VoicemailsInfo markAsRead(Boolean markAsRead)
  {
    this.markAsRead = markAsRead;
    return this;
  }
  
}
