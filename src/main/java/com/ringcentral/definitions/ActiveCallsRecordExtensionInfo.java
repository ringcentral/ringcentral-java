package com.ringcentral.definitions;


    /**
* Information about extension on whose behalf a call is initiated. For Secretary call log the Boss extension info is returned
*/
public class ActiveCallsRecordExtensionInfo
{
    /**
     * Link to an extension on whose behalf a call is initiated
     * Format: uri
     */
    public String uri;
    public ActiveCallsRecordExtensionInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of an extension on whose behalf a call is initiated
     */
    public String id;
    public ActiveCallsRecordExtensionInfo id(String id)
    {
        this.id = id;
        return this;
    }
}