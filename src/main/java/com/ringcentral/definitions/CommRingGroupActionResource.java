package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommRingGroupActionResource {
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
     * Target information
     * Required
     */
    public CommRingGroupActionResourceTargets[] targets;
    /**
     * Custom start time in seconds. Applicable for &#039;Custom&#039; dispatching type
     * Format: int32
     * Example: 5
     */
    public Long customStartOffset;
    /**
     * Duration of calling in seconds
     * Required
     * Format: int32
     * Example: 5
     */
    public Long duration;

    public CommRingGroupActionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommRingGroupActionResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommRingGroupActionResource targets(CommRingGroupActionResourceTargets[] targets) {
        this.targets = targets;
        return this;
    }

    public CommRingGroupActionResource customStartOffset(Long customStartOffset) {
        this.customStartOffset = customStartOffset;
        return this;
    }

    public CommRingGroupActionResource duration(Long duration) {
        this.duration = duration;
        return this;
    }
}
