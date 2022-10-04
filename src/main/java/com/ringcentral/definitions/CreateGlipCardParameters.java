package com.ringcentral.definitions;


/**
 * Query parameters for operation createGlipCard
 */
public class CreateGlipCardParameters {
    /**
     * Internal identifier of a group where to create a post with the card
     * Format: int64
     */
    public Long groupId;

    public CreateGlipCardParameters groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
}
