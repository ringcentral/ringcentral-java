package com.ringcentral.definitions;

/** Action information */
public class CommPlayConnectingMessageActionResource {
    /**
     * Required Example: PlayConnectingMessageAction Enum: PlayConnectingMessageAction,
     * PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction,
     * RingAlwaysGroupAction, TerminatingAction
     */
    public String type;

    public CommPlayConnectingMessageActionResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommGreetingResource greeting;

    public CommPlayConnectingMessageActionResource greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }

    /** Specifies if an action is enabled Required */
    public Boolean enabled;

    public CommPlayConnectingMessageActionResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
