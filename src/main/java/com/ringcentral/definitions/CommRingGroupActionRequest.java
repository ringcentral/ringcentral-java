package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommRingGroupActionRequest {
    /**
     * Action type
     * Required
     * Example: RingGroupAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;
    /**
     * Required
     */
    public CommRingGroupActionRequestTargets[] targets;
    /**
     * Custom start time. Applicable for &#039;Custom&#039; dispatching type
     * Format: int32
     * Example: 5
     */
    public Long customStartOffset;
    /**
     * Duration of calling
     * Required
     * Format: int32
     * Example: 5
     */
    public Long duration;

    public CommRingGroupActionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommRingGroupActionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommRingGroupActionRequest targets(CommRingGroupActionRequestTargets[] targets) {
        this.targets = targets;
        return this;
    }

    public CommRingGroupActionRequest customStartOffset(Long customStartOffset) {
        this.customStartOffset = customStartOffset;
        return this;
    }

    public CommRingGroupActionRequest duration(Long duration) {
        this.duration = duration;
        return this;
    }
}
