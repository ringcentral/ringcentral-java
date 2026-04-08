package com.ringcentral.definitions;


public class TMRemoveTeamMembersRequest
{
    /**
     * Identifier(s) of chat members.
     * Required
     */
    public TMRemoveTeamMembersRequestMembers[] members;
    public TMRemoveTeamMembersRequest members(TMRemoveTeamMembersRequestMembers[] members)
    {
        this.members = members;
        return this;
    }
}