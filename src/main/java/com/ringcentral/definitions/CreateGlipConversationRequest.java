package com.ringcentral.definitions;


public class CreateGlipConversationRequest {
    /**
     * List of glip members. The maximum supported number of IDs is 15. User&#039;s own ID is optional. If `members` section is omitted then &#039;Personal&#039; chat will be returned
     * Required
     */
    public CreateGlipMember[] members;

    public CreateGlipConversationRequest members(CreateGlipMember[] members) {
        this.members = members;
        return this;
    }
}
