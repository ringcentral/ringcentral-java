package com.ringcentral.definitions;


public class GlipPostMembersIdsListBody {
    /**
     * Identifier(s) of chat members.
     * Required
     */
    public Object[] members;

    public GlipPostMembersIdsListBody members(Object[] members) {
        this.members = members;
        return this;
    }

}
