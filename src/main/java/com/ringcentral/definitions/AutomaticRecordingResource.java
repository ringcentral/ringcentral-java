package com.ringcentral.definitions;


public class AutomaticRecordingResource {
    /**
     * Flag for controlling Automatic Call Recording settings
     */
    public Boolean enabled;
    /**
     * Flag for controlling &#039;Play Call Recording Announcement for Outbound Calls&#039; settings
     */
    public Boolean outboundCallTones;
    /**
     * Flag for controlling &#039;Play periodic tones for outbound calls&#039; settings
     */
    public Boolean outboundCallAnnouncement;
    /**
     * Flag for controlling &#039;Allow mute in auto call recording&#039; settings
     */
    public Boolean allowMute;
    /**
     * Total amount of extension that are used in call recordings
     * Format: int32
     */
    public Long extensionCount;
    /**
     * Retention period of a call recording, the default value is 90 days
     * Format: int32
     */
    public Long retentionPeriod;
    /**
     * Maximum number of automatic call recordings per account, the default value is 100 000
     * Format: int32
     */
    public Long maxNumberLimit;

    public AutomaticRecordingResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AutomaticRecordingResource outboundCallTones(Boolean outboundCallTones) {
        this.outboundCallTones = outboundCallTones;
        return this;
    }

    public AutomaticRecordingResource outboundCallAnnouncement(Boolean outboundCallAnnouncement) {
        this.outboundCallAnnouncement = outboundCallAnnouncement;
        return this;
    }

    public AutomaticRecordingResource allowMute(Boolean allowMute) {
        this.allowMute = allowMute;
        return this;
    }

    public AutomaticRecordingResource extensionCount(Long extensionCount) {
        this.extensionCount = extensionCount;
        return this;
    }

    public AutomaticRecordingResource retentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    public AutomaticRecordingResource maxNumberLimit(Long maxNumberLimit) {
        this.maxNumberLimit = maxNumberLimit;
        return this;
    }
}
