package com.ringcentral.definitions;


    /**
* Action information
*/
public class CommTerminatingActionRequest
{
    /**
     * Action type
     * Required
     * Example: TerminatingAction
     * Enum: PlayConnectingMessageAction, PlayConnectingPromptAction, PlayWelcomePromptAction, ScreeningAction, RingGroupAction, RingAlwaysGroupAction, TerminatingAction
     */
    public String type;
    public CommTerminatingActionRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Action information
     * Required
     */
    public CommTerminatingActionRequestTargets[] targets;
    public CommTerminatingActionRequest targets(CommTerminatingActionRequestTargets[] targets)
    {
        this.targets = targets;
        return this;
    }

    /**
     * Example: VoiceMailTerminatingTarget
     */
    public String ringingTargetType;
    public CommTerminatingActionRequest ringingTargetType(String ringingTargetType)
    {
        this.ringingTargetType = ringingTargetType;
        return this;
    }

    /**
     * Example: VoiceMailTerminatingTarget
     */
    public String terminatingTargetType;
    public CommTerminatingActionRequest terminatingTargetType(String terminatingTargetType)
    {
        this.terminatingTargetType = terminatingTargetType;
        return this;
    }
}