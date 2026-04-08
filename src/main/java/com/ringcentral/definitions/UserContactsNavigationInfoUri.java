package com.ringcentral.definitions;


    /**
* Canonical URI for a corresponding page of a list
*/
public class UserContactsNavigationInfoUri
{
    /**
     * Format: uri
     */
    public String uri;
    public UserContactsNavigationInfoUri uri(String uri)
    {
        this.uri = uri;
        return this;
    }
}