package com.ringcentral.definitions;


public class CreateGlipCardParameters {
    /**
     * Internal identifier of a group where to create a post with the card
     */
    public Long groupId;

    public CreateGlipCardParameters groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

}
