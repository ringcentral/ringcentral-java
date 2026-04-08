package com.ringcentral.definitions;

/** Action information */
public class CommScreeningActionRequest {
    /**
     * Action type Required Example: ScreeningAction Enum: PlayConnectingMessageAction,
     * PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction,
     * RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommScreeningActionRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Screening type Required Enum: NoCallerId, UnknownCallerId, Always */
    public String screening;

    public CommScreeningActionRequest screening(String screening) {
        this.screening = screening;
        return this;
    }

    /** Specifies if an action is enabled Required */
    public Boolean enabled;

    public CommScreeningActionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** Enum: AskToAnswer, PlayCallerNameOnly */
    public String screeningResult;

    public CommScreeningActionRequest screeningResult(String screeningResult) {
        this.screeningResult = screeningResult;
        return this;
    }
}
