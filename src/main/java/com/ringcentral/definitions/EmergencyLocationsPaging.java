package com.ringcentral.definitions;


public class EmergencyLocationsPaging
{
    /**
     * Required
     * Format: int32
     */
    public Long page;
    public EmergencyLocationsPaging page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Required
     * Format: int32
     */
    public Long totalPages;
    public EmergencyLocationsPaging totalPages(Long totalPages)
    {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Required
     * Format: int32
     */
    public Long perPage;
    public EmergencyLocationsPaging perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Required
     * Format: int32
     */
    public Long totalElements;
    public EmergencyLocationsPaging totalElements(Long totalElements)
    {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * Required
     * Format: int32
     */
    public Long pageStart;
    public EmergencyLocationsPaging pageStart(Long pageStart)
    {
        this.pageStart = pageStart;
        return this;
    }

    /**
     * Required
     * Format: int32
     */
    public Long pageEnd;
    public EmergencyLocationsPaging pageEnd(Long pageEnd)
    {
        this.pageEnd = pageEnd;
        return this;
    }
}