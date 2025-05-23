package com.ringcentral.definitions;


public class CommStateDispatchingResourceActions {
    /**
     * Action type
     * Example: TerminatingAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    /**
     *
     */
    public CommGreetingResource greeting;
    /**
     * Specifies if an action is enabled
     */
    public Boolean enabled;
    /**
     * Screening type
     * Enum: NoCallerId, UnknownCallerId, Always
     */
    public String screening;
    /**
     * Enum: AskToAnswer, PlayCallerNameOnly
     */
    public String screeningResult;
    /**
     * Action information
     */
    public CommStateDispatchingResourceActionsTargets[] targets;
    /**
     * Custom start time in seconds. Applicable for &#039;Custom&#039; dispatching type
     * Format: int32
     * Example: 5
     */
    public Long customStartOffset;
    /**
     * Duration of calling in seconds
     * Format: int32
     * Example: 5
     */
    public Long duration;
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

    public CommStateDispatchingResourceActions type(String type) {
        this.type = type;
        return this;
    }

    public CommStateDispatchingResourceActions greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    public CommStateDispatchingResourceActions enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommStateDispatchingResourceActions screening(String screening) {
        this.screening = screening;
        return this;
    }

    public CommStateDispatchingResourceActions screeningResult(String screeningResult) {
        this.screeningResult = screeningResult;
        return this;
    }

    public CommStateDispatchingResourceActions targets(CommStateDispatchingResourceActionsTargets[] targets) {
        this.targets = targets;
        return this;
    }

    public CommStateDispatchingResourceActions customStartOffset(Long customStartOffset) {
        this.customStartOffset = customStartOffset;
        return this;
    }

    public CommStateDispatchingResourceActions duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public CommStateDispatchingResourceActions ringingTargetType(String ringingTargetType) {
        this.ringingTargetType = ringingTargetType;
        return this;
    }

    public CommStateDispatchingResourceActions terminatingTargetType(String terminatingTargetType) {
        this.terminatingTargetType = terminatingTargetType;
        return this;
    }
}
