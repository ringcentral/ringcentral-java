package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommPlayWelcomePromptActionResource {
    /**
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

    public CommPlayWelcomePromptActionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommPlayWelcomePromptActionResource greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    public CommPlayWelcomePromptActionResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
