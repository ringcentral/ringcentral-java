package com.ringcentral.definitions;


public class UpdateSubscriptionParameters {
    /**
     * If 'True' then aggregated presence status is returned in a notification payload
     */
    public Boolean aggregated;

    public UpdateSubscriptionParameters aggregated(Boolean aggregated) {
        this.aggregated = aggregated;
        return this;
    }

}
