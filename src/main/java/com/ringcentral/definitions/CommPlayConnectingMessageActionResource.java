package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommPlayConnectingMessageActionResource {
    /**
     * Required
     * Example: PlayConnectingMessageAction
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

    public CommPlayConnectingMessageActionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommPlayConnectingMessageActionResource greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    public CommPlayConnectingMessageActionResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
