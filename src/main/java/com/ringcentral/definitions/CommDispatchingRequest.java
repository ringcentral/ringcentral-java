package com.ringcentral.definitions;


public class CommDispatchingRequest {
    /**
     *
     */
    public CommCallTypesResource callTypes;
    /**
     * Action information
     * Required
     */
    public CommDispatchingRequestActions[] actions;
    /**
     * Call dispatching type
     * Required
     * Enum: RingAtOnce, RingInOrder, Custom, Terminate
     */
    public String type;

    public CommDispatchingRequest callTypes(CommCallTypesResource callTypes) {
        this.callTypes = callTypes;
        return this;
    }

    public CommDispatchingRequest actions(CommDispatchingRequestActions[] actions) {
        this.actions = actions;
        return this;
    }

    public CommDispatchingRequest type(String type) {
        this.type = type;
        return this;
    }
}
