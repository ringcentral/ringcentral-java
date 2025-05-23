package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommActionRequest {
    /**
     * Required
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommActionRequest type(String type) {
        this.type = type;
        return this;
    }
}
