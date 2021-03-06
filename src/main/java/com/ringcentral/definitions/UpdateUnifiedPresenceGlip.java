package com.ringcentral.definitions;


public class UpdateUnifiedPresenceGlip {
    /**
     * Visibility setting allowing other users to see Glip presence status
     * Enum: Visible, Invisible
     */
    public String visibility;
    /**
     * Availability setting specifying whether to receive Glip notifications or not
     * Enum: Available, DND
     */
    public String availability;

    public UpdateUnifiedPresenceGlip visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public UpdateUnifiedPresenceGlip availability(String availability) {
        this.availability = availability;
        return this;
    }
}
