package com.ringcentral.definitions;


// Contains successfull and failed opt-ins
public class BulkAssignOptIns {
    /**
     * Recipients&#039; phone numbers which opt-ins were successfully added for.
     * Example: [&quot;15551237799&quot;]
     */
    public String[] successful;
    /**
     * Recipients&#039; phone numbers which opt-ins were failed to be added for. Plus, error messages
     * Example: [object Object]
     */
    public OptOutBulkAssignFailedEntry[] failed;

    public BulkAssignOptIns successful(String[] successful) {
        this.successful = successful;
        return this;
    }

    public BulkAssignOptIns failed(OptOutBulkAssignFailedEntry[] failed) {
        this.failed = failed;
        return this;
    }
}
