package com.ringcentral.definitions;


/**
 * State-based rule update request
 */
public class CommStateBasedRuleUpdateRequest {
    /**
     *
     */
    public CommDispatchingRequest dispatching;

    public CommStateBasedRuleUpdateRequest dispatching(CommDispatchingRequest dispatching) {
        this.dispatching = dispatching;
        return this;
    }
}
