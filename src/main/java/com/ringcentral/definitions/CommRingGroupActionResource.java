package com.ringcentral.definitions;


    /**
* Action information
*/
public class CommRingGroupActionResource
{
    /**
     * Action type
     * Required
     * Example: RingGroupAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    public CommRingGroupActionResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;
    public CommRingGroupActionResource enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Target information
     * Required
     */
    public CommRingGroupActionResourceTargets[] targets;
    public CommRingGroupActionResource targets(CommRingGroupActionResourceTargets[] targets)
    {
        this.targets = targets;
        return this;
    }

    /**
     * Custom start time in seconds. Applicable for &#039;Custom&#039; dispatching type
     * Format: int32
     * Example: 5
     */
    public Long customStartOffset;
    public CommRingGroupActionResource customStartOffset(Long customStartOffset)
    {
        this.customStartOffset = customStartOffset;
        return this;
    }

    /**
     * Duration of calling in seconds
     * Required
     * Format: int32
     * Example: 5
     */
    public Long duration;
    public CommRingGroupActionResource duration(Long duration)
    {
        this.duration = duration;
        return this;
    }
}