package com.ringcentral.definitions;


public class CommDispatchingRequest
{
    /**
     */
    public CommCallTypesResource callTypes;
    public CommDispatchingRequest callTypes(CommCallTypesResource callTypes)
    {
        this.callTypes = callTypes;
        return this;
    }

    /**
     * Action information
     * Required
     */
    public CommDispatchingRequestActions[] actions;
    public CommDispatchingRequest actions(CommDispatchingRequestActions[] actions)
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
    public CommDispatchingRequest type(String type)
    {
        this.type = type;
        return this;
    }
}