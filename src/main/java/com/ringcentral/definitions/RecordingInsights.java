package com.ringcentral.definitions;

public class RecordingInsights {
    /** Title of the call Required Example: Call from 1234567890 to 0987654321 */
    public String title;

    public RecordingInsights title(String title) {
        this.title = title;
        return this;
    }

    /**
     * URI of the call recording Example:
     * https://ringsense.ringcentral.com/calls/2e67979e-ff82-4171-ae30-20c0c1f19b27
     */
    public String rsRecordUri;

    public RecordingInsights rsRecordUri(String rsRecordUri) {
        this.rsRecordUri = rsRecordUri;
        return this;
    }

    /**
     * Source rc application of the recording Required Example: pbx Enum: pbx, rcv, rcx,
     * nice-incontact, ms-teams
     */
    public String domain;

    public RecordingInsights domain(String domain) {
        this.domain = domain;
        return this;
    }

    /** Recording ID of the domain Required Example: 4b57_384543 */
    public String sourceRecordId;

    public RecordingInsights sourceRecordId(String sourceRecordId) {
        this.sourceRecordId = sourceRecordId;
        return this;
    }

    /**
     * Session ID of the domain Required Example:
     * cbac2b78-6f74-4257-8167-dff864de2263!us-10-dca09@us-10
     */
    public String sourceSessionId;

    public RecordingInsights sourceSessionId(String sourceSessionId) {
        this.sourceSessionId = sourceSessionId;
        return this;
    }

    /**
     * Optional call direction in case of phone call recording Example: Inbound Enum: Inbound,
     * Outbound
     */
    public String callDirection;

    public RecordingInsights callDirection(String callDirection) {
        this.callDirection = callDirection;
        return this;
    }

    /** Extension id of the call recording owner Required Example: 123456789 */
    public String ownerExtensionId;

    public RecordingInsights ownerExtensionId(String ownerExtensionId) {
        this.ownerExtensionId = ownerExtensionId;
        return this;
    }

    /** Duration of the call recording (in ms) Required Format: int32 Example: 112000 */
    public Long recordingDurationMs;

    public RecordingInsights recordingDurationMs(Long recordingDurationMs) {
        this.recordingDurationMs = recordingDurationMs;
        return this;
    }

    /** Start time of the call recording Required Format: date-time */
    public String recordingStartTime;

    public RecordingInsights recordingStartTime(String recordingStartTime) {
        this.recordingStartTime = recordingStartTime;
        return this;
    }

    /** Creation time of the call insights Required Format: date-time */
    public String creationTime;

    public RecordingInsights creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Last modified time of the call insights Required Format: date-time */
    public String lastModifiedTime;

    public RecordingInsights lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** List of the participants in the call Required */
    public Object[] speakerInfo;

    public RecordingInsights speakerInfo(Object[] speakerInfo) {
        this.speakerInfo = speakerInfo;
        return this;
    }

    /** Required */
    public AIInsights insights;

    public RecordingInsights insights(AIInsights insights) {
        this.insights = insights;
        return this;
    }
}
