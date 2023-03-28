package com.ringcentral.definitions;


public class BridgeJoinPreferences {
    /**
     * Specifies if audio is muted for meeting participants (in the preset after joining)
     */
    public Boolean audioMuted;
    /**
     * Specifies if video is muted for meeting participants (in the preset after joining)
     */
    public Boolean videoMuted;
    /**
     * Specifies rules for the waiting room before the host starts the meeting.
     * 1) Nobody - No waiting room. Participants are not waiting for meeting start.
     * 2) Everybody - All participants are waiting for meeting start.
     * 3) GuestsOnly - Only unauthenticated participants (guests) are waiting for meeting start.
     * 4) OtherAccount - Only participants who have other account are waiting for meeting start.
     * <p>
     * Default value depends on the bridge type:
     * - PMI -&gt; OtherAccount
     * - Instant, Scheduled -&gt; Nobody
     * Example: Nobody
     * Enum: Nobody, Everybody, GuestsOnly, OtherAccount
     */
    public String waitingRoomRequired;
    /**
     *
     */
    public BridgeJoinPstnPreferences pstn;

    public BridgeJoinPreferences audioMuted(Boolean audioMuted) {
        this.audioMuted = audioMuted;
        return this;
    }

    public BridgeJoinPreferences videoMuted(Boolean videoMuted) {
        this.videoMuted = videoMuted;
        return this;
    }

    public BridgeJoinPreferences waitingRoomRequired(String waitingRoomRequired) {
        this.waitingRoomRequired = waitingRoomRequired;
        return this;
    }

    public BridgeJoinPreferences pstn(BridgeJoinPstnPreferences pstn) {
        this.pstn = pstn;
        return this;
    }
}
