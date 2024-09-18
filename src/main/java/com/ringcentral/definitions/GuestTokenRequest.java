package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Guest" authorization flow
 * with the `guest` grant type
 */
public class GuestTokenRequest {
    /**
     * Grant type
     * Required
     * Enum: guest
     */
    public String grant_type;
    /**
     * RingCentral Brand identifier.
     */
    public String brand_id;
    /**
     * Resource type for the guest access.
     * Required
     */
    public String resource_type;
    /**
     * Resource URL for the guest access.
     * Required
     */
    public String resource;

    public GuestTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public GuestTokenRequest brand_id(String brand_id) {
        this.brand_id = brand_id;
        return this;
    }

    public GuestTokenRequest resource_type(String resource_type) {
        this.resource_type = resource_type;
        return this;
    }

    public GuestTokenRequest resource(String resource) {
        this.resource = resource;
        return this;
    }
}
