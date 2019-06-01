package com.ringcentral.definitions;


public class MeetingsPagingInfo {
    /**
     *
     */
    public Long page;
    /**
     *
     */
    public Long totalPages;
    /**
     *
     */
    public Long perPage;
    /**
     *
     */
    public Long totalElements;
    /**
     *
     */
    public Long pageStart;
    /**
     *
     */
    public Long pageEnd;

    public MeetingsPagingInfo page(Long page) {
        this.page = page;
        return this;
    }

    public MeetingsPagingInfo totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public MeetingsPagingInfo perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public MeetingsPagingInfo totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public MeetingsPagingInfo pageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }

    public MeetingsPagingInfo pageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }

}
