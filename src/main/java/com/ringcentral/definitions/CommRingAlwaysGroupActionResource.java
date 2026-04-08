package com.ringcentral.definitions;


    /**
* Action information
*/
public class CommRingAlwaysGroupActionResource
{
    /**
     * Required
     * Example: RingAlwaysGroupAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    public CommRingAlwaysGroupActionResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;
    public CommRingAlwaysGroupActionResource enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Required
     */
    public CommRingAlwaysGroupActionResourceTargets[] targets;
    public CommRingAlwaysGroupActionResource targets(CommRingAlwaysGroupActionResourceTargets[] targets)
    {
        this.targets = targets;
        return this;
    }
}