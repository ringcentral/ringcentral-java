package com.ringcentral.definitions;


    /**
* Action information
*/
public class CommPlayWelcomePromptActionRequest
{
    /**
     * Prompt action type
     * Required
     * Example: PlayWelcomePromptAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    public CommPlayWelcomePromptActionRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommGreetingResource greeting;
    public CommPlayWelcomePromptActionRequest greeting(CommGreetingResource greeting)
    {
        this.greeting = greeting;
        return this;
    }

    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;
    public CommPlayWelcomePromptActionRequest enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
}