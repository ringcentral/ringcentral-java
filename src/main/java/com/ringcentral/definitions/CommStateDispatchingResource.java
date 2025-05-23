package com.ringcentral.definitions;


public class CommStateDispatchingResource {
    /**
     * Action information
     * Required
     */
    public CommStateDispatchingResourceActions[] actions;
    /**
     * Call dispatching type
     * Required
     * Enum: RingAtOnce, RingInOrder, Custom, Terminate
     */
    public String type;

    public CommStateDispatchingResource actions(CommStateDispatchingResourceActions[] actions) {
        this.actions = actions;
        return this;
    }

    public CommStateDispatchingResource type(String type) {
        this.type = type;
        return this;
    }
}
