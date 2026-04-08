package com.ringcentral.definitions;

/** Action information */
public class CommRingAlwaysGroupActionRequest {
    /**
     * Required Example: RingAlwaysGroupAction Enum: PlayConnectingMessageAction,
     * PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction,
     * RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommRingAlwaysGroupActionRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Specifies if an action is enabled Required */
    public Boolean enabled;

    public CommRingAlwaysGroupActionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** Target information Required */
    public CommRingAlwaysGroupActionRequestTargets[] targets;

    public CommRingAlwaysGroupActionRequest targets(
            CommRingAlwaysGroupActionRequestTargets[] targets) {
        this.targets = targets;
        return this;
    }
}
