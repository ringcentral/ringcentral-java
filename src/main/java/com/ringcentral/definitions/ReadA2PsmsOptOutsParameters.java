package com.ringcentral.definitions;


public class ReadA2PsmsOptOutsParameters {
    /**
     * The sender's phone number (`from` field) in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format for filtering messages
     */
    public String from;
    /**
     * The reciever's phone number (`to` field) in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format for filtering messages
     */
    public String to;
    /**
     * Token of the page to be retrieved
     */
    public String pageToken;
    /**
     * Number of records to be returned for the page
     * Default: 1000
     */
    public Long perPage;

    public ReadA2PsmsOptOutsParameters from(String from) {
        this.from = from;
        return this;
    }

    public ReadA2PsmsOptOutsParameters to(String to) {
        this.to = to;
        return this;
    }

    public ReadA2PsmsOptOutsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ReadA2PsmsOptOutsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

}
