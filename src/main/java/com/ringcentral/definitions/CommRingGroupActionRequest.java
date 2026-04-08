package com.ringcentral.definitions;


    /**
* Action information
*/
public class CommRingGroupActionRequest
{
    /**
     * Action type
     * Required
     * Example: RingGroupAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    public CommRingGroupActionRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Specifies if an action is enabled
     * Required
     */
    public Boolean enabled;
    public CommRingGroupActionRequest enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Required
     */
    public CommRingGroupActionRequestTargets[] targets;
    public CommRingGroupActionRequest targets(CommRingGroupActionRequestTargets[] targets)
    {
        this.targets = targets;
        return this;
    }

    /**
     * Custom start time. Applicable for &#039;Custom&#039; dispatching type
     * Format: int32
     * Example: 5
     */
    public Long customStartOffset;
    public CommRingGroupActionRequest customStartOffset(Long customStartOffset)
    {
        this.customStartOffset = customStartOffset;
        return this;
    }

    /**
     * Duration of calling
     * Required
     * Format: int32
     * Example: 5
     */
    public Long duration;
    public CommRingGroupActionRequest duration(Long duration)
    {
        this.duration = duration;
        return this;
    }
}