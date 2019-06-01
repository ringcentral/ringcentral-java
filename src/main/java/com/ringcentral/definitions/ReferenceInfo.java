package com.ringcentral.definitions;


public class ReferenceInfo {
    /**
     * Non-RC identifier of an extension
     */
    public String ref;
    /**
     * Type of external identifier
     * Enum: PartnerId, CustomerDirectoryId
     */
    public String type;

    public ReferenceInfo ref(String ref) {
        this.ref = ref;
        return this;
    }

    public ReferenceInfo type(String type) {
        this.type = type;
        return this;
    }

}
