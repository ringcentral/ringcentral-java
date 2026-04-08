package com.ringcentral.definitions;


    /**
* Query parameters for operation disconnectTeamsUsers
*/
public class DisconnectTeamsUsersParameters
{
    /**
     * List of extension IDs to filter the list of Microsoft Teams Direct Routing users
     */
    public String[] extensionIds;
    public DisconnectTeamsUsersParameters extensionIds(String[] extensionIds)
    {
        this.extensionIds = extensionIds;
        return this;
    }
}