package com.ringcentral.definitions;


    /**
* Action information
*/
public class CommPlayWelcomePromptActionResource
{
    /**
     * Required
     * Example: PlayWelcomePromptAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    public CommPlayWelcomePromptActionResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommGreetingResource greeting;
    public CommPlayWelcomePromptActionResource greeting(CommGreetingResource greeting)
    {
        this.greeting = greeting;
        return this;
    }

    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;
    public CommPlayWelcomePromptActionResource enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
}