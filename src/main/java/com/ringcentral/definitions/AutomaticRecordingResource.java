package com.ringcentral.definitions;


public class AutomaticRecordingResource {
    /**
     * Flag for controling Automatic Call Recording settings
     */
    public Boolean enabled;
    /**
     * Flag for controlling 'Play Call Recording Announcement for Outbound Calls' settings
     */
    public Boolean outboundCallTones;
    /**
     * Flag for controlling 'Play periodic tones for outbound calls' settings
     */
    public Boolean outboundCallAnnouncement;
    /**
     * Flag for controlling 'Allow mute in auto call recording' settings
     */
    public Boolean allowMute;
    /**
     * Total amount of extension that are used in call recordings
     */
    public Long extensionCount;

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

}
