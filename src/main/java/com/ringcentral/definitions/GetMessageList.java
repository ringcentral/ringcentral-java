package com.ringcentral.definitions;


public class GetMessageList {
    /**
     * Link to a list of user messages
     * Format: uri
     */
    public String uri;
    /**
     * List of records with message information
     * Required
     */
    public GetMessageInfoResponse[] records;
    /**
     * Required
     */
    public MessagingNavigationInfo navigation;
    /**
     * Required
     */
    public MessagingPagingInfo paging;

    public GetMessageList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetMessageList records(GetMessageInfoResponse[] records) {
        this.records = records;
        return this;
    }

    public GetMessageList navigation(MessagingNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetMessageList paging(MessagingPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
