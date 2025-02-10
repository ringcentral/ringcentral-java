package com.ringcentral.definitions;


/**
 * Voicemail owner information. Supported for shared voicemail messages only
 */
public class VoicemailOwnerResource {
    /**
     * Name of a voicemail owner
     */
    public String name;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;

    public VoicemailOwnerResource name(String name) {
        this.name = name;
        return this;
    }

    public VoicemailOwnerResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
