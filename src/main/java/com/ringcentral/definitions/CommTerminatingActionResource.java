package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommTerminatingActionResource {
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
    public CommTerminatingActionResourceTargets[] targets;
    /**
     * Terminating target type
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String ringingTargetType;
    /**
     * Terminating target type
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String terminatingTargetType;

    public CommTerminatingActionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommTerminatingActionResource targets(CommTerminatingActionResourceTargets[] targets) {
        this.targets = targets;
        return this;
    }

    public CommTerminatingActionResource ringingTargetType(String ringingTargetType) {
        this.ringingTargetType = ringingTargetType;
        return this;
    }

    public CommTerminatingActionResource terminatingTargetType(String terminatingTargetType) {
        this.terminatingTargetType = terminatingTargetType;
        return this;
    }
}
