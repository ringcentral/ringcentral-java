package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommRingAlwaysGroupActionRequest {
    /**
     * Required
     * Example: RingAlwaysGroupAction
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
    public CommRingAlwaysGroupActionRequestTargets[] targets;

    public CommRingAlwaysGroupActionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommRingAlwaysGroupActionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommRingAlwaysGroupActionRequest targets(CommRingAlwaysGroupActionRequestTargets[] targets) {
        this.targets = targets;
        return this;
    }
}
