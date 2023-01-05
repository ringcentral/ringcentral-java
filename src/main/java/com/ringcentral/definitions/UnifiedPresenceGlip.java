package com.ringcentral.definitions;


    /**
* Returned if *Glip* feature is switched on
*/
public class UnifiedPresenceGlip
{
    /**
     * Glip connection status calculated from all user&#039;s apps. Returned always for the requester&#039;s extension; returned for another users if their glip visibility is set to &#039;Visible&#039;
     * Enum: Offline, Online
     */
    public String status;
    public UnifiedPresenceGlip status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Visibility setting allowing other users to see the user&#039;s Glip presence status; returned only for requester&#039;s extension
     * Enum: Visible, Invisible
     */
    public String visibility;
    public UnifiedPresenceGlip visibility(String visibility)
    {
        this.visibility = visibility;
        return this;
    }

    /**
     * Shows whether user wants to receive Glip notifications or not.
     * Enum: Available, DND
     */
    public String availability;
    public UnifiedPresenceGlip availability(String availability)
    {
        this.availability = availability;
        return this;
    }
}