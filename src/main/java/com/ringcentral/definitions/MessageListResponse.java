package com.ringcentral.definitions;


/**
 * List of messages retrieved for an account and other filter criteria such as `batchId` and `fromPhoneNumber` specified in the request
 */
public class MessageListResponse {
    /**
     * An array containing individual messages
     */
    public MessageListMessageResponse[] records;
    /**
     *
     */
    public NonEnumeratedPagingModel paging;

    public MessageListResponse records(MessageListMessageResponse[] records) {
        this.records = records;
        return this;
    }

    public MessageListResponse paging(NonEnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
