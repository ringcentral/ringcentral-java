package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommRingAlwaysGroupActionResource {
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
     * Required
     */
    public CommRingAlwaysGroupActionResourceTargets[] targets;

    public CommRingAlwaysGroupActionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommRingAlwaysGroupActionResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommRingAlwaysGroupActionResource targets(CommRingAlwaysGroupActionResourceTargets[] targets) {
        this.targets = targets;
        return this;
    }
}
