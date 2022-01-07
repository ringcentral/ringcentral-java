package com.ringcentral.definitions;


// The results of adding opt-outs and opt-ins
public class OptOutBulkAssignResponse {
    /**
     *
     */
    public BulkAssignOptOuts optOuts;
    /**
     *
     */
    public BulkAssignOptIns optIns;

    public OptOutBulkAssignResponse optOuts(BulkAssignOptOuts optOuts) {
        this.optOuts = optOuts;
        return this;
    }

    public OptOutBulkAssignResponse optIns(BulkAssignOptIns optIns) {
        this.optIns = optIns;
        return this;
    }
}
