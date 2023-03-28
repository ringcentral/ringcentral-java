package com.ringcentral.definitions;


/**
 * Query parameters for operation patchNoteNew
 */
public class PatchNoteNewParameters {
    /**
     * If true then note lock (if any) will be released upon request
     */
    public Boolean releaseLock;

    public PatchNoteNewParameters releaseLock(Boolean releaseLock) {
        this.releaseLock = releaseLock;
        return this;
    }
}
