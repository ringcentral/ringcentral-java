package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommScreeningActionRequest {
    /**
     * Action type
     * Required
     * Example: ScreeningAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    /**
     * Screening type
     * Required
     * Enum: NoCallerId, UnknownCallerId, Always
     */
    public String screening;
    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;
    /**
     * Enum: AskToAnswer, PlayCallerNameOnly
     */
    public String screeningResult;

    public CommScreeningActionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommScreeningActionRequest screening(String screening) {
        this.screening = screening;
        return this;
    }

    public CommScreeningActionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommScreeningActionRequest screeningResult(String screeningResult) {
        this.screeningResult = screeningResult;
        return this;
    }
}
