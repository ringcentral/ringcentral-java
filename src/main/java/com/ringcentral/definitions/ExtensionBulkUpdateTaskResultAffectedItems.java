package com.ringcentral.definitions;


public class ExtensionBulkUpdateTaskResultAffectedItems {
    /**
     *
     */
    public ExtensionUpdateShortResult[] result;

    public ExtensionBulkUpdateTaskResultAffectedItems result(ExtensionUpdateShortResult[] result) {
        this.result = result;
        return this;
    }
}
