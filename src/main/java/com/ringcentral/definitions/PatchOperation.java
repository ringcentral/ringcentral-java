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
     * corresponding 'value' of that field specified by 'path'
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
