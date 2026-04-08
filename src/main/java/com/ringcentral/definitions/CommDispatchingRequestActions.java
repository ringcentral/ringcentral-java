package com.ringcentral.definitions;

public class CommDispatchingRequestActions {
    /**
     * Action type Example: TerminatingAction Enum: PlayConnectingMessageAction,
     * PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction,
     * RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommDispatchingRequestActions type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommGreetingResource greeting;

    public CommDispatchingRequestActions greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    /** Specifies if an action is enabled */
    public Boolean enabled;

    public CommDispatchingRequestActions enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** Screening type Enum: NoCallerId, UnknownCallerId, Always */
    public String screening;

    public CommDispatchingRequestActions screening(String screening) {
        this.screening = screening;
        return this;
    }

    /** Enum: AskToAnswer, PlayCallerNameOnly */
    public String screeningResult;

    public CommDispatchingRequestActions screeningResult(String screeningResult) {
        this.screeningResult = screeningResult;
        return this;
    }

    /** Action information */
    public CommDispatchingRequestActionsTargets[] targets;

    public CommDispatchingRequestActions targets(CommDispatchingRequestActionsTargets[] targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Custom start time. Applicable for &#039;Custom&#039; dispatching type Format: int32 Example:
     * 5
     */
    public Long customStartOffset;

    public CommDispatchingRequestActions customStartOffset(Long customStartOffset) {
        this.customStartOffset = customStartOffset;
        return this;
    }

    /** Duration of calling Format: int32 Example: 5 */
    public Long duration;

    public CommDispatchingRequestActions duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /** Example: VoiceMailTerminatingTarget */
    public String ringingTargetType;

    public CommDispatchingRequestActions ringingTargetType(String ringingTargetType) {
        this.ringingTargetType = ringingTargetType;
        return this;
    }

    /** Example: VoiceMailTerminatingTarget */
    public String terminatingTargetType;

    public CommDispatchingRequestActions terminatingTargetType(String terminatingTargetType) {
        this.terminatingTargetType = terminatingTargetType;
        return this;
    }
}
