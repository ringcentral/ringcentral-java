package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommScreeningActionResource {
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
     */
    public Boolean enabled;
    /**
     * Required
     * Enum: AskToAnswer, PlayCallerNameOnly
     */
    public String screeningResult;

    public CommScreeningActionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommScreeningActionResource screening(String screening) {
        this.screening = screening;
        return this;
    }

    public CommScreeningActionResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommScreeningActionResource screeningResult(String screeningResult) {
        this.screeningResult = screeningResult;
        return this;
    }
}
