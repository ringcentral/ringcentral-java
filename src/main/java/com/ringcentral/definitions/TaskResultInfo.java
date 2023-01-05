package com.ringcentral.definitions;


    /**
* Task detailed result. Returned for failed and completed tasks
*/
public class TaskResultInfo
{
    /**
     * Detailed task results by elements from initial request
     */
    public TaskResultRecord[] records;
    public TaskResultInfo records(TaskResultRecord[] records)
    {
        this.records = records;
        return this;
    }
}