package com.ringcentral.definitions;


public class ScimPatchOperation {
    /**
     * Required
     * Enum: add, replace, remove
     */
    public String op;
    /**
     *
     */
    public String path;
    /**
     * Corresponding &#039;value&#039; of that field specified by &#039;path&#039;
     */
    public String value;

    public ScimPatchOperation op(String op) {
        this.op = op;
        return this;
    }

    public ScimPatchOperation path(String path) {
        this.path = path;
        return this;
    }

    public ScimPatchOperation value(String value) {
        this.value = value;
        return this;
    }
}
