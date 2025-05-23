package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommTerminatingActionRequest {
    /**
     * Action type
     * Required
     * Example: TerminatingAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    /**
     * Action information
     * Required
     */
    public CommTerminatingActionRequestTargets[] targets;
    /**
     * Example: VoiceMailTerminatingTarget
     */
    public String ringingTargetType;
    /**
     * Example: VoiceMailTerminatingTarget
     */
    public String terminatingTargetType;

    public CommTerminatingActionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommTerminatingActionRequest targets(CommTerminatingActionRequestTargets[] targets) {
        this.targets = targets;
        return this;
    }

    public CommTerminatingActionRequest ringingTargetType(String ringingTargetType) {
        this.ringingTargetType = ringingTargetType;
        return this;
    }

    public CommTerminatingActionRequest terminatingTargetType(String terminatingTargetType) {
        this.terminatingTargetType = terminatingTargetType;
        return this;
    }
}
