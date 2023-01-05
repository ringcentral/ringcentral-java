package com.ringcentral.definitions;


    /**
* Information on address book groups
*/
public class UserContactsGroupsInfo
{
    /**
     * Link to the list of address book groups
     * Format: uri
     */
    public String uri;
    public UserContactsGroupsInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }
}