package com.ringcentral.definitions;


public class CreateGlipConversationRequest {
    /**
     * Identifier(s) of chat member(s). The maximum supported number of IDs is 15. User's own ID is optional. If `members` section is omitted then 'Personal' chat will be returned
     * Required
     */
    public Object[] members;

    public CreateGlipConversationRequest members(Object[] members) {
        this.members = members;
        return this;
    }

}
