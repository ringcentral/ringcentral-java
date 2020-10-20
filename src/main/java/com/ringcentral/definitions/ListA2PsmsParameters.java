package com.ringcentral.definitions;


public class ListA2PsmsParameters {
    /**
     * Internal identifier of a message batch used for filtering records
     */
    public String batchId;
    /**
     * Token of a page to be retrieved
     */
    public String pageToken;
    /**
     * Number of messages to be returned per request
     * Default: 1000
     */
    public Long perPage;

    public ListA2PsmsParameters batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public ListA2PsmsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListA2PsmsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

}
