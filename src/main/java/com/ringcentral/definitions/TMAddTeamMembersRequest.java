package com.ringcentral.definitions;


public class TMAddTeamMembersRequest
{
    /**
     * Identifier(s) of chat member(s)
     * Required
     */
    public TMAddTeamMembersRequestMembers[] members;
    public TMAddTeamMembersRequest members(TMAddTeamMembersRequestMembers[] members)
    {
        this.members = members;
        return this;
    }
}