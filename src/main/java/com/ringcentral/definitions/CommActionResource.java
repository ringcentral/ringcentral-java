package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommActionResource {
    /**
     * Required
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommActionResource type(String type) {
        this.type = type;
        return this;
    }
}
