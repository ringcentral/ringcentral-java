package com.ringcentral.definitions;


public class OptOutBulkAssignResponseOptOuts {
    /**
     * Recipients&#039; phone numbers which opt-outs were successfully added for.
     * Example: 15551237755
     */
    public String[] successful;
    /**
     * Recipients&#039; phone numbers which opt-outs were failed to be added for. Plus, error messages
     * Example: [object Object]
     */
    public OptOutBulkAssignFailedEntry[] failed;

    public OptOutBulkAssignResponseOptOuts successful(String[] successful) {
        this.successful = successful;
        return this;
    }

    public OptOutBulkAssignResponseOptOuts failed(OptOutBulkAssignFailedEntry[] failed) {
        this.failed = failed;
        return this;
    }
}
