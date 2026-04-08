package com.ringcentral.definitions;


    /**
* A list of SMS consent records
*/
public class OptRecordList
{
    /**
     * Required
     */
    public SmsOptRecord[] records;
    public OptRecordList records(SmsOptRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public NonEnumeratedPagingModel paging;
    public OptRecordList paging(NonEnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}