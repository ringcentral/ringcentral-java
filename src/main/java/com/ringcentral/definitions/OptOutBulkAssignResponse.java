package com.ringcentral.definitions;


/**
 * The results of adding opt-outs and opt-ins
 */
public class OptOutBulkAssignResponse {
    /**
     * Contains successful and failed opt-ins
     */
    public OptOutBulkAssignResponseOptIns optIns;
    /**
     * Contains successful and failed opt-outs
     */
    public OptOutBulkAssignResponseOptOuts optOuts;

    public OptOutBulkAssignResponse optIns(OptOutBulkAssignResponseOptIns optIns) {
        this.optIns = optIns;
        return this;
    }

    public OptOutBulkAssignResponse optOuts(OptOutBulkAssignResponseOptOuts optOuts) {
        this.optOuts = optOuts;
        return this;
    }
}
