package com.ringcentral.definitions;

/** Action information */
public class CommTerminatingActionResource {
    /**
     * Action type Required Example: TerminatingAction Enum: PlayConnectingMessageAction,
     * PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction,
     * RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommTerminatingActionResource type(String type) {
        this.type = type;
        return this;
    }

    /** Action information Required */
    public CommTerminatingActionResourceTargets[] targets;

    public CommTerminatingActionResource targets(CommTerminatingActionResourceTargets[] targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Terminating target type Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget,
     * PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String ringingTargetType;

    public CommTerminatingActionResource ringingTargetType(String ringingTargetType) {
        this.ringingTargetType = ringingTargetType;
        return this;
    }

    /**
     * Terminating target type Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget,
     * PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String terminatingTargetType;

    public CommTerminatingActionResource terminatingTargetType(String terminatingTargetType) {
        this.terminatingTargetType = terminatingTargetType;
        return this;
    }
}
