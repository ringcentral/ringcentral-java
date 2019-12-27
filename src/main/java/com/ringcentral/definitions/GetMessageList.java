package com.ringcentral.definitions;


public class GetMessageList {
    /**
     * Link to the list of user messages
     */
    public String uri;
    /**
     * List of records with message information
     * Required
     */
    public GetMessageInfoResponse[] records;
    /**
     * Information on navigation
     * Required
     */
    public MessagingNavigationInfo navigation;
    /**
     * Information on paging
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
