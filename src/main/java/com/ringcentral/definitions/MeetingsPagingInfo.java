package com.ringcentral.definitions;


public class MeetingsPagingInfo
{
    /**
     * Format: int32
     */
    public Long page;
    public MeetingsPagingInfo page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Format: int32
     */
    public Long totalPages;
    public MeetingsPagingInfo totalPages(Long totalPages)
    {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Format: int32
     */
    public Long perPage;
    public MeetingsPagingInfo perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Format: int32
     */
    public Long totalElements;
    public MeetingsPagingInfo totalElements(Long totalElements)
    {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * Format: int32
     */
    public Long pageStart;
    public MeetingsPagingInfo pageStart(Long pageStart)
    {
        this.pageStart = pageStart;
        return this;
    }

    /**
     * Format: int32
     */
    public Long pageEnd;
    public MeetingsPagingInfo pageEnd(Long pageEnd)
    {
        this.pageEnd = pageEnd;
        return this;
    }
}