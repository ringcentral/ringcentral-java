package com.ringcentral.definitions;


public class CommInteractionDispatchingResource
{
    /**
     */
    public CommCallTypesResource callTypes;
    public CommInteractionDispatchingResource callTypes(CommCallTypesResource callTypes)
    {
        this.callTypes = callTypes;
        return this;
    }

    /**
     * Action information
     * Required
     */
    public CommInteractionDispatchingResourceActions[] actions;
    public CommInteractionDispatchingResource actions(CommInteractionDispatchingResourceActions[] actions)
    {
        this.actions = actions;
        return this;
    }

    /**
     * Call dispatching type
     * Required
     * Enum: RingAtOnce, RingInOrder, Custom, Terminate
     */
    public String type;
    public CommInteractionDispatchingResource type(String type)
    {
        this.type = type;
        return this;
    }
}