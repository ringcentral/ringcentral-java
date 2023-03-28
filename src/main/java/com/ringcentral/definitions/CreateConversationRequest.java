package com.ringcentral.definitions;


public class CreateConversationRequest {
    /**
     * Identifier(s) of chat member(s). The maximum supported number of IDs is 15. User&#039;s own ID is optional. If `members` section is omitted then &#039;Personal&#039; chat will be returned
     * Required
     */
    public CreateConversationRequestMembers[] members;

    public CreateConversationRequest members(CreateConversationRequestMembers[] members) {
        this.members = members;
        return this;
    }
}
