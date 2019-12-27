package com.ringcentral.definitions;


public class GlipPostMembersIdsListBody {
    /**
     * Identifier(s) of chat members.
     * Required
     */
    public GlipMemberInfo[] members;

    public GlipPostMembersIdsListBody members(GlipMemberInfo[] members) {
        this.members = members;
        return this;
    }

}
