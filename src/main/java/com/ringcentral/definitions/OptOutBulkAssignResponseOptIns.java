package com.ringcentral.definitions;


public class OptOutBulkAssignResponseOptIns {
    /**
     * Recipients&#039; phone numbers which opt-ins were successfully added for.
     * Example: +15551237799
     */
    public String[] successful;
    /**
     * Recipients&#039; phone numbers which opt-ins were failed to be added for. Plus, error messages
     * Example: [object Object]
     */
    public OptOutBulkAssignFailedEntry[] failed;

    public OptOutBulkAssignResponseOptIns successful(String[] successful) {
        this.successful = successful;
        return this;
    }

    public OptOutBulkAssignResponseOptIns failed(OptOutBulkAssignFailedEntry[] failed) {
        this.failed = failed;
        return this;
    }
}
