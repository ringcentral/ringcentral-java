package com.ringcentral.definitions;


    /**
* Call recording data. Returned if the call was recorded
*/
public class CallLogRecordingInfo
{
    /**
     * Internal identifier of the call recording
     */
    public String id;
    public CallLogRecordingInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link to the call recording metadata resource
     * Format: uri
     */
    public String uri;
    public CallLogRecordingInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Indicates recording mode used
     * Enum: Automatic, OnDemand
     */
    public String type;
    public CallLogRecordingInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Link to a call recording binary content. Has to be retrieved with proper authorization
    * (access token must be passed via `Authorization` header or query parameter)
     * Format: uri
     */
    public String contentUri;
    public CallLogRecordingInfo contentUri(String contentUri)
    {
        this.contentUri = contentUri;
        return this;
    }
}