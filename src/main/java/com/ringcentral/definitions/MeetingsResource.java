package com.ringcentral.definitions;


public class MeetingsResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public MeetingResponseResource[] records;
    /**
     *
     */
    public EnumeratedPagingModel paging;
    /**
     *
     */
    public PageNavigationModel navigation;

    public MeetingsResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingsResource records(MeetingResponseResource[] records) {
        this.records = records;
        return this;
    }

    public MeetingsResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    public MeetingsResource navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
