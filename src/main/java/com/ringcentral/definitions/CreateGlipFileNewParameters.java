package com.ringcentral.definitions;


/**
 * Query parameters for operation createGlipFileNew
 */
public class CreateGlipFileNewParameters {
    /**
     * Internal identifier of a group to which the post with attachment
     * will be added to
     * Format: int64
     */
    public Long groupId;
    /**
     * Name of a file attached
     */
    public String name;

    public CreateGlipFileNewParameters groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public CreateGlipFileNewParameters name(String name) {
        this.name = name;
        return this;
    }
}
