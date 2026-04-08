package com.ringcentral.definitions;


public class WcsSessionGeneratedModel
{
    /**
     * The RCV bridge id
     * Example: 839874770
     */
    public String videoBridgeId;
    public WcsSessionGeneratedModel videoBridgeId(String videoBridgeId)
    {
        this.videoBridgeId = videoBridgeId;
        return this;
    }

    /**
     * The RCV bridge password. Returned only if requested by Host/Co-host/Panelist and a password for the bridge is set.
     * Format: password
     * Example: abc123
     */
    public String videoBridgePassword;
    public WcsSessionGeneratedModel videoBridgePassword(String videoBridgePassword)
    {
        this.videoBridgePassword = videoBridgePassword;
        return this;
    }

    /**
     * The RCV bridge PSTN password. Returned only if requested by Host/Co-host/Panelist and a PSTN password for the bridge is set.
     * Format: password
     * Example: abc123
     */
    public String videoBridgePstnPassword;
    public WcsSessionGeneratedModel videoBridgePstnPassword(String videoBridgePstnPassword)
    {
        this.videoBridgePstnPassword = videoBridgePstnPassword;
        return this;
    }

    /**
     * The URI for attendees to join the Webinar (if it is a public webinar)
     * Format: uri
     * Example: https://v.ringcentral.com/w/a/join/iuyef77fsj473wn10ashjfk34
     */
    public String attendeeJoinUri;
    public WcsSessionGeneratedModel attendeeJoinUri(String attendeeJoinUri)
    {
        this.attendeeJoinUri = attendeeJoinUri;
        return this;
    }

    /**
     * Calculated attribute indicating if there are any unsent/deferred invites to session participants
     */
    public Boolean hasUnsentInvites;
    public WcsSessionGeneratedModel hasUnsentInvites(Boolean hasUnsentInvites)
    {
        this.hasUnsentInvites = hasUnsentInvites;
        return this;
    }
}