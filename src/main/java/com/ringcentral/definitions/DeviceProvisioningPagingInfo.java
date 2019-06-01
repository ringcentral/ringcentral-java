package com.ringcentral.definitions;


public class DeviceProvisioningPagingInfo {
    /**
     * The current page number. 1-indexed, so the first page is 1 by default. May be omitted if result is empty (because non-existent page was specified or perPage=0 was requested)
     */
    public Long page;
    /**
     * Current page size, describes how many items are in each page. Default value is 100. Maximum value is 1000. If perPage value in the request is greater than 1000, the maximum value (1000) is applied
     */
    public Long perPage;
    /**
     * The zero-based number of the first element on the current page. Omitted if the page is omitted or result is empty
     */
    public Long pageStart;
    /**
     * The zero-based index of the last element on the current page. Omitted if the page is omitted or result is empty
     */
    public Long pageEnd;
    /**
     * The total number of pages in a dataset. May be omitted for some resources due to performance reasons
     */
    public Long totalPages;
    /**
     * The total number of elements in a dataset. May be omitted for some resource due to performance reasons
     */
    public Long totalElements;

    public DeviceProvisioningPagingInfo page(Long page) {
        this.page = page;
        return this;
    }

    public DeviceProvisioningPagingInfo perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public DeviceProvisioningPagingInfo pageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }

    public DeviceProvisioningPagingInfo pageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }

    public DeviceProvisioningPagingInfo totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public DeviceProvisioningPagingInfo totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

}
