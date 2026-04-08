package com.ringcentral.definitions;


public class CommStateDispatchingResourceActions
{
    /**
     * Action type
     * Example: TerminatingAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    public CommStateDispatchingResourceActions type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommGreetingResource greeting;
    public CommStateDispatchingResourceActions greeting(CommGreetingResource greeting)
    {
        this.greeting = greeting;
        return this;
    }

    /**
     * Specifies if an action is enabled
     */
    public Boolean enabled;
    public CommStateDispatchingResourceActions enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Screening type
     * Enum: NoCallerId, UnknownCallerId, Always
     */
    public String screening;
    public CommStateDispatchingResourceActions screening(String screening)
    {
        this.screening = screening;
        return this;
    }

    /**
     * Enum: AskToAnswer, PlayCallerNameOnly
     */
    public String screeningResult;
    public CommStateDispatchingResourceActions screeningResult(String screeningResult)
    {
        this.screeningResult = screeningResult;
        return this;
    }

    /**
     * Action information
     */
    public CommStateDispatchingResourceActionsTargets[] targets;
    public CommStateDispatchingResourceActions targets(CommStateDispatchingResourceActionsTargets[] targets)
    {
        this.targets = targets;
        return this;
    }

    /**
     * Custom start time in seconds. Applicable for &#039;Custom&#039; dispatching type
     * Format: int32
     * Example: 5
     */
    public Long customStartOffset;
    public CommStateDispatchingResourceActions customStartOffset(Long customStartOffset)
    {
        this.customStartOffset = customStartOffset;
        return this;
    }

    /**
     * Duration of calling in seconds
     * Format: int32
     * Example: 5
     */
    public Long duration;
    public CommStateDispatchingResourceActions duration(Long duration)
    {
        this.duration = duration;
        return this;
    }

    /**
     * Terminating target type
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String ringingTargetType;
    public CommStateDispatchingResourceActions ringingTargetType(String ringingTargetType)
    {
        this.ringingTargetType = ringingTargetType;
        return this;
    }

    /**
     * Terminating target type
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String terminatingTargetType;
    public CommStateDispatchingResourceActions terminatingTargetType(String terminatingTargetType)
    {
        this.terminatingTargetType = terminatingTargetType;
        return this;
    }
}