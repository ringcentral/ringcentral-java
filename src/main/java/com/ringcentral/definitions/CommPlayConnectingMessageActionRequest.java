package com.ringcentral.definitions;


/**
 * Action information
 */
public class CommPlayConnectingMessageActionRequest {
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

    public CommPlayConnectingMessageActionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommPlayConnectingMessageActionRequest greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    public CommPlayConnectingMessageActionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
