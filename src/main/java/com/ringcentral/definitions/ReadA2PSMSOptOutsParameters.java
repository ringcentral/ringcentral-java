package com.ringcentral.definitions;


// Query parameters for operation readA2PSMSOptOuts
public class ReadA2PSMSOptOutsParameters {
    /**
     * The sender&#039;s phone number (`from` field) in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format for filtering messages
     * Example: 15551234455
     */
    public String from;
    /**
     * The reciever&#039;s phone number (`to` field) in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format for filtering messages
     * Example: 15551237755
     */
    public String to;
    /**
     * Token of the page to be retrieved
     */
    public String pageToken;
    /**
     * Number of records to be returned for the page
     * Format: int64
     * Example: 5
     * Default: 1000
     */
    public Long perPage;

    public ReadA2PSMSOptOutsParameters from(String from) {
        this.from = from;
        return this;
    }

    public ReadA2PSMSOptOutsParameters to(String to) {
        this.to = to;
        return this;
    }

    public ReadA2PSMSOptOutsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ReadA2PSMSOptOutsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
