package com.ringcentral.definitions;


public class CommDispatchingRequestActions {
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
    public CommDispatchingRequestActionsTargets[] targets;
    /**
     * Custom start time. Applicable for &#039;Custom&#039; dispatching type
     * Format: int32
     * Example: 5
     */
    public Long customStartOffset;
    /**
     * Duration of calling
     * Format: int32
     * Example: 5
     */
    public Long duration;
    /**
     * Example: VoiceMailTerminatingTarget
     */
    public String ringingTargetType;
    /**
     * Example: VoiceMailTerminatingTarget
     */
    public String terminatingTargetType;

    public CommDispatchingRequestActions type(String type) {
        this.type = type;
        return this;
    }

    public CommDispatchingRequestActions greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    public CommDispatchingRequestActions enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommDispatchingRequestActions screening(String screening) {
        this.screening = screening;
        return this;
    }

    public CommDispatchingRequestActions screeningResult(String screeningResult) {
        this.screeningResult = screeningResult;
        return this;
    }

    public CommDispatchingRequestActions targets(CommDispatchingRequestActionsTargets[] targets) {
        this.targets = targets;
        return this;
    }

    public CommDispatchingRequestActions customStartOffset(Long customStartOffset) {
        this.customStartOffset = customStartOffset;
        return this;
    }

    public CommDispatchingRequestActions duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public CommDispatchingRequestActions ringingTargetType(String ringingTargetType) {
        this.ringingTargetType = ringingTargetType;
        return this;
    }

    public CommDispatchingRequestActions terminatingTargetType(String terminatingTargetType) {
        this.terminatingTargetType = terminatingTargetType;
        return this;
    }
}
