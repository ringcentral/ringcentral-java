package com.ringcentral.definitions;


public class CommInteractionDispatchingResource {
    /**
     *
     */
    public CommCallTypesResource callTypes;
    /**
     * Action information
     * Required
     */
    public CommInteractionDispatchingResourceActions[] actions;
    /**
     * Call dispatching type
     * Required
     * Enum: RingAtOnce, RingInOrder, Custom, Terminate
     */
    public String type;

    public CommInteractionDispatchingResource callTypes(CommCallTypesResource callTypes) {
        this.callTypes = callTypes;
        return this;
    }

    public CommInteractionDispatchingResource actions(CommInteractionDispatchingResourceActions[] actions) {
        this.actions = actions;
        return this;
    }

    public CommInteractionDispatchingResource type(String type) {
        this.type = type;
        return this;
    }
}
