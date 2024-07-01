package com.ringcentral.definitions;


    /**
* Token endpoint request parameters used in the "Guest" authorization flow with the `guest` grant type
*/
public class GuestTokenRequest
{
    /**
     * Grant type
     * Enum: guest
     */
    public String grant_type;
    public GuestTokenRequest grant_type(String grant_type)
    {
        this.grant_type = grant_type;
        return this;
    }

    /**
     * RingCentral Brand identifier.
     */
    public String brand_id;
    public GuestTokenRequest brand_id(String brand_id)
    {
        this.brand_id = brand_id;
        return this;
    }

    /**
     * Resource type for the guest access.
     */
    public String resource_type;
    public GuestTokenRequest resource_type(String resource_type)
    {
        this.resource_type = resource_type;
        return this;
    }

    /**
     * Resource URL for the guest access.
     */
    public String resource;
    public GuestTokenRequest resource(String resource)
    {
        this.resource = resource;
        return this;
    }
}