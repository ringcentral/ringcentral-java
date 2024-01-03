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
    /**
     * Primary federation admin account identifier
     */
    public String refAccId;

    public ReferenceInfo ref(String ref) {
        this.ref = ref;
        return this;
    }

    public ReferenceInfo type(String type) {
        this.type = type;
        return this;
    }

    public ReferenceInfo refAccId(String refAccId) {
        this.refAccId = refAccId;
        return this;
    }
}
