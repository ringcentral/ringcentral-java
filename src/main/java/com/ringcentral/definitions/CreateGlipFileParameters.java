package com.ringcentral.definitions;


/**
 * Query parameters for operation createGlipFile
 */
public class CreateGlipFileParameters {
    /**
     * Internal identifier of a group to which the post with attachment will be added to
     * Format: int64
     */
    public Long groupId;
    /**
     * Name of a file attached
     */
    public String name;

    public CreateGlipFileParameters groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public CreateGlipFileParameters name(String name) {
        this.name = name;
        return this;
    }
}
