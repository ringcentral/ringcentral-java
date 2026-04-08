package com.ringcentral.definitions;

/** Action information */
public class CommPlayConnectingPromptActionRequest {
    /**
     * Required Example: PlayConnectingPromptAction Enum: PlayConnectingMessageAction,
     * PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction,
     * RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommPlayConnectingPromptActionRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommGreetingResource greeting;

    public CommPlayConnectingPromptActionRequest greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    /** Specifies if an action is enabled Required */
    public Boolean enabled;

    public CommPlayConnectingPromptActionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
