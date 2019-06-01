package com.ringcentral.definitions;


public class GlipPostMembersListBody {
    /**
     * Identifier(s) of chat member(s)
     * Required
     */
    public Object[] members;

    public GlipPostMembersListBody members(Object[] members) {
        this.members = members;
        return this;
    }

}
