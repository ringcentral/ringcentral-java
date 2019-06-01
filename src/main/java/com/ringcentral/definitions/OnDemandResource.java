package com.ringcentral.definitions;


public class OnDemandResource {
    /**
     * Flag for controlling OnDemand Call Recording settings
     */
    public Boolean enabled;

    public OnDemandResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
