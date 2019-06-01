package com.ringcentral.definitions;


public class MeetingsResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public MeetingResponseResource[] records;
    /**
     *
     */
    public MeetingsPagingInfo paging;
    /**
     *
     */
    public MeetingsNavigationInfo navigation;

    public MeetingsResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingsResource records(MeetingResponseResource[] records) {
        this.records = records;
        return this;
    }

    public MeetingsResource paging(MeetingsPagingInfo paging) {
        this.paging = paging;
        return this;
    }

    public MeetingsResource navigation(MeetingsNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}
