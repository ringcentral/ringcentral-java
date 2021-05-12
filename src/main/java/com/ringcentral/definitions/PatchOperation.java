package com.ringcentral.definitions;


public class PatchOperation {
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
     * corresponding &#039;value&#039; of that field specified by &#039;path&#039;
     */
    public String value;

    public PatchOperation op(String op) {
        this.op = op;
        return this;
    }

    public PatchOperation path(String path) {
        this.path = path;
        return this;
    }

    public PatchOperation value(String value) {
        this.value = value;
        return this;
    }
}
