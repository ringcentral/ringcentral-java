package com.ringcentral.definitions;


public class AutomaticRecordingResource
{
    /**
         * Flag for controling Automatic Call Recording settings
         */
        public Boolean enabled;
  public AutomaticRecordingResource enabled(Boolean enabled)
  {
    this.enabled = enabled;
    return this;
  }
  

        /**
         * Flag for controlling 'Play Call Recording Announcement for Outbound Calls' settings
         */
        public Boolean outboundCallTones;
  public AutomaticRecordingResource outboundCallTones(Boolean outboundCallTones)
  {
    this.outboundCallTones = outboundCallTones;
    return this;
  }
  

        /**
         * Flag for controlling 'Play periodic tones for outbound calls' settings
         */
        public Boolean outboundCallAnnouncement;
  public AutomaticRecordingResource outboundCallAnnouncement(Boolean outboundCallAnnouncement)
  {
    this.outboundCallAnnouncement = outboundCallAnnouncement;
    return this;
  }
  

        /**
         * Flag for controlling 'Allow mute in auto call recording' settings
         */
        public Boolean allowMute;
  public AutomaticRecordingResource allowMute(Boolean allowMute)
  {
    this.allowMute = allowMute;
    return this;
  }
  

        /**
         * Total amount of extension that are used in call recordings
         */
        public Long extensionCount;
  public AutomaticRecordingResource extensionCount(Long extensionCount)
  {
    this.extensionCount = extensionCount;
    return this;
  }
  

        /**
         * Retention period of a call recording, the default value is 90 days
         */
        public Long retentionPeriod;
  public AutomaticRecordingResource retentionPeriod(Long retentionPeriod)
  {
    this.retentionPeriod = retentionPeriod;
    return this;
  }
  

        /**
         * Max number of automatic call recordings per account, the default value is 100 000
         */
        public Long maxNumberLimit;
  public AutomaticRecordingResource maxNumberLimit(Long maxNumberLimit)
  {
    this.maxNumberLimit = maxNumberLimit;
    return this;
  }
  
}
