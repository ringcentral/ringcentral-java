package com.ringcentral.definitions;


public class Reference {
    /**
     * Enum: PartnerId, CustomerDirectoryId
     */
    public String type;
    /**
     *
     */
    public String ref;

    public Reference type(String type) {
        this.type = type;
        return this;
    }

    public Reference ref(String ref) {
        this.ref = ref;
        return this;
    }

}
