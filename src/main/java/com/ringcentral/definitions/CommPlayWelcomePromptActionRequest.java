package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommPlayWelcomePromptActionRequest {
    /**
     * Ring target type
     * Required
     * Example: PlayWelcomePromptAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    /**
     * Required
     */
    public CommGreetingResource greeting;
    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;

    public CommPlayWelcomePromptActionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommPlayWelcomePromptActionRequest greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    public CommPlayWelcomePromptActionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
