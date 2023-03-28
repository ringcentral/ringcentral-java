package com.ringcentral.definitions;


public class BridgePreferences {
    /**
     *
     */
    public BridgeJoinPreferences join;
    /**
     * Specifies enter and exit tones mode.
     * 1) On - Enter and exit tones switched on.
     * 2) Off - Enter and exit tones switched off.
     * 3) ExitOnly - Only exit tones switched on.
     * 4) EnterOnly - Only enter tones switched on.
     * Default: Off
     * Enum: On, Off, ExitOnly, EnterOnly
     */
    public String playTones;
    /**
     * Specifies whether to play music on hold when alone
     * Default: true
     */
    public Boolean musicOnHold;
    /**
     * Specifies if participants can join to a meeting before host.
     * Default value depends on the bridge type:
     * - default bridge (PMI) -&gt; false
     * - other types -&gt; true
     * Example: true
     */
    public Boolean joinBeforeHost;
    /**
     * Specifies if screen sharing is allowed
     * Default: true
     */
    public Boolean screenSharing;
    /**
     * Controls whether recordings are enabled automatically or by user decision
     * Example: User
     * Enum: Auto, ForceAuto, User
     */
    public String recordingsMode;
    /**
     * Controls whether transcriptions are enabled automatically or by user decision
     * Example: User
     * Enum: Auto, ForceAuto, User
     */
    public String transcriptionsMode;
    /**
     *
     */
    public RecordingsPreferences recordings;
    /**
     * Controls whether participants can start and pause transcription
     * Default: true
     */
    public Boolean allowEveryoneTranscribeMeetings;

    public BridgePreferences join(BridgeJoinPreferences join) {
        this.join = join;
        return this;
    }

    public BridgePreferences playTones(String playTones) {
        this.playTones = playTones;
        return this;
    }

    public BridgePreferences musicOnHold(Boolean musicOnHold) {
        this.musicOnHold = musicOnHold;
        return this;
    }

    public BridgePreferences joinBeforeHost(Boolean joinBeforeHost) {
        this.joinBeforeHost = joinBeforeHost;
        return this;
    }

    public BridgePreferences screenSharing(Boolean screenSharing) {
        this.screenSharing = screenSharing;
        return this;
    }

    public BridgePreferences recordingsMode(String recordingsMode) {
        this.recordingsMode = recordingsMode;
        return this;
    }

    public BridgePreferences transcriptionsMode(String transcriptionsMode) {
        this.transcriptionsMode = transcriptionsMode;
        return this;
    }

    public BridgePreferences recordings(RecordingsPreferences recordings) {
        this.recordings = recordings;
        return this;
    }

    public BridgePreferences allowEveryoneTranscribeMeetings(Boolean allowEveryoneTranscribeMeetings) {
        this.allowEveryoneTranscribeMeetings = allowEveryoneTranscribeMeetings;
        return this;
    }
}
