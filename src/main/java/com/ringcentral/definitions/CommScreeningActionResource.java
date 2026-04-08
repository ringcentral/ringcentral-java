package com.ringcentral.definitions;

/** Action information */
public class CommScreeningActionResource {
    /**
     * Action type Required Example: ScreeningAction Enum: PlayConnectingMessageAction,
     * PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction,
     * RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommScreeningActionResource type(String type) {
        this.type = type;
        return this;
    }

    /** Screening type Required Enum: NoCallerId, UnknownCallerId, Always */
    public String screening;

    public CommScreeningActionResource screening(String screening) {
        this.screening = screening;
        return this;
    }

    /** Specifies if an action is enabled */
    public Boolean enabled;

    public CommScreeningActionResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** Required Enum: AskToAnswer, PlayCallerNameOnly */
    public String screeningResult;

    public CommScreeningActionResource screeningResult(String screeningResult) {
        this.screeningResult = screeningResult;
        return this;
    }
}
