package com.ringcentral.definitions;


// Returned if *Glip* feature is switched on
public class UnifiedPresenceGlip {
    /**
     * Glip connection status calculated from all user's apps. Returned always for the requester's extension; returned for another users if their glip visibility is set to 'Visible'
     * Enum: Offline, Online
     */
    public String status;
    /**
     * Visibility setting allowing other users to see the user's Glip presence status; returned only for requester's extension
     * Enum: Visible, Invisible
     */
    public String visibility;
    /**
     * Shows whether user wants to receive Glip notifications or not.
     * Enum: Available, DND
     */
    public String availability;

    public UnifiedPresenceGlip status(String status) {
        this.status = status;
        return this;
    }

    public UnifiedPresenceGlip visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public UnifiedPresenceGlip availability(String availability) {
        this.availability = availability;
        return this;
    }

}
