package com.ringcentral.definitions;


    /**
* Meeting host information
*/
public class HostInfoRequest
{
    /**
     * Link to the meeting host resource
     * Format: uri
     */
    public String uri;
    public HostInfoRequest uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of an extension which is assigned to be a meeting host. The default value is currently logged-in extension identifier
     */
    public String id;
    public HostInfoRequest id(String id)
    {
        this.id = id;
        return this;
    }
}