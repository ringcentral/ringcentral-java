package com.ringcentral.definitions;


    /**
* Action information
*/
public class CommPlayConnectingPromptActionResource
{
    /**
     * Required
     * Example: PlayConnectingPromptAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    public CommPlayConnectingPromptActionResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommGreetingResource greeting;
    public CommPlayConnectingPromptActionResource greeting(CommGreetingResource greeting)
    {
        this.greeting = greeting;
        return this;
    }

    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;
    public CommPlayConnectingPromptActionResource enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
}