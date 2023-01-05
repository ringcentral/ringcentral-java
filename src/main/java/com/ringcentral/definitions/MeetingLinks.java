package com.ringcentral.definitions;


    /**
* Meeting links
*/
public class MeetingLinks
{
    /**
     * Format: uri
     */
    public String startUri;
    public MeetingLinks startUri(String startUri)
    {
        this.startUri = startUri;
        return this;
    }

    /**
     * Format: uri
     */
    public String joinUri;
    public MeetingLinks joinUri(String joinUri)
    {
        this.joinUri = joinUri;
        return this;
    }
}