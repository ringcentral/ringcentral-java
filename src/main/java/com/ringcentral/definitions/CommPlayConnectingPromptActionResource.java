package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommPlayConnectingPromptActionResource {
    /**
     * Required
     * Example: PlayConnectingPromptAction
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

    public CommPlayConnectingPromptActionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommPlayConnectingPromptActionResource greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    public CommPlayConnectingPromptActionResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
