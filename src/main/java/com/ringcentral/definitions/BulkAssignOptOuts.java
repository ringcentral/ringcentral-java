package com.ringcentral.definitions;


// Contains successfull and failed opt-outs
public class BulkAssignOptOuts {
    /**
     * Recipients&#039; phone numbers which opt-outs were successfully added for.
     * Example: [&quot;15551237755&quot;]
     */
    public String[] successful;
    /**
     * Recipients&#039; phone numbers which opt-outs were failed to be added for. Plus, error messages
     * Example: [object Object]
     */
    public OptOutBulkAssignFailedEntry[] failed;

    public BulkAssignOptOuts successful(String[] successful) {
        this.successful = successful;
        return this;
    }

    public BulkAssignOptOuts failed(OptOutBulkAssignFailedEntry[] failed) {
        this.failed = failed;
        return this;
    }
}
