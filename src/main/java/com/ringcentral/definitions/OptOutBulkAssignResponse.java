package com.ringcentral.definitions;


    /**
* The results of adding opt-outs and opt-ins
*/
public class OptOutBulkAssignResponse
{
    /**
     * Contains successful and failed opt-ins
     */
    public OptOutBulkAssignResponseOptIns optIns;
    public OptOutBulkAssignResponse optIns(OptOutBulkAssignResponseOptIns optIns)
    {
        this.optIns = optIns;
        return this;
    }

    /**
     * Contains successful and failed opt-outs
     */
    public OptOutBulkAssignResponseOptOuts optOuts;
    public OptOutBulkAssignResponse optOuts(OptOutBulkAssignResponseOptOuts optOuts)
    {
        this.optOuts = optOuts;
        return this;
    }
}