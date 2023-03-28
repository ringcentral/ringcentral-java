package com.ringcentral.definitions;


public class EmergencyLocationsPaging {
    /**
     * Required
     * Format: int32
     */
    public Long page;
    /**
     * Required
     * Format: int32
     */
    public Long totalPages;
    /**
     * Required
     * Format: int32
     */
    public Long perPage;
    /**
     * Required
     * Format: int32
     */
    public Long totalElements;
    /**
     * Required
     * Format: int32
     */
    public Long pageStart;
    /**
     * Required
     * Format: int32
     */
    public Long pageEnd;

    public EmergencyLocationsPaging page(Long page) {
        this.page = page;
        return this;
    }

    public EmergencyLocationsPaging totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public EmergencyLocationsPaging perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public EmergencyLocationsPaging totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public EmergencyLocationsPaging pageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }

    public EmergencyLocationsPaging pageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }
}
