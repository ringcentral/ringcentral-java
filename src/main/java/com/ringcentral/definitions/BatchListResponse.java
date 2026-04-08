package com.ringcentral.definitions;


    /**
* The list of batches retrieved for an account and other filter criteria such as
* fromPhoneNumber, date specified in the request.
* 
*/
public class BatchListResponse
{
    /**
     * An array containing individual batches
     */
    public MessageBatchResponse[] records;
    public BatchListResponse records(MessageBatchResponse[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public NonEnumeratedPagingModel paging;
    public BatchListResponse paging(NonEnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}